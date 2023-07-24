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
@Table(name = "EMPLOI", schema = "GRH_TUN")
public class Emploi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_CODE", nullable = false)
    private Integer empCode;

    @Column(name = "EMP_DSGAR", nullable = false)
    private String empDsgAr;

    @Column(name = "EMP_DSG", nullable = false)
    private String empDsg;

    @Column(name = "EMP_NEC_FORMATION")
    private Integer empNecFormation;

    @Column(name = "EMP_CODE_SUIV")
    private Integer empCodeSuiv;

    @Column(name = "GRP_CATEG")
    private Integer grpCateg;

    @Column(name = "EMP_SIT")
    private Integer empSit;

    @Column(name = "EMP_TYPE")
    private Integer empType;

    @Column(name = "COLLEGE")
    private Integer college;

    @Column(name = "EMP_DATE")
    private Date empDate;

    @Column(name = "CODE_CNRPS", length = 20)
    private String codeCnrps;

    @Column(name = "ANC_CODE", length = 200)
    private String ancCode;

    @Column(name = "BON_REST")
    private Double bonRest;

    @Column(name = "CDR", length = 1, columnDefinition = "VARCHAR2(1 BYTE) DEFAULT '0'")
    private String cdr;

    @Column(name = "CGR_CODE")
    private Integer cgrCode;

    @Column(name = "NBRE_PAIE")
    private Integer nbrePaie;

    @Column(name = "MNT_DEMARCH_NET")
    private Double mntDemarchNet;

    @Column(name = "EMP_AVC", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Integer empAvC;

    @Column(name = "MNT_JF")
    private Double mntJf;

    @Column(name = "VAL_TREST")
    private Double valTrest;

    @Column(name = "RET_SAL", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Integer retSal;

    @Column(name = "CORPS_CODE", length = 5)
    private String corpsCode;

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

    @Column(name = "GRD_CODE")
    private Integer grdCode;

    @Column(name = "CATEG_CODE", length = 4)
    private String categCode;

    @Column(name = "ACTIF", columnDefinition = "NUMBER(1) DEFAULT 1")
    private Integer actif;

    @Column(name = "DT_DEB")
    private Date dtDeb;

    @Column(name = "DT_FIN")
    private Date dtFin;

    @OneToOne(fetch = FetchType.LAZY) // You can use FetchType.EAGER if you want to load the related entity eagerly
    @JoinColumn(name = "IDT_MATAG") // The foreign key column name in the EMPLOI table
    private Idtagent idTagent;
}
