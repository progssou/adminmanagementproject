package tn.adminproject.mainwebapplication.security.services.cabinetmedical;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.adminproject.mainwebapplication.models.cabinetmed.Pattient;
import tn.adminproject.mainwebapplication.repository.PattientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PattientServiceImp implements IPattient{

    PattientRepository pattientRepository;
    @Override
    public Pattient addPattient(Pattient pattient) {
        return pattientRepository.save(pattient);
    }

    @Override
    public Pattient updatePattient(Pattient pattient) {
        return pattientRepository.save(pattient);
    }

    @Override
    public Pattient retrievePattientById(Integer id) {
        return pattientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pattient> retrieveAllPattients() {
        return pattientRepository.findAll();
    }

    @Override
    public void deletePattient(Integer id) {
        pattientRepository.deleteById(id);
    }
}
