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
@Table(name = "LOCALITE", schema = "GRH_TUN")
public class Localite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOC_CODE", nullable = false)
    private Integer locCode;

    @Column(name = "LOC_DSG", nullable = false)
    private String locDsg;

    @Column(name = "LOC_DSGAR", nullable = false)
    private String locDsgar;

    @Column(name = "UTIL")
    private String util;

    @Column(name = "OP")
    private String op;

    @Column(name = "DATOP")
    private Date datop;

    @Column(name = "X")
    private Double x;

    @Column(name = "Y")
    private Double y;

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
    @JoinColumn(name = "IDT_MATAG", nullable = false)
    private Idtagent idTagent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GOV_CODE", referencedColumnName = "GOV_CODE")
    private Gouvernorat gouvernorat;

    @OneToMany(mappedBy = "localite")
    private Set<Medorg> medorgList;


}
