package tn.adminproject.mainwebapplication.models.cabinetmed;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Certificats> certificates;

    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Ordonnances> ordonnances;

}
