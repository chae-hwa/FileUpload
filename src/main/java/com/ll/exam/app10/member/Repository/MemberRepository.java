package com.ll.exam.app10.member.Repository;

import com.ll.exam.app10.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
     Optional<Member> findByUsername(String username);
}
