package com.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <pre>
 *
 * </pre>
 *
 * @author Yoo jiwon
 */
@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }


}
