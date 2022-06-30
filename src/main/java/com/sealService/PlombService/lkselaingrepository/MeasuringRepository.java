package com.sealService.PlombService.lkselaingrepository;

import com.sealService.PlombService.entitiy.lksealingentity.MeasuringEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasuringRepository extends JpaRepository<MeasuringEntity, Long> {
}
