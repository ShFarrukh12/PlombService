package com.sealService.PlombService.sealingService;

import com.sealService.PlombService.entitiy.lksealingentity.EquipmentAppEntity;
import com.sealService.PlombService.exception.EquipmentException;
import com.sealService.PlombService.lkselaingrepository.EquipmentAppRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EquipmentAppService {

    @Autowired
    private EquipmentAppRepository equipmentAppRepository;

    public EquipmentAppEntity saveEquipmentApp(EquipmentAppEntity equipmentsAppEntity) {
        if (equipmentsAppEntity == null) {
            throw new EquipmentException("equipment  must be notnull");
        }
        log.info("Save Equipment", equipmentsAppEntity.toString());
        return equipmentAppRepository.saveAndFlush(equipmentsAppEntity);
    }

    public void deleteEquipmentApp(EquipmentAppEntity equipmentAppEntity) {
        if (equipmentAppEntity == null) {
            throw new EquipmentException("equipment  must be notnull");
        }
        log.info("Delete Equipment", equipmentAppEntity.toString());
        equipmentAppRepository.deleteById(equipmentAppEntity.getId());
    }
}
