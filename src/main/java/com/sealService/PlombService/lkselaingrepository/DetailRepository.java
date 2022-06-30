package com.sealService.PlombService.lkselaingrepository;

import com.sealService.PlombService.entitiy.lksealingentity.DetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<DetailsEntity, Long> {
}
