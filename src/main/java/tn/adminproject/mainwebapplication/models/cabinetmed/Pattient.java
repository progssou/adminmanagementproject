package tn.adminproject.mainwebapplication.models.cabinetmed;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Pattient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matPat") // Specify the column name explicitly

    private Integer matPat;

    private String nom;

    private String prenomPat;

    private String adressePat;

    private String emailPat;

    @Temporal(TemporalType.DATE)
    private Date birthDatePat ;

    private Integer phoneNumberPat;

    private String genrePat;

    private String cinPat;

    private String profPat;
}
