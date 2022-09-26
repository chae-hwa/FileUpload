package com.ll.exam.app10.hashTag.repository;

import com.ll.exam.app10.hashTag.entity.HashTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HashTagRepository extends JpaRepository<HashTag, Long> {
    Optional<HashTag> findByArticleIdAndKeywordId(Long articleId, Long keywordId);
}