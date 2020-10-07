package com.beyki.service.admin.api;

import com.beyki.service.common.dto.AuditDto;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto extends AuditDto {

    private Long id; // شناسه ادمین

    @NonNull
    private String username; // نام کاربری

    @NonNull
    @Size(min = 8, max = 20)
    private String password; // رمز عبور

    @Email
    @NonNull
    private String email; // ایمیل

    @Email
    @NotNull
    private String recoveryEmail;
}
