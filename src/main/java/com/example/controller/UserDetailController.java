package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MWork;
import com.example.form.UserDetailForm;
import com.example.service.WorkService;

@Controller
@RequestMapping("/user")
public class UserDetailController {
  
  @Autowired
  private WorkService userService;
  
  @Autowired
  private ModelMapper modelMapper;
  
  // 作品詳細画面を表示
  @GetMapping("/detail/{workId:.+}")
  public String getUser(UserDetailForm form, Model model, @PathVariable("workId") String userId) {
    // 作品を1件取得
    MWork work = userService.getUserOne(userId);
    // Userをformに変換
    form = modelMapper.map(work, UserDetailForm.class);
    // Modelに登録
    model.addAttribute("userDetailForm", form);
    // ユーザー詳細画面を表示
    return "user/detail";
  }
}
