package com.sealService.PlombService.sealingService;


import com.sealService.PlombService.entitiy.lksealingentity.SealingActEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.SealingActRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SealingActService {

    private SealingActRepository sealingActRepository;

    @Autowired
    public SealingActService(SealingActRepository sealingActRepository) {
        this.sealingActRepository = sealingActRepository;
    }

    public SealingActEntity saveSealingApplication(SealingActEntity sealingActEntity) {
        if (sealingActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingApp", sealingActEntity.toString());
        return sealingActRepository.save(sealingActEntity);
    }

    public void deleteSealingApplication(SealingActEntity sealingActEntity) {
        if (sealingActEntity == null) {
            throw new SealingAppException();
        }
        log.info("Save SealingApp", sealingActEntity.toString());
        sealingActRepository.deleteById(sealingActEntity.getId());
    }
}
