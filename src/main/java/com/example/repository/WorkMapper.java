package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MWork;

@Mapper
public interface WorkMapper {

  /* 作品取得 */
  public List<MWork> findMany(MWork work);
  
  // ユーザー取得(1件)
  public MWork findOne(String workId);
}
