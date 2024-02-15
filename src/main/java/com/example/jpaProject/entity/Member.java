package com.example.jpaProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MEMBER") // @Table 은 엔티티와 매핑할 테이블을 지정한다
@Getter @Setter
public class Member {
    @Id
    //아이덴티티 : DB가 알아서 생성해 주는것을 아이덴티티라고 함 오라클에서는 시퀀스라고 함
    //아이덴티티 전략 => 쿼리에 ID를 넣는게 아니라 DB가 아이디를 자동을 생성해주는 거를 아이덴티티라고 함
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //시스템이 저장하는 아이디

    private String name;
}
