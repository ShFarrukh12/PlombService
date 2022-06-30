package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DETAILS")
public class DetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SEALIMPRDESC")
    private String sealimpDescl;

    @Column(name = "SERIALNUMBER")
    private String serialnumber;

    @Column(name = "ISTALSITE")
    private String istalsite;

    @OneToMany(mappedBy = "detailsEntity")
    private Set<EquipmentAppEntity> equipmentAppEntities;

    @Override
    public String toString() {
        return "DetailsEntity{" +
                ", sealimpDescl='" + sealimpDescl + '\'' +
                ", serialnumber='" + serialnumber + '\'' +
                ", istalsite='" + istalsite + '\'' +
                '}';
    }
}
