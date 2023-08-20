package tn.adminproject.mainwebapplication.models.cabinetmed;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "Consultation")
public class Consultations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numConsultation;

    @Temporal(TemporalType.DATE)
    private Date dateConsultation;

    private String dialogueConsultation;

    @ManyToOne
    @JoinColumn(name = "matPat") // Colonne utilisée pour la relation entre Consultation et Patients
    private Patients patient;


    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certificats> certificates;

    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordonnances> ordonnances;

}
