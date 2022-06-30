package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.DetailsEntity;
import com.sealService.PlombService.exception.DetailsException;
import com.sealService.PlombService.lkselaingrepository.DetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DetailsService {

    @Autowired
    private DetailRepository detailRepository;

    public DetailsEntity saveDetails(DetailsEntity detailsEntity) {
        if (detailsEntity == null) {
            throw new DetailsException("Details must be notnull");
        }
        log.info("Save Details", detailsEntity.toString());
        return detailRepository.saveAndFlush(detailsEntity);
    }

    public void deleteDetails(DetailsEntity detailsEntity) {
        if (detailsEntity == null) {
            throw new DetailsException("Details must be notnull");
        }
        log.info("Delete Details", detailsEntity.toString());
        detailRepository.deleteById(detailsEntity.getId());
    }
}
