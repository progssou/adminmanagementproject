package tn.adminproject.mainwebapplication.security.services.cabinetmedical;

import tn.adminproject.mainwebapplication.models.cabinetmed.Patient;

import java.util.List;

public interface PatientService {


    List<Patient> getAllPatients();

    Patient savePatients(Patient patient);

    Patient getPatientsById(Long id);

    //Patients updatePatients(Patients id);

    void deletePatientsById(Long id);

    Patient save(Patient patient);
}
