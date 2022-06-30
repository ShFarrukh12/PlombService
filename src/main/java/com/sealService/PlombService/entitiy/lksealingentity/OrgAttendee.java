package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORG_ATTENDEE")
public class OrgAttendee {
    @Id
    @Column(name = "ORG_ATTENDEE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SURNAME", nullable = false)
    private String surName;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "PATRONYMIC", nullable = false)
    private String patronymic;

    @Column(name = "POSITION", nullable = false)
    private String position;

    @Override
    public String toString() {
        return "OrgAttendee{" +
                "id=" + id +
                ", surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
