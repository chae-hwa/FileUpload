package com.ll.exam.app10.security.dto;

import com.ll.exam.app10.member.entity.Member;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Getter
public class MemberContext extends User {
    private final Long id;
    private final String email;
    private final String profileImgUrl;

    public MemberContext(Member member, List<GrantedAuthority> authorities) {
        super(member.getUsername(), member.getPassword(), authorities);
        this.id = member.getId();
        this.email = member.getEmail();
        this.profileImgUrl = member.getProfileImgUrl();
    }
}