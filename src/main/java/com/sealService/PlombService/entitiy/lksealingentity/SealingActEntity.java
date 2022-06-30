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
@Table(name = "SEALING_ACT")
public class SealingActEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME_WHO_WRITE_ACT")
	private String nameWhoWriteAct;

	@Column(name = "NUMBER_ORDER", nullable = false)
	private Long numberOrder;

	@Column(name = "NAME_FROM", nullable = false)
	private String nameFrom;

	@Column(name = "FULL_NAME_ORGANIZATION", nullable = false)
	private String fullNameOrganization;

	@Column(name = "SHORT_NAME_ORGANIZATION", nullable = false)
	private String shortNameOrganization;

	@Column(name = "INN", nullable = false)
	private Long inn;

	@Column(name = "KPP", nullable = false)
	private Long kpp;

	@Column(name = "NAME_REPRESENTATIVE", nullable = false)
	private String nameRepresentative;

	@Column(name = "SERIAL_NUMBER", nullable = false)
	private Long serialNumber;

	@Column(name = "NAME_OFFICIAL_REPRESENTATIVE", nullable = false)
	private String nameOfficialRepresentative;

	@Column(name = "JOB_TITLE_REPRESENTATIVE", nullable = false)
	private String jobTitleRepresentative;

	@Column(name = "EXAMINATION_DATA", nullable = false)
	private String examinationData;

	@Column(name = "DATA_TIME_INSPECTION_FROM", nullable = false)
	private String dataTimeInspectionFrom;

	@Column(name = "DATA_TIME_INSPECTION_TO", nullable = false)
	private String dataTimeInspectionTo;

	@Column(name = "LOCATION_OF_THE_INSTRAMENT", nullable = false)
	private String locationOfTheInstrament;



	@Override
	public String toString() {
		return "SealingAct{" +
				"id=" + id +
				", nameWhoWriteAct='" + nameWhoWriteAct + '\'' +
				", numberOrder=" + numberOrder +
				", nameFrom='" + nameFrom + '\'' +
				", SealingActControllerfullNameOrganization='" + fullNameOrganization + '\'' +
				", shortNameOrganization='" + shortNameOrganization + '\'' +
				", inn=" + inn +
				", kpp=" + kpp +
				", nameRepresentative='" + nameRepresentative + '\'' +
				", serialNumber=" + serialNumber +
				", nameOfficialRepresentative='" + nameOfficialRepresentative + '\'' +
				", jobTitleRepresentative='" + jobTitleRepresentative + '\'' +
				", examinationData='" + examinationData + '\'' +
				", dataTimeInspectionFrom='" + dataTimeInspectionFrom + '\'' +
				", dataTimeInspectionTo='" + dataTimeInspectionTo + '\'' +
				", locationOfTheInstrament='" + locationOfTheInstrament + '\'' +
				'}';
	}
}
