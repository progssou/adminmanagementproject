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
@Table(name = "Certificats")
public class Certificats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCertificat;

    private String contenuCertificat;

    @ManyToOne
    @JoinColumn(name = "numConsultation") // Colonne utilisée pour la relation entre Certificat et Consultation
    private Consultations consultation;
}
