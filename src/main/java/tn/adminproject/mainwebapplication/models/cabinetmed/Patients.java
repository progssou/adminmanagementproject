package tn.adminproject.mainwebapplication.models.cabinetmed;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Table(name = "Patients")

public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matPat;

    @Size(max = 200)
    private String nom;


    @Size(max = 200)
    private String prenomPat;

    @Size(max = 200)
    private String adressePat;

    @Email
    @Size(max=50)
    private String emailPat;

    @Temporal(TemporalType.DATE)
    private Date birthDatePat ;

    @Size(max=20)
    private String phoneNumberPat;

    private String genrePat;

    @Size(max=10)
    private String cinPat;

    @Size(max=200)
    private String profPat;
}
