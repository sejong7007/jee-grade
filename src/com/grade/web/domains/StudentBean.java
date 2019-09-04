package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String hacbun, name, ssn;

	public String getHacbun() {
		return hacbun;
	}

	public void setHacbun(String hacbun) {
		this.hacbun = hacbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "StudentBean [hacbun=" + hacbun + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
	

}
