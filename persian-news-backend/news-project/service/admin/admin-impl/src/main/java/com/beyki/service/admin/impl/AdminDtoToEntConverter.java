package com.beyki.service.admin.impl;

import com.beyki.service.admin.api.AdminDto;
import com.beyki.service.common.converter.AuditDtoToEntConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdminDtoToEntConverter extends AuditDtoToEntConverter<AdminDto, AdminEnt> {

    protected AdminEnt setFields(AdminDto dto) throws Exception {

        if(dto == null)
            return null;
        else {
            return AdminEnt.builder()
                    .id(dto.getId())
                    .username(dto.getUsername())
                    .password(dto.getPassword())
                    .email(dto.getEmail())
                    .build();
        }
    }

    protected List<AdminEnt> convertAllToEnt(List<AdminDto> adminDtos) throws Exception {

        List<AdminEnt> adminEnts = new ArrayList<AdminEnt>();
        if(adminDtos != null) {
            for(AdminDto adminDto: adminDtos) {
                AdminEnt adminEnt = setFields(adminDto);
                adminEnts.add(adminEnt);
            }
            return adminEnts;
        }else
            //Todo
            return null;
    }
}
