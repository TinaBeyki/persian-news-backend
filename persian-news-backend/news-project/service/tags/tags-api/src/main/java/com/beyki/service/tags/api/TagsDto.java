package com.beyki.service.tags.api;

import com.beyki.service.common.dto.AuditDto;
import lombok.*;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TagsDto extends AuditDto {

    private Long id;

    @NotNull
    private String title;
}
