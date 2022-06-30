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
@Table(name = "RTDST")
public class RtdSD {

    @Id
    @Column(name = "RTDST_ID", nullable = false)
    private Long id;

    @Column(name = "DATA_RTDST", nullable = false)
    private LocalDateTime dataRtdst;

    @OneToOne
    @JoinTable(name = "RTDST_INSTALLATION",
            joinColumns = @JoinColumn(name = "RTDST_ID"),
            inverseJoinColumns = @JoinColumn(name = "TERRORGAN_ID")
    )
    private TerrOrganEntity terrOrganEntity;

    @Override
    public String toString() {
        return "RtdSD{" +
                "id=" + id +
                ", dataRtdst=" + dataRtdst +
                ", terrOrganEntity=" + terrOrganEntity +
                '}';
    }
}
