package com.beyki.service.user.api;

import com.beyki.service.common.dto.AuditDto;
import com.beyki.service.common.enums.GenderEnum;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends AuditDto {

    private Long id; //شناسه

    @NotNull
    private String username; // نام کاربری

    @NotNull
    @Length(min = 5, max = 20)
    private String password; // پسورد

    @NotNull
    private String firstName;  //نام

    @NotNull
    private String lastName; //نام خانوادگی

    @NotNull
    @Email
    private String email; // ایمیل

    @Size(min = 18, max = 110)
    private Integer age; // سن

    @NotNull
    private GenderEnum gender; // جنسیت

}
