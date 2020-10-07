package com.beyki.service.common.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AuditDto implements Serializable {

    private Long version;

    private Date creationDate;

    private String creator;

    private String modifier;

    private Date modifyDate;

 }
