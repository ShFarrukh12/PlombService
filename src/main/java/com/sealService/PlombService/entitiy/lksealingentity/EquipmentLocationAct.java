package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EQUIPMENT_LOCATION")
public class EquipmentLocationAct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "COUNTRY", nullable = false)
    private int country;

    @Column(name = "REGION_CODE", nullable = false)
    private int regionCode;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Override
    public String toString() {
        return "EquipmentLocationAct{" +
                "id=" + id +
                ", country=" + country +
                ", regionCode=" + regionCode +
                ", description='" + description + '\'' +
                '}';
    }
}
