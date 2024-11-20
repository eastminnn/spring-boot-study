package com.eastmin.spring_boot_study.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
