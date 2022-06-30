package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.EquipmentAppEntity;
import com.sealService.PlombService.sealingService.EquipmentAppService;
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
public class EquipmentAppController {

    private EquipmentAppService equipmentAppService;

    @Autowired
    public EquipmentAppController(EquipmentAppService equipmentAppService) {
        this.equipmentAppService = equipmentAppService;
    }

    @PostMapping(value = "/save_equipment")
    public ResponseEntity<?> create(@RequestBody EquipmentAppEntity equipmentAppEntity) {
        equipmentAppService.saveEquipmentApp(equipmentAppEntity);
        log.info("EquipmentApp saved" + equipmentAppEntity.toString());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
