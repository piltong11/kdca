package org.government.kdca.patient;

import org.government.kdca.co.AuthInfo;
import org.government.kdca.co.Patient;
import org.government.kdca.co.RequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kdca/patient/")
public class PatientController {
	@Autowired
	private PatientServiceImpl patientServiceImpl;
	
	@PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> search(@RequestBody RequestVO requestVO) {
		Patient patient = requestVO.getPatient();
		AuthInfo authInfo = requestVO.getAuthInfo();
		
		return ResponseEntity.status(HttpStatus.OK).body(patientServiceImpl.findPatient(patient, authInfo));
	}

}
