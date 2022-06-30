package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovalAppEntity;
import com.sealService.PlombService.sealingService.SealingRemovalAppService;
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
public class SealingRemlActController {

    private final SealingRemovalAppService sealingRemovalAppService;

    @Autowired
    public SealingRemlActController(SealingRemovalAppService sealingRemovalAppService) {
        this.sealingRemovalAppService = sealingRemovalAppService;
    }

    @PostMapping(value = "/SealingRemAct")
    public ResponseEntity<?> create(@RequestBody SealingRemovalAppEntity sealingRemovalAppEntity) {
        sealingRemovalAppService.saveSealingApplication(sealingRemovalAppEntity);
        log.info("SealingRemoveAppEntity save" + sealingRemovalAppEntity.toString());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
