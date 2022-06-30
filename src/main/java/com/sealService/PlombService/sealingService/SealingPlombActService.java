package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.SealingPlombActEntity;
import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovePlombActEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.SealingPlombActRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SealingPlombActService {

    public SealingPlombActRepository sealingPlombActRepository;

    @Autowired
    public SealingPlombActService(SealingPlombActRepository sealingPlombActRepository) {
        this.sealingPlombActRepository = sealingPlombActRepository;
    }

    public SealingPlombActEntity saveSealingRemovePlombAct(SealingPlombActEntity sealingPlombActEntity) {
        if (sealingPlombActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingPlombActEntity", sealingPlombActEntity.toString());
        return sealingPlombActRepository.save(sealingPlombActEntity);
    }

    public void deleteSealingRemovePlombAct(SealingPlombActEntity sealingPlombActEntity) {
        if (sealingPlombActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Delete SealingPlombAct", sealingPlombActEntity.toString());
        sealingPlombActRepository.deleteById(sealingPlombActEntity.getSerialNumber());
    }
}
