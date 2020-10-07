package com.beyki.service.admin.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdminService {

    List<AdminDto> findAll() throws Exception;

    ResponseEntity<ContactUsDto> getContactUsMessages();
}
