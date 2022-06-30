package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "EQUIPMENTAPP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentAppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "SERIALNBR", nullable = false)
    private String serialNbr;

    @Column(name = "DAMAGEDESC", nullable = false)
    private String damageDesc;

    @OneToOne
    private DetailsEntity detailsEntity;

    @Override
    public String toString() {
        return "EquipmentApp{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", serialNbr='" + serialNbr + '\'' +
                ", damageDesc='" + damageDesc + '\'' +
                '}';
    }
}
