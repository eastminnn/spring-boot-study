package com.eastmin.spring_boot_study.controller;

import com.eastmin.spring_boot_study.dto.MemberDTO;
import com.eastmin.spring_boot_study.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    // 회원가입 페이지 요청 메서드
    @GetMapping("/spring-boot-study/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/spring-boot-study/register")
    public String register(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "mainpage";
    }

}
