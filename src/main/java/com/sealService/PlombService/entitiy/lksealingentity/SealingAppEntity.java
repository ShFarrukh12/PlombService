package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SEALING_APPLICATION")
public class SealingAppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "DATA_SEALING", nullable = false)
    private Timestamp timestamp;

    @Column(name = "TYPE_SEALING", nullable = false)
    private String sealingType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sealingEntity")
    private Set<MeasuringEntity> measuringEntity;

    @Column(name = "FULLNAME", nullable = false)
    private String fullName;

    @Column(name = "INN", nullable = false)
    private Long inn;

    @Column(name = "KPP", nullable = false)
    private Long kpp;

    @Column(name = "LEGAL_ADDRESS", nullable = false)
    private String legalAddress;

    @Column(name = "ACTUAL_ADDRESS", nullable = false)
    private String actualAddress;

    @Column(name = "LOCATION_ADDRESS", nullable = false)
    private String locationAddress;

    @Override
    public String toString() {
        return "Sealing{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", sealingType=" + sealingType +
                ", measuirng=" + measuringEntity +
                ", fullName='" + fullName + '\'' +
                ", inn=" + inn +
                ", kpp=" + kpp +
                ", legalAddress='" + legalAddress + '\'' +
                ", actualAddress='" + actualAddress + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                '}';
    }

}
