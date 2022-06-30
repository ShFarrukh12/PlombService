package com.sealService.PlombService.controllers;

import com.sealService.PlombService.entitiy.lksealingentity.DetailsEntity;
import com.sealService.PlombService.sealingService.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DetailsController {

    private DetailsService detailsService;

    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveDetails(@RequestBody DetailsEntity detailsEntity){
        detailsService.saveDetails(detailsEntity);
        return ResponseEntity.ok("Details " + detailsEntity.getSerialnumber() + " saved");
    }
}
