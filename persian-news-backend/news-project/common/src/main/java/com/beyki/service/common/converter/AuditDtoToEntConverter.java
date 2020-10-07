package com.beyki.service.common.converter;

import com.beyki.service.common.dto.AuditDto;
import com.beyki.service.common.dto.AuditEnt;

import java.util.List;

public abstract class AuditDtoToEntConverter<DtoClass extends AuditDto, EntClass extends AuditEnt> {

    public EntClass convertDtoToEnt(DtoClass dto) throws Exception {

        EntClass ent = setFields(dto);

        if(ent != null) {

            ent.setVersion(dto.getVersion());
            ent.setModifyDate(dto.getModifyDate());
            ent.setModifier(dto.getModifier());
            ent.setCreator(dto.getCreator());
            ent.setCreationDate(dto.getCreationDate());
        }
        return ent;
    }

    protected abstract EntClass setFields(final DtoClass dto) throws Exception;

    protected abstract List<EntClass> convertAllToEnt(List<DtoClass> dtoClasses) throws Exception;
}
