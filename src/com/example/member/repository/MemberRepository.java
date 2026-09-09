package com.example.member.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.member.model.Member;

public class MemberRepository {

    private List<Member> members = new ArrayList<>();

    public void save(Member member) {
        members.add(member);
    }

    public List<Member> findAll() {
        return members;
    }

    public Member findById(int id) {

        for (Member member : members) {

            if (member.getId() == id) {
                return member;
            }
        }

        return null;
    }


    public void delete(int id) {

        for (int i = 0; i < members.size(); i++) {

            if (members.get(i).getId() == id) {
                members.remove(i);
                return;
            }
        }
    }
}