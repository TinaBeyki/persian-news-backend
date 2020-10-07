package com.beyki.service.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditEnt implements Serializable {

    @Column(name = "NEWS_VERSION")
    @Version
    private Long version;

    @Column(name = "NEWS_CREATION_DATE")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "NEWS_CREATOR")
    @CreatedBy
    private String creator;

    @Column(name = "NEWS_MODIFIER")
    @LastModifiedBy
    private String modifier;

    @Column(name = "NEWS_MODIFY_DATE")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
}
