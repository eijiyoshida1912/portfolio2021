package com.example.service;

import java.util.List;

import com.example.domain.user.model.MUser;

public interface UserService {
  // ユーザー取得
  public List<MUser> getUsers(MUser user);
  // ユーザー取得(1件)
  public MUser getUserOne(String userId);
}