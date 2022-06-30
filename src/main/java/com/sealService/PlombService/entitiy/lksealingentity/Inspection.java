package com.sealService.PlombService.entitiy.lksealingentity;


import lombok.*;

import javax.persistence.*;
import java.security.Timestamp;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INSPECTION")
public class Inspection {

    @Id
    @Column(name = "INSPECTION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "DATE_INSPECTION", nullable = false)
    private Timestamp timestamp;

    @Column(name = "DURATION", nullable = false)
    private String duration;

    @OneToOne
    @JoinTable(name = "LOCATION_INTEGRITY_INSPECTION",
            joinColumns = @JoinColumn(name = "INSTALL_INTEGRITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "LOCATION_ID"))
    private Location location;

    @OneToOne
    @JoinTable(name = "INSTALL_INTEGRITY_INSPECTION",
            joinColumns = @JoinColumn(name = "INSTALL_INTEGRITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID"))
    private InstallIntegrity installIntegrity;

    @Override
    public String toString() {
        return "Inspection{" +
                "timestamp=" + timestamp +
                ", duration='" + duration + '\'' +
                ", location=" + location +
                ", installIntegrity=" + installIntegrity +
                '}';
    }
}
