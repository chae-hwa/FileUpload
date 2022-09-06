package com.ll.exam.app10.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String showJoin(){
        return "member/join";
    }

    @PostMapping("/join")
    @ResponseBody
    public String join(){
        return "가입 완료";
    }
}