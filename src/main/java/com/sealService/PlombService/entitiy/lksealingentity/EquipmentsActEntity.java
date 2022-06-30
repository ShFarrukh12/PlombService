package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EQUIPMENTACT")
public class EquipmentsActEntity {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "SerialNbr", nullable = false)
    private String serialnbr;

    @OneToMany
    @JoinTable(name = "details_equipment",
            joinColumns = @JoinColumn(name = "details_id"),
            inverseJoinColumns = @JoinColumn(name = "equipmentact_id"))
    List<DetailsEntity> detailsEntityList;

    @Column(name = "DamageDesc", nullable = false)
    private String damageDesc;

    @Override
    public String toString() {
        return "EquipmentsAct{" +
                "brand='" + brand + '\'' +
                ", serialnbr='" + serialnbr + '\'' +
                ", detailsEntityList=" + detailsEntityList +
                ", damageDesc='" + damageDesc + '\'' +
                '}';
    }
}
