import com.beyki.service.common.converter.AuditDtoToEntConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactUsDtoToEntConverter extends AuditDtoToEntConverter<ContactUsDto, ContactUsEnt> {

    protected ContactUsEnt setFields(ContactUsDto dto) throws Exception {
        if (dto == null)
            return null;
        else
            return ContactUsEnt.builder()
                    .id(dto.getId())
                    .userId(dto.getUserId())
                    .message(dto.getMessage())
                    .seen(dto.getSeen())
                    .build();
    }

    protected List<ContactUsEnt> convertAllToEnt(List<ContactUsDto> contactUsDtos) throws Exception {
        List<ContactUsEnt> contactUsEnts = new ArrayList<ContactUsEnt>();
        if (contactUsDtos != null) {
            for (ContactUsDto dto : contactUsDtos) {
                ContactUsEnt ent = setFields(dto);
                contactUsEnts.add(ent);
            }
            return contactUsEnts;
        } else
            //Todo
            return null;
    }
}
