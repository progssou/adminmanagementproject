package tn.adminproject.mainwebapplication.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "MEDORG", schema = "GRH_TUN")
public class Medorg implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MED_CODE", nullable = false)
    private Integer medCode;

    @Column(name = "MED_DSG")
    private String medDsg;

    @Column(name = "MED_DSGAR")
    private String medDsgar;

    @Column(name = "LOC_CODE")
    private Integer locCode;

    @Column(name = "MED_ADR")
    private String medAdr;

    @Column(name = "MED_ADRAR")
    private String medAdrar;

    @Column(name = "MED_CIN")
    private String medCin;

    @Column(name = "MED_MF")
    private String medMf;

    @Column(name = "MED_TVA")
    private String medTva;

    @Column(name = "MED_CAT")
    private String medCat;

    @Column(name = "MED_SEC")
    private String medSec;

    @Column(name = "MED_TEL")
    private String medTel;

    @Column(name = "MED_FAX")
    private String medFax;

    @Column(name = "MED_EMAIL")
    private String medEmail;

    @Column(name = "MED_TEL2")
    private String medTel2;

    @Column(name = "BNQ_CODE")
    private Integer bnqCode;

    @Column(name = "AGC_CODE")
    private Integer agcCode;

    @Column(name = "MED_RIB")
    private String medRib;

    @Column(name = "RMO_CODE")
    private Integer rmoCode;

    @Column(name = "TMO_CODE")
    private Integer tmoCode;

    @Column(name = "MED_CPT")
    private String medCpt;

    @Column(name = "UTIL")
    private String util;

    @Column(name = "OP")
    private String op;

    @Column(name = "DATOP")
    private Date datop;

    @Column(name = "CONVENTION")
    private Integer convention;

    @Column(name = "PERMIS")
    private Integer permis;

    @Column(name = "AUTRE")
    private Integer autre;

    @Column(name = "SPECIALITE")
    private String specialite;

    @Column(name = "ORGANISME_EMPLOYEUR")
    private String organismeEmployeur;

    @Column(name = "MED_TYP")
    private Integer medTyp;

    @Column(name = "TP")
    private String tp;

    @Column(name = "CCNAM")
    private Long ccnam;

    @Column(name = "TAUX_FISC")
    private Long tauxFisc;

    @Column(name = "COD_GOUV")
    private Integer codGouv;



    @Column(name = "UTIL_CREATED_BY")
    private String utilCreatedBy;

    @Column(name = "UTIL_CREATED_ON")
    private Date utilCreatedOn;

    @Column(name = "UTIL_UPDATED_BY")
    private String utilUpdatedBy;

    @Column(name = "UTIL_UPDATED_ON")
    private Date utilUpdatedOn;

    @Column(name = "UTIL_REMOTEUSER")
    private String utilRemoteUser;

    @Column(name = "UTIL_TRAC")
    private String utilTrac;

    @Column(name = "PAGE_TRAC")
    private String pageTrac;

    @ManyToOne
    @JoinColumn(name = "CENT_CODE")
    private CentreMedical centreMedical;

    @ManyToOne
    @JoinColumn(name = "SPECM_CODE") // Foreign key column
    private MedSpec medSpec;

    @OneToMany(mappedBy = "medorg", fetch = FetchType.LAZY)
    private Set<VisiteMedical> visiteMedicalList;

    @ManyToOne
    @JoinColumn(name = "IDT_MATAG", referencedColumnName = "IDT_MATAG")
    private Idtagent idtMatag;

    @ManyToOne
    @JoinColumn(name = "LOC_CODE", referencedColumnName = "LOC_CODE", insertable = false, updatable = false)
    private Localite localite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GOV_CODE", referencedColumnName = "GOV_CODE")
    private Gouvernorat gouvernorat;
}
