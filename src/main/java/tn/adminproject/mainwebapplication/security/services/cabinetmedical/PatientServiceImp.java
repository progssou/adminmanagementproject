package tn.adminproject.mainwebapplication.security.services.cabinetmedical;

import tn.adminproject.mainwebapplication.models.cabinetmed.Patient;
import tn.adminproject.mainwebapplication.repository.PatientsRepository;

import java.util.List;

public class PatientServiceImp implements PatientService{

    private PatientsRepository patientsRepository;



    @Override
    public List<Patient> getAllPatients() {
        return patientsRepository.findAll();
    }


    @Override
    public Patient savePatients(Patient patient) {
        return patientsRepository.save(patient);
    }

    @Override
    public Patient getPatientsById(Long id) {
        return patientsRepository.findById(id).get();
    }

   // @Override
   // public Patients updatePatients(Patients patient) {
     //   return null;
   // }

    @Override
    public void deletePatientsById(Long id) {
        patientsRepository.deleteById(id);
    }

    @Override
    public Patient save(Patient patient) { return patientsRepository.save(patient); }
}
