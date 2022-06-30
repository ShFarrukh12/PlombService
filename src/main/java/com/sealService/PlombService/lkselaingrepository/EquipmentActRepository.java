package com.sealService.PlombService.lkselaingrepository;

import com.sealService.PlombService.entitiy.lksealingentity.EquipmentsActEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentActRepository extends JpaRepository<EquipmentsActEntity, Long> {
}
