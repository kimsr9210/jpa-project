package com.example.jpaProject.dto.service;

import com.example.jpaProject.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    void join(Member member);
}
