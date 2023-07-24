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
@Table(name = "CENTRE_MEDICAL", schema = "GRH_TUN")
public class CentreMedical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CENT_CODE", nullable = false)
    private Integer centCode;

    @Column(name = "CENT_DSGRA", nullable = false)
    private String centDsgRa;

    @Column(name = "CENT_DSG", nullable = false)
    private String centDsg;

    @Column(name = "CENT_TEL")
    private String centTel;

    @Column(name = "CENT_FAX")
    private String centFax;

    @Column(name = "CENT_MAIL")
    private String centMail;

    @Column(name = "CENT_OBS")
    private String centObs;

    @Column(name = "IDT_MATAG")
    private Integer idtMatag;

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

    @OneToMany(mappedBy = "centreMedical")
    private Set<VisiteMedical> visites;

    @OneToMany(mappedBy = "centreMedical", cascade = CascadeType.ALL)
    private Set<Medorg> medorgs;

    @ManyToOne
    @JoinColumn(name = "SPEC_CODE", referencedColumnName = "SPEC_CODE")
    private CentreSpec centreSpec;

    @ManyToOne
    @JoinColumn(name = "GOV_CODE", nullable = false)
    private Gouvernorat gouvernorat;
}
