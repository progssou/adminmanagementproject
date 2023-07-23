package tn.adminproject.mainwebapplication.security.services;

import tn.adminproject.mainwebapplication.models.TypeVisiteMed;
import tn.adminproject.mainwebapplication.models.User;

import java.util.List;

public interface ITypeVisiteMed {

    TypeVisiteMed addTypeVisiteMed(TypeVisiteMed typeVisiteMed);

    List<TypeVisiteMed> retrieveAllTypeVisiteMed();


}
