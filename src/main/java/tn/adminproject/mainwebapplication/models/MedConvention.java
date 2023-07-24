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
@Table(name = "MED_CONVENTION", schema = "GRH_TUN")
public class MedConvention implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONV_CODE", nullable = false)
    private Integer convCode;

    @Column(name = "CONV_DATE_DEB")
    private Date convDateDeb;

    @Column(name = "CONV_QUOTA")
    private Integer convQuota;

    @Column(name = "CONV_DATE_FIN")
    private Date convDateFin;

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
    @JoinColumn(name = "MED_CODE", referencedColumnName = "MED_CODE", nullable = false)
    private Medorg medOrg;

    @ManyToOne
    @JoinColumn(name = "CENT_CODE", referencedColumnName = "CENT_CODE", nullable = false)
    private CentreMedical centreMedical;
}

