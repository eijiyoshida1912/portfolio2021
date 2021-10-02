package com.example.domain.user.model;

import java.util.Date;

import lombok.Data;

@Data
public class MWork {
  private String workId;
  private String imageUrl;
  private Date workDate;
  private String title;
  private String comment;
}
