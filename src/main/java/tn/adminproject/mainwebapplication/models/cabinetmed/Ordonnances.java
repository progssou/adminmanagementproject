package tn.adminproject.mainwebapplication.models.cabinetmed;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "Ordonnances")
public class Ordonnances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnance;

    private String contenuOrdonnance;

    @ManyToOne
    @JoinColumn(name = "numConsultation") // Colonne utilisée pour la relation entre Ordonnance et Consultation
    private Consultations consultation;
}
