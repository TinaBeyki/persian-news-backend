package com.beyki.service.tags.impl;

import com.beyki.service.common.repository.MiddleRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends TagsCustomRepository, MiddleRepository<TagsEnt, Long> {
}
