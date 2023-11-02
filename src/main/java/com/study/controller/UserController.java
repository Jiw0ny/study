package com.study.controller;

import com.study.dto.UserDto;
import com.study.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    private UserService userService;

    //회원목록
    @GetMapping("/userList.do")
    public String userList(@ModelAttribute UserDto userDto, Model model) {
        List<UserDto> list = userService.selUserList();
        model.addAttribute("userList", list);
        return "userList";
    }

    //회원가입
    @GetMapping("/insUser.do")
    public String join() {
        return "join"; //
    }

    //회원가입 처리
    @PostMapping("/insUser.do")
    public String insUser(@ModelAttribute UserDto userDto) {
        userService.insUser(userDto);
        return "redirect:/userList.do";
    }

    //회원수정
    @GetMapping("/updtUser.do")
    public String updtUser(@RequestParam Long userId, Model model) {
        List<UserDto> user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "updt"; // updt.jsp 페이지로 이동
    }

    //회원수정 처리
    @PostMapping("/updtUser.do")
    public String updtUser(@ModelAttribute UserDto userDto) {
        userService.updtUser(userDto);
        return "redirect:/userList.do";
    }

    @GetMapping("/delUser/{userId}")
    public String delUser(@PathVariable String userId) {
        userService.delUser(userId);
        return "redirect:/userList.do";
    }
}
