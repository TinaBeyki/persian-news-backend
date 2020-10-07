package com.beyki.service.user.impl;

import com.beyki.service.common.repository.MiddleRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends UserCustomRepository ,MiddleRepository<UserEnt, Long> {
}
