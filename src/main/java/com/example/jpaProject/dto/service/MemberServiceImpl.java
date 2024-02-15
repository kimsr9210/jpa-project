package com.example.jpaProject.dto.service;

import com.example.jpaProject.dto.repository.MemberRepository;
import com.example.jpaProject.entity.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository;

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
}
