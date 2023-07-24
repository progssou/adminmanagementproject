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
@Table(name = "MED_DISPONIBLE", schema = "GRH_TUN")
public class MedDisponible implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISP_CODE", length = 200)
    private String dispCode;

    @Column(name = "DISP_DEB")
    private Date dispDeb;

    @Column(name = "DISP_FIN")
    private Date dispFin;

    @Column(name = "IS_RECURRING", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Integer isRecurring;

    @Column(name = "TOUTE_LA_JOURNEE", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Integer touteLaJournee;

    @Column(name = "CODE_CENTRE")
    private Integer codeCentre;

    @Column(name = "DISP_QUOTA")
    private Integer dispQuota;

    @Column(name = "VIS_SEQID", length = 200)
    private String visSeqId;

    @Column(name = "DISPDATE")
    private Date dispDate;

    @Column(name = "SALLE_CODE")
    private Long salleCode;

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

    @ManyToOne(fetch = FetchType.LAZY) // Set fetch type to LAZY for better performance
    @JoinColumn(name = "CONV_CODE", referencedColumnName = "CONV_CODE")
    private MedConvention medConvention; // The @ManyToOne relationship with MedConvention
}
