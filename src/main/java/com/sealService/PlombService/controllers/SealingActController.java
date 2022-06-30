package com.sealService.PlombService.controllers;


import com.sealService.PlombService.entitiy.lksealingentity.SealingActEntity;
import com.sealService.PlombService.sealingService.SealingActService;
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
public class SealingActController {

     @Autowired
     private SealingActService sealingActService;

     @PostMapping(value = "/sealing_act")
     public ResponseEntity<?> create(@RequestBody SealingActEntity sealingActEntity) {
          sealingActService.saveSealingApplication(sealingActEntity);
          log.info("SealingAct saved" + sealingActEntity.toString());
          return new ResponseEntity<>(HttpStatus.CREATED);
     }

}
