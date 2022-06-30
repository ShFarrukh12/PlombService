package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SEAL_HEADER")
public class SealingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SEAL_HEADER_ID")
    private Long id;

    @Column(name = "FULL_NAME_HEADER", nullable = false)
    private String fullnameHeader;

    @Column(name = "INN", nullable = false)
    private Long inn;

    @Column(name = "KPP_HEADER", nullable = false)
    private Long kpp;

    @JoinTable(name = "SEAL_HEADER_EQUIPMENT_LOCATION",
            joinColumns = @JoinColumn(name = "SEAL_HEADER_ID"),
            inverseJoinColumns = @JoinColumn(name = "EQUIPMENT_LOCATION_id"))
    @OneToOne
    private EquipmentLocationAct equipmentLocationAct;

    @Override
    public String toString() {
        return "SealHeader{" +
                "id=" + id +
                ", fullnameHeader='" + fullnameHeader + '\'' +
                ", inn=" + inn +
                ", kpp=" + kpp +
                ", equipmentLocationAct=" + equipmentLocationAct +
                '}';
    }
}
