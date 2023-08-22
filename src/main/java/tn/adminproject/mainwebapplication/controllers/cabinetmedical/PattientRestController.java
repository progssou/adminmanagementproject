package tn.adminproject.mainwebapplication.controllers.cabinetmedical;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.adminproject.mainwebapplication.models.cabinetmed.Pattient;
import tn.adminproject.mainwebapplication.security.services.cabinetmedical.IPattient;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/patient")
public class PattientRestController {
    IPattient ipattient;

    @PostMapping("/addPatient")
    public Pattient addPattient(@RequestBody Pattient pattient){
        return ipattient.addPattient(pattient);
    }

    @GetMapping("/getAllPatients")
    public List<Pattient> getAllPatients() {
        return ipattient.retrieveAllPattients();
    }

    @GetMapping("/getPatientById/{id}")
    public Pattient getPatientById(@PathVariable Integer id) {
        return ipattient.retrievePattientById(id);
    }

    @PutMapping("/updatePatient")
    public Pattient updatePatient(@RequestBody Pattient patient) {
        return ipattient.updatePattient(patient);
    }

    @DeleteMapping("/deletePatient/{id}")
    public void deletePatient(@PathVariable Integer id) {
        ipattient.deletePattient(id);
    }
}


