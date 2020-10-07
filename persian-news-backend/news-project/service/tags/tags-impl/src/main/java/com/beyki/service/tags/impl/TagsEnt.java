package com.beyki.service.tags.impl;

import com.beyki.service.common.dto.AuditEnt;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TAGSTBL", uniqueConstraints = @UniqueConstraint(columnNames = "TAGSTBL_TITLE")) // جدول تگ ها
public class TagsEnt extends AuditEnt {

    @Id
    @Column(name = "TAGSTBL_ID")
    @SequenceGenerator(name = "tagstbl_seq", sequenceName = "TAGSTBL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tagstbl_seq")
    private Long id;

    @Column(name = "TAGSTBL_TITLE")
    private String title;

}
