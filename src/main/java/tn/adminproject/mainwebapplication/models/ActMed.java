package tn.adminproject.mainwebapplication.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "ACT_MED", schema = "GRH_TUN")
public class ActMed implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTMED_CODE", length = 20, nullable = false)
    private String actMedCode;

    @Column(name = "ACTMED_DSG", length = 200)
    private String actMedDsg;

    @Column(name = "ACTMED_DSGAR", length = 200)
    private String actMedDsgar;

    @Column(name = "ACTMED_TARIF")
    private Double actMedTarif;

    @Column(name = "ACTMED_VAL_MAX", precision = 20)
    private Long actMedValMax;

    @Column(name = "ACTMED_VAL_MIN", precision = 20)
    private Long actMedValMin;

    @Column(name = "ACTMED_DUREE", precision = 3)
    private Integer actMedDuree;

    @Column(name = "ACTMED_ACCORD", length = 1)
    private String actMedAccord;

    @Column(name = "UTIL_CREATED_BY", length = 200)
    private String utilCreatedBy;

    @Column(name = "UTIL_CREATED_ON")
    private Date utilCreatedOn;

    @Column(name = "UTIL_UPDATED_BY", length = 200)
    private String utilUpdatedBy;

    @Column(name = "UTIL_UPDATED_ON")
    private Date utilUpdatedOn;

    @Column(name = "UTIL_REMOTEUSER", length = 4000)
    private String utilRemoteUser;

    @Column(name = "UTIL_TRAC", length = 50)
    private String utilTrac;

    @Column(name = "PAGE_TRAC", length = 200)
    private String pageTrac;

    @ManyToOne
    @JoinColumn(name = "UNIT_CODE", nullable = false)
    private MedUnite medUnite;

    @ManyToOne
    @JoinColumn(name = "TYPACT_CODE", nullable = false)
    private TypeActMed typeActMed;
}

