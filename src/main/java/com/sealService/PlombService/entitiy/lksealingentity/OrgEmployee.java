package com.sealService.PlombService.entitiy.lksealingentity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORG_EMPLOYEE")
public class OrgEmployee {

	@javax.persistence.Id
	@Column(name = "ID", nullable = false)
	private Long Id;

	@Column(name = "SIGNATURE", nullable = false)
	private String signature;

	@Override
	public String toString() {
		return "OrgEmployee{" +
				"Id=" + Id +
				", signature='" + signature + '\'' +
				'}';
	}
}
