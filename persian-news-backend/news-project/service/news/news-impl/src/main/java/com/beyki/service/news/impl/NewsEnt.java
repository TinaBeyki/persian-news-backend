package com.beyki.service.news.impl;

import com.beyki.service.common.dto.AuditEnt;
import com.beyki.service.tags.impl.TagsEnt;
import lombok.*;

import javax.persistence.*;
import java.sql.Clob;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "NEWSTBL") // جدول اخبار
public class NewsEnt extends AuditEnt {

    @Id
    @Column(name = "NEWSTBL_ID")
    @SequenceGenerator(name = "newstbl_seq", sequenceName = "NEWSTBL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "newstbl_seq")
    private Long id; // شناسه خبر

    @Column(name = "NEWSTBL_CONTENT")
    private Clob newsContent; // محتوای خبر

    @Column(name = "NEWSTBL_TAGSTBL_ID")
    @ManyToMany
    private TagsEnt tagsEnt; // شناسه تگ

}
