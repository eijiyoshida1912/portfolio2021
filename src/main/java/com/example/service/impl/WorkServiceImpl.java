package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MWork;
import com.example.repository.WorkMapper;
import com.example.service.WorkService;

@Service
public class WorkServiceImpl implements WorkService {

  @Autowired
  private WorkMapper mapper;

  // ユーザー取得
  @Override
  public List<MWork> getWorks(MWork work) {
    return mapper.findMany(work);
  }

  // ユーザー取得(1件)
  @Override
  public MWork getUserOne(String workId) {
    return mapper.findOne(workId);
  }
}
