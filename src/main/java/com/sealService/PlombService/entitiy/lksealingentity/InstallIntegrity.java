package com.sealService.PlombService.entitiy.lksealingentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INSTALL_INTEGRITY")
public class InstallIntegrity {

	@Id
	@Column(name = "INSTALL_INTEGRITY_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idInstallIntegrity;

	@JoinTable(name = "HEADER",
			joinColumns = @JoinColumn(name = "INSTALL_INTEGRITY_ID"),
			inverseJoinColumns = @JoinColumn(name = "SEAL_HEADER_ID"))
	@ManyToOne
	private SealingHeader sealingHeader;

	@JoinTable(name = "BODY_INSTALL",
			joinColumns = @JoinColumn(name = "INSTALL_INTEGRITY_ID"),
			inverseJoinColumns = @JoinColumn(name = "SEAL_BODY_ACT_ID"))
	@ManyToOne
	private SealingBodyAct sealingBodyAct;

	@Override
	public String toString() {
		return "InstallIntegrity{" +
				"idInstallIntegrity=" + idInstallIntegrity +
				", sealHeader=" + sealingHeader +
				", sealBodyAct=" + sealingBodyAct +
				'}';
	}
}
