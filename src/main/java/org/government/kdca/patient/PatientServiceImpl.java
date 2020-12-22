package org.government.kdca.patient;

import java.util.ArrayList;
import java.util.List;

import org.government.kdca.auth.AuthInfoMapper;
import org.government.kdca.co.AuthInfo;
import org.government.kdca.co.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private AuthInfoMapper authInfoMapper;
	
	@Autowired
	private PatientMapper patientMapper;
	
	@Override
	public List<Patient> findPatient(Patient patient, AuthInfo authInfo) {
		List<Patient> patients = new ArrayList<Patient>();
		
		if(authInfoMapper.select(authInfo) != null) {
			if(patient.getLocation() != null) {
				patients = patientMapper.selectAll(patient);
				return patientMapper.selectAll(patient);
			}
			
			if(patient.getCode() != null) {
				patients.add(patientMapper.select(patient));
				return patients;
			}
		}
		
		return null;
	}
}
