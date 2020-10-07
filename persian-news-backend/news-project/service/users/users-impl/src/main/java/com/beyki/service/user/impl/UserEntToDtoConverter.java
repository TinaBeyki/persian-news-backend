package com.beyki.service.user.impl;

import com.beyki.service.common.converter.AuditEntToDtoConverter;
import com.beyki.service.user.api.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserEntToDtoConverter extends AuditEntToDtoConverter<UserEnt, UserDto> {

    protected UserDto setFields(UserEnt ent) {

        if(ent == null)
            return null;
        return UserDto.builder()
                .id(ent.getId())
                .firstName(ent.getFirstName())
                .lastName(ent.getLastName())
                .username(ent.getUsername())
                .password(ent.getPassword())
                .email(ent.getEmail())
                .age(ent.getAge())
                .build();
    }


    protected List<UserDto> convertAllToDto(List<UserEnt> userEnts) {
        List<UserDto> userDtos = new ArrayList<UserDto>();
        if(userEnts != null) {
            for (UserEnt ent : userEnts) {
                UserDto dto = setFields(ent);
                userDtos.add(dto);
            }
            return userDtos;
        }else
            //Todo
            return null;
    }
}
