import com.beyki.service.common.dto.AuditDto;
import lombok.*;

import javax.validation.constraints.NotNull;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactUsDto extends AuditDto {

    private Long id; // شناسه
    
    private Long userId;

    @NotNull
    private String message; // پیام

    @NotNull
    private Boolean seen; // دیده شده
}
