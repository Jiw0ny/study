package com.study.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class UserDto {

    private String userId;

    private String userPw;

    private String userName;

    private String userEmail;
}
