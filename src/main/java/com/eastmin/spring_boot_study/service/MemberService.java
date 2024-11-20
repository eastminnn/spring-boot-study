package com.eastmin.spring_boot_study.service;

import com.eastmin.spring_boot_study.dto.MemberDTO;
import com.eastmin.spring_boot_study.repository.MemberRepostitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepostitory memberRepostitory;
    public void save(MemberDTO memberDTO) {
    }
}
