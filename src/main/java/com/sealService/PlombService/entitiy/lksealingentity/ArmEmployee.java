package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ARM_EMPLOYEE")
public class ArmEmployee {

	@javax.persistence.Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "ID_EXT", nullable = false)
	private String ext;

	@Override
	public String toString() {
		return "ArmEmployee{" +
			   "Id=" + Id +
			   ", ext='" + ext + '\'' +
			   '}';
	}
}
