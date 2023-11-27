package com.study.service;

import com.study.dto.UserDto;
import com.study.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserMapper userMapper;

    /**
     * 회원목록 조회
     * @return 멤버 리스트
     */
    public List<Map<String, Object>> selMemberList() {
        return userMapper.selUserList();
    }

    /**
     * 회원 가입
     * @param paramMap 등록 정보
     * @return 등록 결과
     */
    public Map<String, Object> insUser(Map<String, Object> paramMap) {
        Map<String, Object> retMap = new HashMap<>();
        int result = 0;
        result = userMapper.insUser(paramMap);
        if (result > 0) {
            retMap.put("result", true);
        } else {
            retMap.put("result", false);
        }
        return retMap;
    }

    /**
     * 회원정보 조회
     * @param paramMap id
     * @return 멤버 정보
     */
    public Map<String, Object> selUserById(Map<String, Object> paramMap) {
        return userMapper.selUserById(paramMap);
    }

    /**
     * 회원정보 수정
     * @param paramMap 수정된 정보
     * @return 수정 결과
     */
    public Map<String, Object> updtUser(Map<String, Object> paramMap) {
        Map<String, Object> retMap = new HashMap<>();
        int result = 0;
        result = userMapper.updtUser(paramMap);
        if (result > 0) {
            retMap.put("result", true);
        } else {
            retMap.put("result", false);
        }

        return retMap;
    }

    /**
     * 회원정보 삭제
     * @param paramMap id
     * @return 삭제 결과
     */
    public Map<String, Object> delUser(Map<String, Object> paramMap) {
        Map<String, Object> retMap = new HashMap<>();
        int result = 0;
        result = userMapper.delUser(paramMap);
        if (result > 0) {
            retMap.put("result", true);
        } else {
            retMap.put("result", false);
        }

        return retMap;
    }

}
