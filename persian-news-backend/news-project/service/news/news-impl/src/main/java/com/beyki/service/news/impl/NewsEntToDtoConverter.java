package com.beyki.service.news.impl;

import com.beyki.service.common.converter.AuditEntToDtoConverter;
import com.beyki.service.news.api.NewsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewsEntToDtoConverter extends AuditEntToDtoConverter<NewsEnt, NewsDto> {

    protected NewsDto setFields(NewsEnt ent) throws Exception {

        if (ent == null)
            return null;
        else
            return NewsDto.builder()
                    .id(ent.getId())
                    .newsContent(ent.getNewsContent())
                    .tagsEnt(ent.getTagsEnt())
                    .build();
    }

    protected List<NewsDto> convertAllToDto(List<NewsEnt> newsEnts) throws Exception {

        List<NewsDto> newsDtos = new ArrayList<NewsDto>();
        if (newsEnts != null) {
            for (NewsEnt ent : newsEnts) {
                NewsDto dto = setFields(ent);
                newsDtos.add(dto);
            }
            return newsDtos;
        } else
            //Todo
            return null;
    }
}
