package com.example.jpaProject.dto.repository;

import com.example.jpaProject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member save(Member member); //회원을 저장하면 저장된 회원이 반환
}
