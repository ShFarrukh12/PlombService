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
@Table(name = "SA_TO_ARM_EMPLOYEE")
public class SaToArmEmployee {

	@Id
	@Column(name = "ID", nullable = false)
	private Long id;

	@JoinTable(name = "SA_TO_ARM_EMPLOYEE_id",
			joinColumns = @JoinColumn(name = "sealing_application_id"),
			inverseJoinColumns = @JoinColumn(name = "arm_employee_id"))
	@OneToOne
	private ArmEmployee armEmployee;

	@Override
	public String toString() {
		return "SaToArmEmployee{" +
				"id=" + id +
				", armEmployee=" + armEmployee +
				'}';
	}

	public static class Builder {
		private final SaToArmEmployee saToArmEmployee1;
		public Builder() {
			saToArmEmployee1 = new SaToArmEmployee();
		}
		public SaToArmEmployee build() {
			SaToArmEmployee saToArmEmployee = new SaToArmEmployee();
			saToArmEmployee.armEmployee = saToArmEmployee1.armEmployee;
			return saToArmEmployee;
		}
	}

}
