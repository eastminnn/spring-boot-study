package com.eastmin.spring_boot_study.repository;

import com.eastmin.spring_boot_study.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepostitory extends JpaRepository<MemberEntity, Long> {
}
