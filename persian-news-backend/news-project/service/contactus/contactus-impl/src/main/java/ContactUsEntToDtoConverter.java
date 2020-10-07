import com.beyki.service.common.converter.AuditEntToDtoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactUsEntToDtoConverter extends AuditEntToDtoConverter<ContactUsEnt, ContactUsDto> {

    protected ContactUsDto setFields(ContactUsEnt ent) throws Exception {

        if (ent == null)
            return null;
        else {
            return ContactUsDto.builder()
                    .id(ent.getId())
                    .userId(ent.getUserId())
                    .message(ent.getMessage())
                    .seen(ent.getSeen())
                    .build();
        }
    }

    protected List<ContactUsDto> convertAllToDto(List<ContactUsEnt> contactUsEnts) throws Exception {
        List<ContactUsDto> contactUsDtos = new ArrayList<ContactUsDto>();
        if (contactUsEnts != null) {
            for (ContactUsEnt ent : contactUsEnts) {
                ContactUsDto dto = setFields(ent);
                contactUsDtos.add(dto);
            }
            return contactUsDtos;
        } else
            //Todo
            return null;
    }
}
