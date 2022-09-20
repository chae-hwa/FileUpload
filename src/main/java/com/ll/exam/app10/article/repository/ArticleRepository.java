package com.ll.exam.app10.article.repository;

import com.ll.exam.app10.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
