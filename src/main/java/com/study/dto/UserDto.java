package com.study.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class UserDto {
    /** 회원 아이디 */
    private String userId;
    /** 회원 비밀번호 */
    private String userPw;
    /** 회원 이름 */
    private String userName;
    /** 회원 이메일 */
    private String userEmail;
}
