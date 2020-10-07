package com.beyki.service.tags.impl;

import com.beyki.service.common.converter.AuditEntToDtoConverter;
import com.beyki.service.tags.api.TagsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TagsEntToDtoConverter extends AuditEntToDtoConverter<TagsEnt, TagsDto> {


    protected TagsDto setFields(TagsEnt ent) throws Exception {

        if (ent == null)
            return null;
        else
            return TagsDto.builder()
                    .id(ent.getId())
                    .title(ent.getTitle())
                    .build();
    }

    protected List<TagsDto> convertAllToDto(List<TagsEnt> tagsEnts) throws Exception {

        List<TagsDto> tagsDtos = new ArrayList<TagsDto>();

        if (tagsEnts != null) {
            for (TagsEnt ent : tagsEnts) {
                TagsDto dto = setFields(ent);
                tagsDtos.add(dto);
            }
            return tagsDtos;
        } else
            //Todo
            return null;
    }
}
