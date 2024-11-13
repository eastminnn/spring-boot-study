package com.eastmin.spring_boot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // 메인 페이지 요청 메서드
    @GetMapping("/")
    public String mainpage() {
        return "mainpage";
    }
}
