package com.example.form;

import java.util.Date;

import lombok.Data;

@Data
public class UserDetailForm {
  private String workId;
  private String imageUrl;
  private Date workDate;
  private String title;
  private String comment;
}
