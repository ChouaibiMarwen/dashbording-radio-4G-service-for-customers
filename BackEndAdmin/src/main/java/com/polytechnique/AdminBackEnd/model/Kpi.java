package com.polytechnique.AdminBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kpi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idkpi;
	private String kpi;

	public Kpi() {}

	public Kpi(String kpi) {
		super();
		this.kpi = kpi;
	}

	public Long getIdkpi() {
		return idkpi;
	}

	public void setIdkpi(Long idkpi) {
		this.idkpi = idkpi;
	}

	public String getKpi() {
		return kpi;
	}

	public void setKpi(String kpi) {
		this.kpi = kpi;
	}
	
	
}
