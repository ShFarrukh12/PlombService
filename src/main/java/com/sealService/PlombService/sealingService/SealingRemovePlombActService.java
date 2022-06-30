package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovePlombActEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.SealingRemovePlombActRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SealingRemovePlombActService {

    private SealingRemovePlombActRepository sealingRemovePlombActRepository;

    @Autowired
    public SealingRemovePlombActService(SealingRemovePlombActRepository sealingRemovePlombActRepository) {
        this.sealingRemovePlombActRepository = sealingRemovePlombActRepository;
    }

    public SealingRemovePlombActEntity saveSealingRemovePlombAct(SealingRemovePlombActEntity sealingRemovePlombActEntity) {
        if (sealingRemovePlombActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingRemovalPlombActEntity", sealingRemovePlombActEntity.toString());
        return sealingRemovePlombActRepository.save(sealingRemovePlombActEntity);
    }

    public void deleteSealingRemovePlombAct(SealingRemovePlombActEntity sealingRemovePlombActEntity) {
        if (sealingRemovePlombActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Delete SealingRemovalApp", sealingRemovePlombActEntity.toString());
        sealingRemovePlombActRepository.deleteById(sealingRemovePlombActEntity.getSerialNumber());
    }
}
