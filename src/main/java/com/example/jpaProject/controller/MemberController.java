package com.example.jpaProject.controller;

import com.example.jpaProject.dto.service.MemberService;
import com.example.jpaProject.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private MemberService memberService;

    @GetMapping("/")
    public String main(){
        return "Hello UserController";
    }

    @PostMapping("/user")
    public Member user(Member user){
        return user;
    }

    @PostMapping("/signup")
    public String signup(Member member){
        memberService.join(member);
        return "회원 가입이 완료되었습니다.";
    }
}
