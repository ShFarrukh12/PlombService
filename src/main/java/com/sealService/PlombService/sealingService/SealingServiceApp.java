package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.SealingAppEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.SealingAppRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class SealingServiceApp {

    private final SealingAppRepository sealingAppRepository;

    public SealingAppEntity saveSealingApplication(SealingAppEntity sealingAppEntity) {
        if (sealingAppEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingApp", sealingAppEntity.toString());
        return sealingAppRepository.save(sealingAppEntity);
    }

    public void deleteSealingApplication(SealingAppEntity sealingAppEntity) {
        if (sealingAppEntity == null) {
           throw new SealingAppException();
        }
        log.info("Save SealingApp", sealingAppEntity.toString());
        sealingAppRepository.deleteById(sealingAppEntity.getId());
    }
}
