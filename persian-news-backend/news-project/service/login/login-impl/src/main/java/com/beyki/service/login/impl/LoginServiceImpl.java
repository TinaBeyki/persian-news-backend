package com.beyki.service.login.impl;

import com.beyki.service.admin.api.AdminDto;
import com.beyki.service.admin.api.AdminService;
import com.beyki.service.login.api.LoginDto;
import com.beyki.service.login.api.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AdminService adminService;

    public Boolean login(LoginDto loginDto) throws Exception {

        List<AdminDto> adminDtos = adminService.findAll();
        for (AdminDto dto : adminDtos) {
            if (dto.getUsername().equals(loginDto.getUsername()) && dto.getPassword().equals(loginDto.getPassword()))
                return true;
        }
        return false;
    }
}
