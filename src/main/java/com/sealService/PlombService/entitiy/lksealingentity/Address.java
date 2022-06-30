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
@Table(name = "ADDRESS")
public class Address {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(name = "COUNTRY", nullable = false)
      private Long country;

      @Column(name = "REGIONCODE", nullable = false)
      private Long regioncode;

      @Column(name = "DESCRIPTION", nullable = false)
      private String description;

      @Override
      public String toString() {
            return "Address{" +
                    "country=" + country +
                    ", regioncode=" + regioncode +
                    ", description='" + description + '\'' +
                    '}';
      }
}
