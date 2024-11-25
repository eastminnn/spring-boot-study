package com.eastmin.spring_boot_study.service;

import com.eastmin.spring_boot_study.dto.MemberDTO;
import com.eastmin.spring_boot_study.entity.MemberEntity;
import com.eastmin.spring_boot_study.repository.MemberRepostitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepostitory memberRepostitory;
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity
        // 2. repository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepostitory.save(memberEntity);
        // repository 의 save 메서드 호출 (조건, entity 객체를 넘겨줘야 함.)
    }
}
