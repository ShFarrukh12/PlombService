package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INSTALLATION")
public class Installation {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TYPE")
    @Convert(converter = InstallationType.InstallationTypeConverter.class)
    private InstallationType type;

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "installation", fetch = FetchType.EAGER)
    private Set<SealingEquipment> sealingEquipments;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSTALLATION { ")
                .append(", ID=").append(id)
                .append(", TYPE=").append(type)
                .append(", EQUIPMENTS=")
                .append(sealingEquipments != null ? sealingEquipments.stream()
                        .map(sealingEquipment -> "[ID=" + sealingEquipment.getId() + ", SN=" + sealingEquipment.getSerialNumber() + "]")
                        .reduce((s1, s2) -> s2 + ", " + s2)
                        .orElse(null)
                        : null)
                .append(" }");
        return sb.toString();
    }

    public static class Builder {

        private final Installation buf;

        public Builder() {
            buf = new Installation();
        }

        public Builder type(InstallationType type) {
            buf.type = type;
            return this;
        }

        public Builder equipments(Set<SealingEquipment> sealingEquipments) {
            buf.sealingEquipments = sealingEquipments;
            return this;
        }

        public Installation build() {
            Installation installation = new Installation();
            installation.type = buf.type;
            installation.sealingEquipments = buf.sealingEquipments;
            return installation;
        }
    }
}
