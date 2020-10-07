package com.beyki.service.news.impl;

import com.beyki.service.common.converter.AuditDtoToEntConverter;
import com.beyki.service.news.api.NewsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewsDtoToEntConverter extends AuditDtoToEntConverter<NewsDto, NewsEnt> {

    protected NewsEnt setFields(NewsDto dto) throws Exception {

        if (dto == null)
            return null;
        else
            return NewsEnt.builder()
                    .id(dto.getId())
                    .newsContent(dto.getNewsContent())
                    .tagsEnt(dto.getTagsEnt())
                    .build();
    }

    protected List<NewsEnt> convertAllToEnt(List<NewsDto> newsDtos) throws Exception {

        List<NewsEnt> newsEnts = new ArrayList<NewsEnt>();

        if (newsDtos != null) {
            for (NewsDto dto : newsDtos) {
                NewsEnt ent = setFields(dto);
                newsEnts.add(ent);
            }
            return newsEnts;
        } else
            //Todo
            return null;
    }
}
