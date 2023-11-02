package com.study.service;

import com.study.dto.UserDto;
import com.study.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserMapper userMapper;

    /**
     * 회원 정보 조회
     */
    public List<UserDto> selUserList() {
        return userMapper.selUserList();
    }

    public List<UserDto> getUserById(Long userId) {
        return userMapper.getUserById(String.valueOf(userId));
    }

    /**
     * 회원 등록
     */
    public void insUser(UserDto userDto) {
        userMapper.insUser(userDto);
    }
    /**
     * 회원 정보 수정
     */
    public void updtUser(UserDto userDto) {
        userMapper.updtUser(userDto);
    }
    /**
     * 회원 정보 삭제
     */
    public void delUser(String userId) {
        userMapper.delUser(userId);
    }

}
