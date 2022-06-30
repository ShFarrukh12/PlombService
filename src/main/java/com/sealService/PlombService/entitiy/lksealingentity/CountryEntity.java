package com.sealService.PlombService.entitiy.lksealingentity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryEntity {

    @Id
    @Column(name = "CODE", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String code;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Override
    public String toString() {
        return "CountryEntity{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {

        private final CountryEntity buf;

        public Builder() {
            buf = new CountryEntity();
        }

        public Builder code(String code) {
            buf.code = code;
            return this;
        }

        public Builder name(String name) {
            buf.name = name;
            return this;
        }

        public CountryEntity build() {
            CountryEntity countryEntity = new CountryEntity();
            countryEntity.code = buf.code;
            countryEntity.name = buf.name;
            return countryEntity;
        }
    }
}
