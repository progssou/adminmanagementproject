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

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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


    public Patient(@Size(max = 200) String nom, @Size(max=50)  String emailPat, @Size(max = 200) String prenomPat) {
        this.nom = nom;
        this.emailPat = emailPat;
        this.prenomPat = prenomPat;
    }

    // Constructor for the signup request

    public Patient(@Size(max = 200) String nom, @Size(max = 200) String prenomPat, @Size(max = 200) String adressePat, @Size(max=50) String emailPat, Date birthDatePat,
                   @Size(max=20)  String phoneNumberPat, String genrePat, @Size(max=10) String cinPat, @Size(max=200) String profPat) {
        this.nom = nom;
        this.prenomPat = prenomPat;
        this.adressePat = adressePat;
        this.emailPat = emailPat;
        this.birthDatePat = birthDatePat;
        this.phoneNumberPat = phoneNumberPat;
        this.genrePat = genrePat;
        this.cinPat = cinPat;
        this.profPat = profPat;
    }


}
