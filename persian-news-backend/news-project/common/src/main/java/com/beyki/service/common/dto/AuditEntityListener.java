package com.beyki.service.common.dto;

import lombok.NoArgsConstructor;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@NoArgsConstructor
public class AuditEntityListener {


    @PrePersist
    public void perPersist(final AuditEnt auditEnt) {

        AutowireHelper.autowire(this);

        final Date now = new Date();
        auditEnt.setCreationDate(now);

        try{
           // auditEnt.setCreator(); Todo
        }catch (Exception e) {
            auditEnt.setCreator("System");
        }
    }

    @PreUpdate
    public void perUpdate(final AuditEnt auditEnt) {

        AutowireHelper.autowire(this);

        final Date now = new Date();
        auditEnt.setModifyDate(now);

        try{
            // auditEnt.setCreator(); Todo
        }catch (Exception e) {
            auditEnt.setCreator("unknown");
        }
    }
}
