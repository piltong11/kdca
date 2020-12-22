package org.government.kdca.patient;

import java.util.List;

import org.government.kdca.co.AuthInfo;
import org.government.kdca.co.Patient;

public interface PatientService {
	public List<Patient> findPatient(Patient patient, AuthInfo authInfo);

}
