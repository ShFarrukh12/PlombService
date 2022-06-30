package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovalAppEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.SealingRemovalAppRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SealingRemovalAppService {

    private SealingRemovalAppRepository sealingRemovalAppRepository;

    @Autowired
    public SealingRemovalAppService(SealingRemovalAppRepository sealingRemovalAppRepository) {
        this.sealingRemovalAppRepository = sealingRemovalAppRepository;
    }

    public SealingRemovalAppEntity saveSealingApplication(SealingRemovalAppEntity sealingRemovalAppEntity) {
        if (sealingRemovalAppEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingRemovalApp", sealingRemovalAppEntity.toString());
        return sealingRemovalAppRepository.save(sealingRemovalAppEntity);
    }

    public void deleteSealingApplication(SealingRemovalAppEntity sealingRemovalAppEntity) {
        if (sealingRemovalAppEntity == null) {
            throw new SealingAppException();
        }
        log.info("Delete SealingRemovalApp", sealingRemovalAppEntity.toString());
        sealingRemovalAppRepository.deleteById(sealingRemovalAppEntity.getId());
    }
}
