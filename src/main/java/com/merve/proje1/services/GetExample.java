package com.merve.proje1.services;


import com.merve.proje1.pojo.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //Bir restful servisi ayağa kaldıracağız.

public class GetExample {

    @RequestMapping(value = "/memberList", method = RequestMethod.GET) //memberList path ine gelen istekleri getMemberList methodu karşılasın dedik.

    public Member getMember(@RequestParam(value = "memberName", defaultValue = "Merve") String memberName)
    {
        Member returnedMember = null;

        List<Member> memberList = new ArrayList<>();
        Member member = new Member();
        member.setName("Merve");
        member.setCity("Sivas");
        member.setAge(23);

        memberList.add(member);

        member = new Member();
        member.setName("Rabia");
        member.setCity("Kars");
        member.setAge(22);

        memberList.add(member);

        member = new Member();
        member.setName("Kübra");
        member.setCity("Adıyaman");
        member.setAge(24);

        memberList.add(member);

        //return memberList;

        for (Member member1 : memberList)
        {
            if (memberName.equals(member1.getName()))
                returnedMember = member1 ;
        }

        return returnedMember;

        //http://localhost:8080/memberList?memberName=Rabia diyerek de Rabia'nın bilgilerini döndürebiliyoruz.

    }

}
