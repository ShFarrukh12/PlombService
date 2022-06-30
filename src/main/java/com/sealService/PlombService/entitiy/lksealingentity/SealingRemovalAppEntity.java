package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SEALING_REMOVAL_APP")
public class SealingRemovalAppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEALING_REMOVAL_APP_ID")
    private Long id;

    @Column(name = "DATE_SEALING_REMOVAL_APP", nullable = false)
    private LocalDateTime localDateTime;


    @JoinTable(name = "SEALING_REMOVAL_APP_TERRORGAN",
            joinColumns = @JoinColumn(name = "SEALING_REMOVAL_APP_ID"),
            inverseJoinColumns = @JoinColumn(name = "TERRORGAN_ID"))
    @OneToOne
    private TerrOrganEntity terrOrganEntity;

    @JoinTable(name = "SEALING_REMOVAL_APP_ORGANIZATION",
            joinColumns = @JoinColumn(name = "SEALING_REMOVAL_APP_ID"),
            inverseJoinColumns = @JoinColumn(name = "ORGANIZATION_APP_ID"))
    @OneToOne
    private OrganizationApp organizationApp;

    @JoinTable(name = "SEALING_REMOVAL_APP_INSTALLATION",
            joinColumns = @JoinColumn(name = "SEALING_REMOVAL_APP_ID"),
            inverseJoinColumns = @JoinColumn(name = "INSTALLATION_ACT_ID"))
    @OneToOne
    private InstallationAct installationAct;

    @Override
    public String toString() {
        return "SealingRemovalAppEntity{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", terrOrganEntity=" + terrOrganEntity +
                ", organizationApp=" + organizationApp +
                ", installationAct=" + installationAct +
                '}';
    }
}
