package tn.adminproject.mainwebapplication.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "IDTAGENT", schema = "GRH_TUN")
public class Idtagent implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_MATAG")
    private Integer idMatag;

    @Column(length = 10)
    private String idtBadge;

    @Column(precision = 10, scale = 2)
    private Integer tyhType;

    @Column(precision = 10, scale = 2)
    private Integer rghType;

    @Column(precision = 10, scale = 2)
    private Integer payCode;

    @Column(length = 40)
    private String idtNomag;

    @Column(length = 200)
    private String idtNomagar;

    @Column(length = 30)
    private String idtPrnag;

    @Column(length = 200)
    private String idtPrnagar;

    @Column(length = 30)
    private String idtNomjf;

    @Column(length = 30)
    private String idtNomjfar;

    @Column(length = 30)
    private String idtPrnpe;

    @Column(length = 30)
    private String idtPrnpear;

    @Column(length = 30)
    private String idtPrngp;

    @Column(length = 30)
    private String idtPrngpar;

    @Column(length = 30)
    private String idtPrnme;

    @Column(length = 30)
    private String idtPrnmear;

    @Column
    private LocalDate idtDatnais;

    @Column(length = 20)
    private String idtLnaisar;

    @Column(length = 20)
    private String idtLnais;

    @Column(precision = 10, scale = 2)
    private Integer idtSxage;

    @Column(precision = 10, scale = 2)
    private Integer idtSfmag;

    @Column(length = 200)
    private String idtAdres;

    @Column(length = 200)
    private String idtAdresar;

    @Column(precision = 10, scale = 2)
    private Integer locCode;

    @Column(length = 80)
    private String idtAdres2;

    @Column(length = 80)
    private String idtAdresar2;

    @Column(precision = 10, scale = 2)
    private Integer locCode2;

    @Column(length = 20)
    private String idtTelag1;

    @Column(length = 20)
    private String idtTelag2;

    @Column(precision = 10, scale = 2)
    private Integer idtTyppce;

    @Column(length = 15)
    private String idtCin;

    @Column
    private LocalDate idtDatcin;

    @Column(length = 20)
    private String idtLdeli;

    @Column(length = 20)
    private String idtLdeliar;

    @Column(precision = 10, scale = 2)
    private Integer idtCodstat;

    @Column
    private LocalDate idtDatrec;

    @Column
    private LocalDate idtDattit;

    @Column(precision = 10, scale = 2)
    private Integer idtMatre;

    @Column(precision = 10, scale = 2)
    private Integer idtMatas;

    @Column(length = 20)
    private String idtPas;

    @Column(precision = 10, scale = 2)
    private Integer idtTypcais;

    @Column(length = 3)
    private String idtGrsg;

    @Column(precision = 10, scale = 2)
    private Integer idtMil;

    @Column(precision = 10, scale = 2)
    private Integer idtChoCode;

    @Column(precision = 10, scale = 2)
    private Integer idtFonCode;

    @Column(precision = 10, scale = 2)
    private Integer idtPosCode;

    @Column(precision = 10, scale = 2)
    private Integer idtSposCode;

    @Column(nullable = false, precision = 10, scale = 2)
    private Integer idtChef;

    @Column(precision = 10, scale = 2)
    private Integer idtNbEnfImp;

    @Column(precision = 10, scale = 2)
    private Integer idtNbEnfAll;

    @Column(length = 4)
    private String idtCategorie;

    @Column(length = 1)
    private String idtRegime;

    @Column(precision = 10, scale = 2)
    private Integer idtConjoint;

    @Column(length = 30)
    private String util;

    @Column(length = 1)
    private String op;

    @Column
    private LocalDate datop;

    @Column
    private LocalDate idtDateFon;

    @Column
    private LocalDate idtDateCho;

    @Column
    private LocalDate idtDatePos;

    @Column
    private LocalDate idtDateSpos;

    @Column
    private LocalDate idtDateCat;

    @Column
    private LocalDate idtDateResid;

    @Column(precision = 10, scale = 2)
    private Integer idtAncFon;

    @Column(precision = 10, scale = 2)
    private Integer idtAncCho;

    @Column(precision = 10, scale = 2)
    private Integer idtAncPos;

    @Column(precision = 10, scale = 2)
    private Integer idtAncSpos;

    @Column(precision = 10, scale = 2)
    private Integer idtAncCat;

    @Column(precision = 10, scale = 2)
    private Integer idtAncResid;

    @Column
    private LocalDate ancDateFon;

    @Column
    private LocalDate ancDateCho;

    @Column
    private LocalDate ancDatePos;

    @Column
    private LocalDate ancDateSpos;

    @Column
    private LocalDate ancDateCat;

    @Column(length = 30)
    private String idtResid;

    @Column(length = 20)
    private String rib;

    @Column(precision = 10, scale = 2)
    private Integer idtDom;

    @Column(precision = 10, scale = 2)
    private Integer idtBnk;

    @Column(precision = 10, scale = 2)
    private Integer idtAllfam;

    @Column(precision = 10, scale = 2)
    private Integer idtSunique;

    @Column(length = 12)
    private String idtCnss;

    @Column(length = 150)
    private String idtAllfOb1;

    @Column(length = 150)
    private String idtAllfOb2;

    @Column(length = 150)
    private String idtAllfOb3;

    @Column(length = 1)
    private String idtTyprec;

    @Column
    private LocalDate idtDateVisite;

    @Column(length = 2)
    private String idtClassep;

    @Column
    private LocalDate idtDateClassep;

    @Column(precision = 10, scale = 2)
    private Integer idtEmpCode;

    @Column
    private LocalDate idtDateEmploi;

    @Column(precision = 10, scale = 2)
    private Integer idtTypeCorps;

    @Column
    private LocalDate idtDateCorps;

    @Column(precision = 10, scale = 2)
    private Integer typLog;

    @Column(precision = 10, scale = 2)
    private Integer idtTypeagent;

    @Column(precision = 10, scale = 2)
    private Integer idtCollegeCode;

    @Column
    private LocalDate idtDateCollege;

    @Column(length = 20)
    private String idtAffectGeo;

    @Column(precision = 10, scale = 2)
    private Integer idtAncEmp;

    @Column
    private LocalDate ancDateEmp;

    @Column(precision = 10, scale = 2)
    private Integer idtSpecialite;

    @Column
    private LocalDate idtDateSpecialite;

    @Column
    private LocalDate idtDatintegr;

    @Column(precision = 10, scale = 2)
    private Integer voiture;

    @Column(precision = 10, scale = 2)
    private Integer lbrCode;

    @Column(precision = 10, scale = 2)
    private Integer nbrLitre;

    @Column(precision = 10, scale = 2)
    private Integer idtSpecifique;

    @Column(length = 10)
    private String idtNumTel;

    @Column(length = 100)
    private String idtPrnUrg;

    @Column(length = 100)
    private String idtNomUrg;

    @Column(length = 100)
    private String idtTypeResid;

    @Column(length = 100)
    private String idtTournee;

    @Column(precision = 10, scale = 2)
    private Integer idtOrdre;

    @Column(length = 2)
    private String idtCle;

    @Column
    private LocalDate dateOct;

    @Column(length = 100)
    private String refOct;

    @Column(precision = 11, scale = 3)
    private Integer reduction;

    @Column
    private LocalDate dateBenefice;

    @Column(precision = 10, scale = 2)
    private Integer ur;

    @Column(length = 30)
    private String ufg;

    @Column(precision = 10, scale = 2)
    private Integer ufc;

    @Column(precision = 10, scale = 2)
    private Integer grpCateg;

    @Column(length = 30)
    private String ufa;

    @Column
    private LocalDate dtGrpCateg;

    @Column(precision = 10, scale = 2)
    private Integer idtHrcCode;

    @Column
    private LocalDate idtDateHrc;

    @Column(precision = 10, scale = 2)
    private Integer idtDipCode;

    @Column
    private LocalDate idtDateDip;

    @Column(precision = 10, scale = 2)
    private Integer idtNiveau;

    @Column
    private LocalDate idtDateNiv;

    @Column(precision = 10, scale = 2)
    private Integer idtGrpNiv;

    @Column(precision = 10, scale = 2)
    private Integer idtRgpCode;

    @Column
    private LocalDate idtDateUfg;

    @Column(precision = 10, scale = 2)
    private Integer idtInterim;

    @Column
    private LocalDate idtDateInterim;

    @Column(precision = 10, scale = 2)
    private Integer idtPoste;

    @Column
    private LocalDate idtDatePoste;

    @Column(precision = 10, scale = 2)
    private Integer idtFonction;

    @Column
    private LocalDate idtDateFonction;

    @Column(precision = 10, scale = 2)
    private Integer idtOrgCode;

    @Column(precision = 10, scale = 2)
    private Integer idtPaysDetachement;

    @Column(precision = 10, scale = 2)
    private Integer idtTypPaiement;

    @Column(precision = 10, scale = 2)
    private Integer idtRemb;

    @Column(precision = 10, scale = 2)
    private Integer idtAstrt;

    @Column
    private LocalDate idtDateAstrt;

    @Column(precision = 10, scale = 2)
    private Integer mobylette;

    @Column(length = 20)
    private String numPas;

    @Column
    private LocalDate dateValPas;

    @Column
    private LocalDate dateCrePas;

    @Column(length = 20)
    private String numPerm;

    @Column
    private LocalDate dateValPerm;

    @Column
    private LocalDate dateCrePerm;

    @Column(precision = 10, scale = 2)
    private Integer idtTypePermis;

    @Column(length = 20)
    private String idtUfNotation;

    @Column
    private LocalDate idtDateDeclartion;

    @Column
    private LocalDate idtDateAffiliation;

    @Column(precision = 10, scale = 2)
    private Integer locNais;

    @Column(precision = 10, scale = 2)
    private Integer idtSrvCont;

    @Column(length = 50)
    private String idtBurVote;

    @Column(precision = 10, scale = 2)
    private Integer idtExoneration;

    @Column
    private LocalDate idtDateSrvCont;

    @Column
    private LocalDate idtDateExoner;

    @Column(precision = 10, scale = 2)
    private Integer idtPointage;

    @Column(length = 20)
    private String idtRangTrn;

    @Column(length = 20)
    private String idtSuccesTrn;

    @Column(precision = 10, scale = 2)
    private Integer idtReducElect;

    @Column
    private LocalDate idtReducElectDt;

    @Column(precision = 10, scale = 2)
    private Integer idtReducGaz;

    @Column
    private LocalDate idtReducGazDt;

    @Column
    private LocalDate idtDateVoiture;

    @Column(precision = 10, scale = 2)
    private Integer idtRangBenifice;

    @Column(length = 20)
    private String idtResidInterim;

    @Column(length = 20)
    private String refVoiture;

    @Column(length = 20)
    private String numTelAstrt;

    @Column(precision = 19, scale = 3)
    private Integer quotaTelMens;

    @Column(precision = 19, scale = 3)
    private Integer quotaTelMensFixe;

    @Column(length = 20)
    private String numCarteCirculation;

    @Column
    private LocalDate dtNumCarteCirculation;

    @Column
    private LocalDate dtMilitaire;

    @Column(length = 20)
    private String refGrat;

    @Column(length = 8)
    private String refGrat1;

    @Column(length = 3)
    private String refGrat2;

    @Column(length = 1)
    private String refGrat3;

    @Column(precision = 10, scale = 2)
    private Integer csmCompConj;

    @Column
    private LocalDate dtRefSup;

    @Column(precision = 19, scale = 3)
    private Integer cumImposable;

    @Column(precision = 15, scale = 3)
    private Integer cumIrpp;

    @Column(length = 1)
    private String idtPosteAnal;

    @Column(precision = 10, scale = 2)
    private Integer idtCptAnal;

    @Column(precision = 10, scale = 2)
    private Integer idtRegAnal;

    @Column(precision = 10, scale = 2)
    private Integer idtSeance;

    @Column(length = 21)
    private String idtResidLc;

    @Column(length = 20)
    private String codeAnme;

    @Column(precision = 10, scale = 2)
    private Integer idtDegresHandicap;

    @Column
    private LocalDate idtDtRetraite;

    @Column(length = 20)
    private String numHandicap;

    @Column(precision = 10, scale = 2)
    private Integer indicAnme;

    @Column(precision = 10, scale = 2)
    private Integer idtFonAvg;

    @Column
    private LocalDate idtDateFonavg;

    @Column(precision = 10, scale = 2)
    private Integer filiereCnam;

    @Column(length = 100)
    private String email;

    @Column(precision = 10, scale = 2)
    private Integer idtCabs;

    @Column(precision = 10, scale = 2)
    private Integer idtTcbs;

    @Column(precision = 10, scale = 2)
    private Integer idtTabs;

    @Column(precision = 10, scale = 2)
    private Integer idtCmbs;

    @Column(precision = 10, scale = 2)
    private Integer idtCcbs;

    @Column(precision = 10, scale = 2)
    private Integer idtAssGrp;

    @Column
    private LocalDate dateSu;

    @Column(length = 500)
    private String idtAgentPicture;

    @Column(precision = 10, scale = 2)
    private Integer centreCode;

    @Column(precision = 10, scale = 2)
    private Integer payAdresCode;

    @Column(length = 200)
    private String utilCreatedBy;

    @Column
    private LocalDate utilCreatedOn;

    @Column(length = 200)
    private String utilUpdatedBy;

    @Column
    private LocalDate utilUpdatedOn;

    @Column(length = 4000)
    private String utilRemoteuser;

    @Column(length = 50)
    private String utilTrac;

    @Column(length = 200)
    private String pageTrac;

    @Column(length = 5)
    private String idtCorps;

    @Column(precision = 10, scale = 2)
    private Integer idtGrpCode;

    @Column(precision = 10, scale = 2)
    private Integer idtGrdCode;

    @Column(precision = 10, scale = 2)
    private Integer idtEmpSit;

    @Column(precision = 10, scale = 2)
    private Integer idtWfProfile;

    @Column(length = 20)
    private String ufaFon;

    @Column(precision = 10, scale = 2)
    private Integer numOrga;

    @Column
    private LocalDate debHandicap;

    @Column
    private LocalDate finHandicap;

    @Column(length = 200)
    private String prctHandicap;

    @Column(length = 20)
    private String idtSect;

    @Column
    private LocalDate idtDateSect;

    @Column(precision = 10, scale = 2)
    private Integer idtInstruct;

    @Column
    private LocalDate idtDateInstruct;

    @Column(length = 20)
    private String idtBaseGeo;

    @Column(precision = 10, scale = 2)
    private Integer orgaPayCode;

    @OneToOne(mappedBy = "idTagent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private VisiteMedical visiteMedical;

    @OneToMany(mappedBy = "idTagent", cascade = CascadeType.ALL)
    private Set<Localite> localites;

    @OneToMany(mappedBy = "idtMatag", cascade = CascadeType.ALL)
    private Set<Medorg> medorgList;

    @OneToOne(mappedBy = "idTagent", fetch = FetchType.LAZY) // The attribute name in the Emploi class that maps to this association
    private Emploi emploi;

}
