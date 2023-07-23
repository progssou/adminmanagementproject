package tn.adminproject.mainwebapplication.security.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.adminproject.mainwebapplication.models.TypeVisiteMed;
import tn.adminproject.mainwebapplication.models.User;
import tn.adminproject.mainwebapplication.repository.TypeVisiteMedRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeVisiteMedServiceImpl implements ITypeVisiteMed{
    TypeVisiteMedRepository typeVisiteMedRepository;
    @Override
    public TypeVisiteMed addTypeVisiteMed(TypeVisiteMed typeVisiteMed) {
        return typeVisiteMedRepository.save(typeVisiteMed);
    }

    @Override
    public List<TypeVisiteMed> retrieveAllTypeVisiteMed() {
        return typeVisiteMedRepository.findAll();
    }
}
