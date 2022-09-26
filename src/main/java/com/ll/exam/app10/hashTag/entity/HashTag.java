package com.ll.exam.app10.hashTag.entity;
import com.ll.exam.app10.article.entity.Article;
import com.ll.exam.app10.base.entity.BaseEntity;
import com.ll.exam.app10.keyword.entity.Keyword;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class HashTag extends BaseEntity {
    @ManyToOne
    private Article article;
    @ManyToOne
    private Keyword keyword;
}
