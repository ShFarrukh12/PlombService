package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SEALING_REMOVE_ACT")
public class SealingRemovePlombActEntity {
  @Column(name = "REASON", nullable = false)
  private String reason;

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
        return "SealingRemovePlombAct{" +
                "reason='" + reason + '\'' +
                ", number=" + number +
                ", brand='" + brand + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", definitionAddressInstall='" + definitionAddressInstall + '\'' +
                ", numberSavePlomb=" + numberSavePlomb +
                ", measuring='" + measuring + '\'' +
                '}';
    }
}
