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
@Table(name = "ORGANIZATIONAPP")
public class OrganizationApp {

    @Id
    @Column(name = "ORGANIZATON_ID", nullable = false)
    private String id;

    @Column(name = "ORGANIZATION_FULLNAME", nullable = false)
    private String fullName;

    @Column(name = "ORGANIZATION_SHORTNAME", nullable = false)
    private String shortName;

    @Column(name = "INN", nullable = false)
    private Long inn;

    @Column(name = "KPP", nullable = false)
    private Long kpp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Override
    public String toString() {
        return "OrganizationApp{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", inn=" + inn +
                ", kpp=" + kpp +
                ", address=" + address +
                '}';
    }
}
