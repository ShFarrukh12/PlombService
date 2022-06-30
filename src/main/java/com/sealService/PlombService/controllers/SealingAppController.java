package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.SealingAppEntity;
import com.sealService.PlombService.sealingService.SealingServiceApp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class SealingAppController {

    private final SealingServiceApp service;

    @Autowired
    public SealingAppController(SealingServiceApp service) {
        this.service = service;
    }

    @PostMapping(value = "/sealing_application")
    public ResponseEntity<?> create(@RequestBody SealingAppEntity sealingAppEntity) {
        service.saveSealingApplication(sealingAppEntity);
        log.info("Sealing APP saved" + sealingAppEntity.toString());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
