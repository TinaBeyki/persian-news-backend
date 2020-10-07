package com.beyki.service.user.impl;

import com.beyki.service.common.converter.AuditDtoToEntConverter;
import com.beyki.service.user.api.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDtoToEntConverter extends AuditDtoToEntConverter<UserDto , UserEnt> {

    protected UserEnt setFields(UserDto dto) throws Exception {

        if(dto == null)
            return null;
        else{
            return  UserEnt.builder()
                    .id(dto.getId())
                    .firstName(dto.getFirstName())
                    .lastName(dto.getLastName())
                    .username(dto.getUsername())
                    .password(dto.getPassword())
                    .email(dto.getEmail())
                    .age(dto.getAge())
                    .gender(dto.getGender())
                    .build();
        }
    }

    protected List<UserEnt> convertAllToEnt(List<UserDto> userDtos) throws Exception {

        List<UserEnt> userEnts = new ArrayList<UserEnt>();
        if(userDtos != null) {
            for(UserDto userDto: userDtos) {
                UserEnt ent = setFields(userDto);
                userEnts.add(ent);
            }
            return userEnts;
        }else
            //Todo
            return null;
    }
}
