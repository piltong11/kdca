package org.government.kdca.co;

import java.io.Serializable;

public class RequestVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Patient patient;
	private AuthInfo authInfo;
	
	public RequestVO() {
	}
	
	public RequestVO(Patient patient, AuthInfo authInfo) {
		super();
		this.patient = patient;
		this.authInfo = authInfo;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public AuthInfo getAuthInfo() {
		return authInfo;
	}

	public void setAuthInfo(AuthInfo authInfo) {
		this.authInfo = authInfo;
	}
}
