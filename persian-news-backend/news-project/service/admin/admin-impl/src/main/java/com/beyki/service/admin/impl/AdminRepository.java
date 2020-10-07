package com.beyki.service.admin.impl;

import com.beyki.service.common.repository.MiddleRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends AdminCustomRepository, MiddleRepository<AdminEnt, Long> {
}
