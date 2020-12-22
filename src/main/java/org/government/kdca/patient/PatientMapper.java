package org.government.kdca.patient;

import java.util.List;

import org.government.kdca.co.Patient;

public interface PatientMapper {
	public List<Patient> selectAll(Patient patient);
	public Patient select(Patient patient);
}
