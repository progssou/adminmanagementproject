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
@Table(name = "GOUVERNORAT", schema = "GRH_TUN") // Change the schema name if necessary
public class Gouvernorat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GOV_CODE", nullable = false)
    private Integer govCode;

    @Column(name = "GOV_DSG", nullable = false)
    private String govDsg;

    @Column(name = "GOV_DSGAR", nullable = false)
    private String govDsgar;

    @Column(name = "UTIL")
    private String util;

    @Column(name = "OP")
    private String op;

    @Column(name = "DATOP")
    private Date datop;

    @Column(name = "REL_GOV_CODE")
    private String relGovCode;

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

    @OneToMany(mappedBy = "gouvernorat", fetch = FetchType.LAZY)
    private Set<Localite> localites;

    @OneToMany(mappedBy = "gouvernorat", fetch = FetchType.LAZY)
    private Set<Medorg> medorgs;

}