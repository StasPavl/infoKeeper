package com.pavl.entity;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import org.springframework.stereotype.Component;


import java.time.LocalDateTime;

@Component
public class BaseEntityListener extends AuditingEntityListener {


    @PrePersist
    private void onPrePersist(BaseEntity baseEntity){



        baseEntity.setInsertDateTime(LocalDateTime.now());
        baseEntity.setLastUpdateDateTime(LocalDateTime.now());


    }

    @PreUpdate
    private void onPreUpdate(BaseEntity baseEntity){


        baseEntity.setLastUpdateDateTime(LocalDateTime.now());

    }



}
