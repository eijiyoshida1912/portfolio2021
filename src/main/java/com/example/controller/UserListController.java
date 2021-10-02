package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MWork;
import com.example.form.UserListForm;
import com.example.service.WorkService;

@Controller
@RequestMapping("/user")
public class UserListController {
  @Autowired
  private WorkService workService;
  
  @Autowired
  private ModelMapper modelMapper;
  
  // ユーザー一覧画面を表示
  @GetMapping("/list")
  public String getWorkList(@ModelAttribute UserListForm form, Model model) {
    // formをMUserクラスに変換
    MWork work = modelMapper.map(form, MWork.class);
    // ユーザー検索
    List<MWork> workList = workService.getWorks(work);
    // Modelに登録
    model.addAttribute("workList", workList);
    // ユーザー一覧画面を表示
    return "user/list";
  }
}
