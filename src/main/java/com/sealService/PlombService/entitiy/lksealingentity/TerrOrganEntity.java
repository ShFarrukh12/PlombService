package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TERRORGAN")
public class TerrOrganEntity {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FULLNAME", nullable = false)
    private String fullName;

    @Column(name = "INN", nullable = false)
    private String inn;

    @Column(name = "KPP", nullable = false)
    private String kpp;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Terr_Organ",
            joinColumns = @JoinColumn(name = "Ter_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<Address> addresses;

    @Override
    public String toString() {
        return "TerrOrganEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}