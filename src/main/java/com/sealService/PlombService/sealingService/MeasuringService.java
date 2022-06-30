package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.MeasuringEntity;
import com.sealService.PlombService.exception.SealingAppException;
import com.sealService.PlombService.lkselaingrepository.MeasuringRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MeasuringService {

    private MeasuringRepository measuringRepository;

    @Autowired
    public MeasuringService(MeasuringRepository measuringRepository) {
        this.measuringRepository = measuringRepository;
    }

    public MeasuringEntity saveMeasuring(MeasuringEntity measuringEntity) {
        if (measuringEntity == null) {
            throw new RuntimeException("measuring must be not null");
        }
        log.info("Save measuring", measuringEntity.toString());
        return measuringRepository.save(measuringEntity);
    }

    public void deleteSealingApplication(MeasuringEntity measuringEntity) {
        if (measuringEntity == null) {
            throw new SealingAppException();
        }
        log.info("Delete measuring", measuringEntity.toString());
        measuringRepository.deleteById(measuringEntity.getId());
    }
}
