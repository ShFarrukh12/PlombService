package com.sealService.PlombService.lkselaingrepository;

import com.sealService.PlombService.entitiy.lksealingentity.SealingRemovalAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SealingRemovalAppRepository extends JpaRepository<SealingRemovalAppEntity, Long> {
}
