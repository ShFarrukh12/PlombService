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
@Table(name = "SEAL_BODY_ACT")
public class SealingBodyAct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SEAL_BODY_ACT_ID", nullable = false)
    private Long id;

    @JoinTable(name = "SEAL_BODY_ACT_INSTALLATION",
            joinColumns = @JoinColumn(name = "SEAL_BODY_ACT_ID"),
            inverseJoinColumns = @JoinColumn(name = "INSTALLATION_ACT_ID"))
    @OneToOne
    private InstallationAct installationAct;

    @Column(name = "OBJECTION", nullable = false)
    private String objection;

    @Override
    public String toString() {
        return "SealBodyAct{" +
                "id=" + id +
                ", installationAct=" + installationAct +
                ", objection='" + objection + '\'' +
                '}';
    }
}
