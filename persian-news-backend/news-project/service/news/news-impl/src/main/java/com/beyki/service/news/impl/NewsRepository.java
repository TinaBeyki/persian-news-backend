package com.beyki.service.news.impl;

import com.beyki.service.common.repository.MiddleRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends NewsCustomRepository, MiddleRepository<NewsEnt, Long>{
}
