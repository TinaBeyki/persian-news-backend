package com.beyki.service.login.api;

import com.beyki.service.common.dto.AuditDto;
import lombok.*;

import org.jetbrains.annotations.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDto extends AuditDto {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
