package tn.adminproject.mainwebapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.api.client.util.DateTime;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "VISITE_MEDICAL", schema = "GRH_TUN")
public class VisiteMedical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VIS_SEQID")
    private String visSeqId;

    @Column(name = "VIS_CIN")
    private String visCin;

    @Column(name = "VIS_DATE")
    private LocalDateTime visDate;

    @Column(name = "VIS_COMMENTAIRE")
    private String visCommentaire;

    @Column(name = "VIS_DECISION")
    private Integer visDecision;

    @Column(name = "VIS_PRESENCE", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Integer visPresence;

    @Column(name = "DT_PROCH_VISITE")
    private LocalDateTime dtProchVisite;

    @Column(name = "CES_ANNEE")
    private Integer cesAnnee;

    @Column(name = "CES_NUM")
    private Integer cesNum;

    @Column(name = "TYC_TYPE")
    private Integer tycType;

    @Column(name = "DUREE")
    private Integer duree;

    @Column(name = "VIS_HEURE")
    private Date visHeure;

    @Column(name = "SYS_ANNEE")
    private Integer sysAnnee;

    @Column(name = "SYS_NUM")
    private Integer sysNum;

    @Column(name = "CODE_UFG")
    private String codeUfg;

    @Column(name = "CODE_UFA")
    private String codeUfa;

    @Column(name = "VIS_HEURS")
    private DateTime visHeurs;

    @Column(name = "VIS_POSTE")
    private Long visPoste;

    @Column(name = "V1")
    private Integer v1;

    @Column(name = "V2")
    private Integer v2;

    @Column(name = "V3")
    private Integer v3;

    @Column(name = "V4")
    private Integer v4;

    @Column(name = "V5")
    private Integer v5;

    @Column(name = "V6")
    private Integer v6;

    @Column(name = "CODE_PART")
    private Integer codePart;

    @Column(name = "EXTIDTAGENT")
    private Integer extIdTagent;

    @Column(name = "VIS_CODE_PATIENT")
    private String visCodePatient;

    @Column(name = "VIS_PAT_NOM")
    private String visPatNom;

    @Column(name = "VIS_PAT_PRENOM")
    private String visPatPrenom;

    @Column(name = "VIS_DATE_FIN")
    private Date visDateFin;

    @Column(name = "IS_RECURRING", columnDefinition = "NUMBER DEFAULT 0")
    private Integer isRecurring;

    @Column(name = "TOUTE_LA_JOURNEE", columnDefinition = "NUMBER DEFAULT 0")
    private Integer touteLaJournee;

    @Column(name = "VIS_PAT_CNAM")
    private String visPatCnam;

    @Column(name = "SPECM_CODE")
    private Integer specmCode;

    @Column(name = "VIS_CHOIX_SYS", columnDefinition = "VARCHAR2(1 BYTE) DEFAULT '0'")
    private String visChoixSys;

    @Column(name = "EMP_CODE")
    private Long empCode;

    @Column(name = "CONT_CODE")
    private Long contCode;

    @Column(name = "VIS_ENV_SPEC")
    private Integer visEnvSpec;

    @Column(name = "VIS_URGENCE")
    private String visUrgence;

    @Column(name = "VIS_INTERVENANT")
    private String visIntervenant;

    @Column(name = "VIS_LIEU")
    private String visLieu;

    @Column(name = "VIS_URG_ACC")
    private String visUrgAcc;

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

    @Column(name = "TDEC_CODE", columnDefinition = "NUMBER DEFAULT 0")
    private Integer tdecCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TVM_CODE", referencedColumnName = "TVM_CODE")
    @JsonIgnore
    private TypeVisiteMed typeVisiteMed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDT_MATAG")
    private Idtagent idTagent;

    @ManyToOne
    @JoinColumn(name = "CENT_CODE")
    private CentreMedical centreMedical;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MED_CODE")
    private Medorg medorg;
}