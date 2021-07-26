package com.example.study.controller.dto.member;

import com.example.study.domain.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JoinMember {
    private String name;
    private Integer age;
    private String roleName;

    public Member toEntity() {
        return new Member(name, age);
    }
}
