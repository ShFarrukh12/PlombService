package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovePlombActEntity;
import com.sealService.PlombService.sealingService.SealingRemovePlombActService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class SealinRemovePlombController {

    private SealingRemovePlombActService sealingRemovePlombActService;

    @Autowired
    public SealinRemovePlombController(SealingRemovePlombActService sealingRemovePlombActService) {
        this.sealingRemovePlombActService = sealingRemovePlombActService;
    }

    @PostMapping("/sealingremoveplombcontroller")
    public String saveSealingRemovePlombController(@RequestBody SealingRemovePlombActEntity sealingRemovePlombActEntity){
        sealingRemovePlombActService.saveSealingRemovePlombAct(sealingRemovePlombActEntity);
        log.info("SealingRemovePlombAct save" + sealingRemovePlombActEntity.toString());
        return "Распломбирование подкреплено к Акту";
    }
}
