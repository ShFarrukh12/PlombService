package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter

@Table(name = "INSTALLATION_ACT")
public class InstallationAct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INSTALLATION_ACT_ID", nullable = false)
    private Long id;

    @Column(name = "TYPE", nullable = false)
    private String typeInstallatiionAct;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "EQUIPMENT_ACT",
            joinColumns = @JoinColumn(name = "Ter_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<EquipmentsActEntity> equipmentsActEntities;

    @Override
    public String toString() {
        return "InstallationAct{" +
                "id=" + id +
                ", typeInstallatiionAct='" + typeInstallatiionAct + '\'' +
                ", equipmentsActs=" + equipmentsActEntities +
                '}';
    }
}
