package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.MeasuringEntity;
import com.sealService.PlombService.entitiy.lksealingentity.SealingActEntity;
import com.sealService.PlombService.sealingService.MeasuringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measuring")
@Slf4j
public class MeasuringController {

    public MeasuringService measuringService;

    public MeasuringController(MeasuringService measuringService) {
        this.measuringService = measuringService;
    }

    @PostMapping(value = "/savemeasuring")
    public String create(@RequestBody MeasuringEntity measuringEntity) {
        measuringService.saveMeasuring(measuringEntity);
        log.info("Measuring saved " + measuringEntity,toString() );
        return "Добавлено средство измерения";
    }
}
