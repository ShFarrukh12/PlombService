package com.sealService.PlombService.entitiy.lksealingentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SEAL_EQUIPMENT")
public class SealingEquipment {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "SERIAL_NUMBER", nullable = false)
    private String serialNumber;

    @Column(name = "DAMAGE_DESC")
    private String damageDesc;

    @JsonIgnore
    @ManyToOne
    @JoinTable(name = "INSTAL_TO_EQUIP",
            joinColumns = @JoinColumn(name = "SEAL_EQUIPMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "INSTALLATION_ID"))
    private Installation installation;

    @JsonIgnore
    @ManyToOne
    @JoinTable(name = "SEALING_TO_EQUIP",
            joinColumns = @JoinColumn(name = "SEAL_EQUIPMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SEALING_ID"))
    private SealingAppEntity sealingAppEntity;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("COUNTRY { ")
                .append(", ID=").append(id)
                .append(", BRAND=").append(brand)
                .append(", SERIAL_NUMBER=").append(serialNumber)
                .append(", DAMAGE_DESC=").append(damageDesc)
                .append(" }");
        return sb.toString();
    }

    public static class Builder {

        private final SealingEquipment buf;

        public Builder() {
            buf = new SealingEquipment();
        }

        public Builder brand(String brand) {
            buf.brand = brand;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            buf.serialNumber = serialNumber;
            return this;
        }

        public Builder damageDesc(String damageDesc) {
            buf.damageDesc = damageDesc;
            return this;
        }

        public SealingEquipment build() {
            SealingEquipment sealingEquipment = new SealingEquipment();
            sealingEquipment.brand = buf.brand;
            sealingEquipment.serialNumber = buf.serialNumber;
            sealingEquipment.damageDesc = buf.damageDesc;
            return sealingEquipment;
        }
    }
}
