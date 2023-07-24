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
@Table(name = "ACT_EMPLOI", schema = "GRH_TUN")
public class ActEmploi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private Emploi emploi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "ACTMED_CODE", nullable = false)
    private ActMed actMed;

    @Column(name = "PERIODE", precision = 3)
    private Integer periode;

    @Column(name = "ECHEANCE", precision = 2)
    private Integer echeance;

    @Column(name = "DESCG", length = 50)
    private String descg;

    @Column(name = "DESCGAR", length = 50)
    private String descgar;

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

}

