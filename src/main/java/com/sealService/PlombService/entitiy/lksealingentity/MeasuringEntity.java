package com.sealService.PlombService.entitiy.lksealingentity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "MEASURING")
public class MeasuringEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "SERIAL_NUMBER", nullable = false)
    private String serialNumber;

    @Column(name = "INSTALATION_LOCATION", nullable = false)
    private String instalationLocation;

    @Column(name = "NUMBER_IN_ROSSTANDART", nullable = false)
    private Long numberInRosstandart;

    @ManyToOne
   // @JoinColumn(name = "sealing_entity_id",referencedColumnName = "id", nullable = false)
    private SealingAppEntity sealingEntity;

    @Override
    public String toString() {
        return "Measuirng{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                ", instalationLocation='" + instalationLocation + '\'' +
                ", numberInRosstandart=" + numberInRosstandart +
                '}';
    }
}
