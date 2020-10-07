package com.beyki.service.admin.impl;

import com.beyki.service.admin.api.AdminDto;
import com.beyki.service.common.converter.AuditEntToDtoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdminEntToDtoConverter extends AuditEntToDtoConverter<AdminEnt, AdminDto> {

    protected AdminDto setFields(AdminEnt adminEnt) throws Exception {
        if (adminEnt == null)
            return null;
        else {
            return AdminDto.builder()
                    .id(adminEnt.getId())
                    .username(adminEnt.getUsername())
                    .email(adminEnt.getEmail())
                    .password(adminEnt.getPassword())
                    .build();
        }
    }

    protected List<AdminDto> convertAllToDto(List<AdminEnt> adminEnts) throws Exception {

        List<AdminDto> adminDtos = new ArrayList<AdminDto>();
        if (adminEnts != null) {
            for (AdminEnt ent : adminEnts) {
                AdminDto dto = setFields(ent);
                adminDtos.add(dto);
            }
            return adminDtos;
        } else
            //Todo
            return null;
    }
}
