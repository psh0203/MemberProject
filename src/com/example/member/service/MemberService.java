package com.example.member.service;

import java.util.List;

import com.example.member.model.Member;
import com.example.member.repository.MemberRepository;

public class MemberService {

    private MemberRepository repository =
            new MemberRepository();


    public void join(Member member) {
        repository.save(member);
    }


    public List<Member> getMembers() {
        return repository.findAll();
    }


    public Member searchMember(int id) {
        return repository.findById(id);
    }

    public void deleteMember(int id) {
        repository.delete(id);
    }
}