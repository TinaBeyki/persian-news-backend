package com.beyki.service.tags.impl;

import com.beyki.service.common.converter.AuditDtoToEntConverter;
import com.beyki.service.tags.api.TagsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TagsDtoToEntConverter extends AuditDtoToEntConverter<TagsDto, TagsEnt> {

    protected TagsEnt setFields(TagsDto dto) throws Exception {

        if (dto == null)
            return null;
        else
            return TagsEnt.builder()
                    .id(dto.getId())
                    .title(dto.getTitle())
                    .build();
    }

    protected List<TagsEnt> convertAllToEnt(List<TagsDto> tagsDtos) throws Exception {

        List<TagsEnt> tagsEnts = new ArrayList<TagsEnt>();

        if (tagsDtos != null) {
            for (TagsDto dto : tagsDtos) {
                TagsEnt ent = setFields(dto);
                tagsEnts.add(ent);
            }
            return tagsEnts;
        } else
            //Todo
            return null;
    }
}
