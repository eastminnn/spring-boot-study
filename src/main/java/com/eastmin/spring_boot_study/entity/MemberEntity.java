package com.eastmin.spring_boot_study.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "member_table")
public class MemberEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true) // unique 제약조건을 추가
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;
}
