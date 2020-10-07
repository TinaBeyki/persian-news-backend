package com.beyki.service.news.api;

import com.beyki.service.common.dto.AuditDto;
import com.beyki.service.tags.impl.TagsEnt;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.sql.Clob;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsDto extends AuditDto {

    private Long id; // شناسه خبر

    @NotNull
    private Clob newsContent; // محتوای خبر

    @NotNull
    private TagsEnt tagsEnt; // شناسه تگ
}
