package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ADMIN_ENTITY")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NUMBER", nullable = false)
    private int number;

    @Column(name = "DATE_STATEMENTS", nullable = false)
    private String dateStatements;

    @Column(name = "TYPE_STATEMENTS", nullable = false)
    private String typeStatements;

    @Column(name = "TYPE_OBJECT_PLOMB", nullable = false)
    private String typeObjectPlomb;

    @Column(name = "STATUS", nullable = false)
    private String statusOfStatement;
}
