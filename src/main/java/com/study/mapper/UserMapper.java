package com.study.mapper;

import com.study.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<UserDto> selUserList();

    public List<UserDto> getUserById(String userId);

    void insUser(UserDto userDto);

    void updtUser(UserDto userDto);

    void delUser(String userId);

}
