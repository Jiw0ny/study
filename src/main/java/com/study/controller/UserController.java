package com.study.controller;

import com.study.dto.UserDto;
import com.study.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping({"/user"})
public class UserController {

    private UserService userService;


    @GetMapping("/join.do")
    public ModelAndView join(){
        ModelAndView mav = new ModelAndView("user/join");
        return mav;
    }

    /**
     * 회원가입 전송
     */
    @PostMapping("/insUser.do")
    public Map<String, Object> insUser(@RequestParam Map<String, Object> paramMap){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = userService.insUser(paramMap);
        return resultMap;
    }

    /**
     * 회원목록 조회
     */
    @GetMapping("/selUserById.do")
    public Map<String, Object> selUserById(@RequestParam Map<String, Object> paramMap){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = userService.selUserById(paramMap);
        return resultMap;
    }

    /**
     * 회원정보 수정
     */
    @RequestMapping(value = "/updtUser.do", method = RequestMethod.PATCH)
    public Map<String, Object> updtUser(@RequestBody Map<String, Object> paramMap) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = userService.updtUser(paramMap);
        return resultMap;
    }


    /**
     * 회원 삭제
     */
    @RequestMapping(value = "/delUser.do", method = RequestMethod.DELETE)
    public Map<String, Object> delUser(@RequestParam Map<String, Object> paramMap) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = userService.delUser(paramMap);
        return resultMap;
    }
}
