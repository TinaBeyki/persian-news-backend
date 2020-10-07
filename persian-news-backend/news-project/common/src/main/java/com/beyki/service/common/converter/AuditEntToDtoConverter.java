package com.beyki.service.common.converter;

import com.beyki.service.common.dto.AuditDto;
import com.beyki.service.common.dto.AuditEnt;

import java.util.List;

public abstract class AuditEntToDtoConverter<EntClass extends AuditEnt, DtoClass extends AuditDto> {

    public DtoClass entConvertToDto(EntClass ent) throws Exception{

        DtoClass dto = setFields(ent);

        if(ent != null) {

            dto.setVersion(ent.getVersion());
            dto.setCreationDate(ent.getCreationDate());
            dto.setModifyDate(ent.getModifyDate());
            dto.setCreator(ent.getCreator());
            dto.setModifier(ent.getModifier());
        }
        return dto;
    }

    protected abstract DtoClass setFields(final EntClass entClass) throws Exception;

    protected abstract List<DtoClass> convertAllToDto(final List<EntClass> entClasses) throws Exception;
}
