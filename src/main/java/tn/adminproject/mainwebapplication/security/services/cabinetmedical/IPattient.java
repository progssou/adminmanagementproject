package tn.adminproject.mainwebapplication.security.services.cabinetmedical;

import tn.adminproject.mainwebapplication.models.cabinetmed.Pattient;

import java.util.List;

public interface IPattient {
    public Pattient addPattient(Pattient pattient);
    public Pattient updatePattient(Pattient pattient);

    Pattient retrievePattientById(Integer id);

    List<Pattient> retrieveAllPattients();
    void deletePattient(Integer id);


}
