package tn.adminproject.mainwebapplication.controllers.cabinetmedical;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;
import tn.adminproject.mainwebapplication.models.cabinetmed.Patient;
import tn.adminproject.mainwebapplication.repository.PatientsRepository;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientsRepository patientRepository;

    public PatientController(PatientsRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        if (patient != null) {
            return patientRepository.save(patient);
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    @PutMapping("/updatePatient")
    public Patient updatePatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping("/getPatientById/{id}")
    public Patient retrievePatientById(@PathVariable("id") Long id) {
        return patientRepository.getPatientsById(id);
    }

    @GetMapping("/allPatients")
    public List<Patient> retrieveAllPatients() {
        return patientRepository.findAll();
    }

    @DeleteMapping("/delPatients/{id}")
    public void deletePatients(@PathVariable("id") Long id) {
        patientRepository.deletePatientsById(id);
    }


}
