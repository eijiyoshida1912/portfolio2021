package com.example.service;

import java.util.List;

import com.example.domain.user.model.MWork;

public interface WorkService {
  // 作品取得
  public List<MWork> getWorks(MWork work);
  // 作品取得(1件)
  public MWork getUserOne(String workId);
}