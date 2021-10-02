package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.repository.UserMapper;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper mapper;

  // ユーザー取得
  @Override
  public List<MUser> getUsers(MUser user) {
    return mapper.findMany(user);
  }

  // ユーザー取得(1件)
  @Override
  public MUser getUserOne(String userId) {
    return mapper.findOne(userId);
  }
}
