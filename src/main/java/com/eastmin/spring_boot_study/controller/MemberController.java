package com.eastmin.spring_boot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    // 회원가입 페이지 요청 메서드
    @GetMapping("/spring-boot-study/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/spring-boot-study/register")
    public String register(@RequestParam("memberEmail") String memberEmail,
                           @RequestParam("memberPassword") String memberPassword,
                           @RequestParam("memberName") String memberName) {
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "mainpage";
    }

}
