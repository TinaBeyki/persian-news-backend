package com.beyki.service.user.impl;

import com.beyki.service.common.enums.GenderEnum;
import com.beyki.service.common.dto.AuditEnt;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERTBL", uniqueConstraints = @UniqueConstraint(columnNames = {"USERTBL_USERNAME", "USERTBL_EMAIL"})) // جدول کاربران
public class UserEnt extends AuditEnt {

    @Id
    @Column(name = "USERTBL_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usertbl_seq")
    @SequenceGenerator(sequenceName = "USERTBL_SEQ", name = "usertbl_seq", allocationSize = 1)
    private Long id; // شناسه

    @Column(name = "USERTBL_USERNAME")
    private String username; // نام کاربری

    @Column(name = "USERTBL_PASSWORD")
    private String password; // رمز عبور

    @Column(name = "USERTBL_FIRSTNAME")
    private String firstName; // نام

    @Column(name = "USERTBL_LASTNAME")
    private String lastName; // نام خانوادگی

    @Column(name = "USERTBL_EMAIL")
    private String email; // ایمیل

    @Column(name = "USERTBL_AGE")
    private Integer age; // سن

    @Column(name = "USERTBL_GENDER")
    private GenderEnum gender; //جنسیت

   /* @OneToMany(mappedBy = "userent")
    private ContactUsEnt contactUsEnt;*/


}
