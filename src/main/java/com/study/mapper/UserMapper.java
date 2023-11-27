package com.study.mapper;

import com.study.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserMapper {

    /**
     * 회원가입
     */
    int insUser(Map<String, Object> paramMap);

    /**
     * 회원목록 조회
     */
    List<Map<String, Object>> selUserList();

    /**
     * 회원정보 조회
     */
    Map<String, Object> selUserById(Map<String, Object> paramMap);

    /**
     * 회원정보 수정
     */
    int updtUser(Map<String, Object> paramMap);

    /**
     * 회원정보 삭제
     */
    int delUser(Map<String, Object> paramMap);

}
