package com.beyki.service.admin.impl;

import com.beyki.service.common.dto.AuditEnt;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ADMINTBL", uniqueConstraints = @UniqueConstraint(columnNames = {"ADMINTBL_USERNAME", "ADMINTBL_EMAIL"})) // جدول ادمین
public class AdminEnt extends AuditEnt {

    @Id
    @Column(name = "ADMINTBL_ID")
    @SequenceGenerator(name = "admintbl_seq", sequenceName = "ADMINTBL_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "admintbl_seq", strategy = GenerationType.SEQUENCE)
    private Long id; // شناسه ادمین

    @Column(name = "ADMINTBL_USERNAME")
    private String username; // نام کاربری

    @Column(name = "ADMINTBL_PASSWORD")
    private String password; // رمز عبور

    @Column(name = "ADMINTBL_EMAIL")
    private String email; // ایمیل

    @Column(name = "ADMINTBL_RECOVERYEMAIL")
    private String recoveryEmail;

}
