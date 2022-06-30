package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "SEALING_PLOMB")
public class SealingPlombActEntity {
    @Column(name = "NUMBER", nullable = false)
    private Long number;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Id
    @Column(name = "SERIAL_NUMBER", nullable = false)
    private Long serialNumber;

    @Column(name = "DEFINITION_ADDRESS_INSTALL", nullable = false)
    private String definitionAddressInstall;

    @Column(name = "NUMBER_SAVE_PLOMB", nullable = false)
    private Long numberSavePlomb;

    @Column(name = "MEASURING", nullable = false)
    private String measuring;

    @Override
    public String toString() {
        return "SealingPlombActEntity{" +
                "number=" + number +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                ", definitionAddressInstall='" + definitionAddressInstall + '\'' +
                ", numberSavePlomb=" + numberSavePlomb +
                ", measuring='" + measuring + '\'' +
                '}';
    }
}
