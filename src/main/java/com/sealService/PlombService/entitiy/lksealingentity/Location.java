package com.sealService.PlombService.entitiy.lksealingentity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "MAIN_LOCATION")
public class Location {

    @Id
    @Column(name = "MAIN_LOCATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Country", nullable = false)
    private int country;

    @Column(name = "REGIONCODE", nullable = false)
    private int regioncode;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Override
    public String toString() {
        return "LocationEntity{" +
                "country=" + country +
                ", regioncode=" + regioncode +
                ", description='" + description + '\'' +
                '}';
    }
}
