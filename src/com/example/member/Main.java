package com.example.member;

import com.example.member.model.Member;
import com.example.member.service.MemberService;

public class Main {

    public static void main(String[] args) {

        MemberService service = new MemberService();


        Member member1 =
                new Member(1, "홍길동", "hong@test.com");

        Member member2 =
                new Member(2, "김철수", "kim@test.com");


        service.join(member1);
        service.join(member2);


        System.out.println("전체 회원");

        for (Member member : service.getMembers()) {
            System.out.println(member);
        }


        System.out.println("\n검색 결과");

        Member result = service.searchMember(2);

        System.out.println(result);


        System.out.println("\n회원 삭제 (ID: 1)");

        service.deleteMember(1);


        System.out.println("\n삭제 후 전체 회원");

        for (Member member : service.getMembers()) {
            System.out.println(member);
        }
    }
}