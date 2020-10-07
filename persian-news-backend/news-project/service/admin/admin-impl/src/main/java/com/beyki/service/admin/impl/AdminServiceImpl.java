package com.beyki.service.admin.impl;

import com.beyki.service.admin.api.AdminDto;
import com.beyki.service.admin.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminEntToDtoConverter entToDtoConverter;

    @Autowired
    private AdminRepository adminRepository;

    public List<AdminDto> findAll() throws Exception {
        List<AdminEnt> adminEnts = adminRepository.findAll();
        return entToDtoConverter.convertAllToDto(adminEnts);
    }
}
