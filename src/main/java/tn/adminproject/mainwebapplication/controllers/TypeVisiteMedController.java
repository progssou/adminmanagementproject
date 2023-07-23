package tn.adminproject.mainwebapplication.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.adminproject.mainwebapplication.models.TypeVisiteMed;
import tn.adminproject.mainwebapplication.security.services.ITypeVisiteMed;

import java.util.List;

@RestController
@AllArgsConstructor
public class TypeVisiteMedController {
    ITypeVisiteMed itypeVisiteMed;


    @PostMapping("/addTypeVisiteMed")
    TypeVisiteMed addTypeVisiteMed(TypeVisiteMed typeVisiteMed){
        return itypeVisiteMed.addTypeVisiteMed(typeVisiteMed);
    }

    @GetMapping("/retrieveAllTypeVisiteMed")
    List<TypeVisiteMed> retrieveAllTypeVisiteMed(){
        return itypeVisiteMed.retrieveAllTypeVisiteMed();
    }
}
