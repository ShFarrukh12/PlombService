package com.sealService.PlombService.lkselaingrepository;


import com.sealService.PlombService.entitiy.lksealingentity.SealingAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SealingAppRepository extends JpaRepository<SealingAppEntity, Long> {
}
