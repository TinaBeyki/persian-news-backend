import com.beyki.service.common.dto.AuditEnt;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "CONTACTUS_TBL") // جدول ارتباط با ما
public class ContactUsEnt extends AuditEnt {

    @Id
    @Column(name = "CONTACTUS_ID")
    @SequenceGenerator(sequenceName = "CONTACTUS_SEQ", name = "contactus_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contactus_seq")
    private Long id; // شناسه

    @Column(name = "CONTACTUS_USERID")
    private Long userId;

    @Column(name = "CONTACTUS_MESSAGE")
    private String message; // پیام

    @Column(name = "CONTACTUS_ISSEEN")
    private Boolean seen; // دیده شده


}
