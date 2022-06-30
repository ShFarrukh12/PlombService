package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.EquipmentsActEntity;
import com.sealService.PlombService.exception.EquipmentException;
import com.sealService.PlombService.lkselaingrepository.EquipmentActRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EquipmentsActService {

    @Autowired
    private EquipmentActRepository equipmentActRepository;

    public EquipmentsActEntity saveSealingApplication(EquipmentsActEntity equipmentsActEntity) {
        if (equipmentsActEntity == null) {
            throw new EquipmentException("equipment  must be notnull");
        }
        log.info("Save Equipment", equipmentsActEntity.toString());
        return equipmentActRepository.save(equipmentsActEntity);
    }

    public void deleteSealingApplication(EquipmentsActEntity equipmentsActEntity) {
        if (equipmentsActEntity == null) {
            throw new EquipmentException("equipment  must be notnull");
        }
        log.info("Delete Equipment", equipmentsActEntity.toString());
        equipmentActRepository.deleteById(equipmentsActEntity.getId());
    }
}
