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
@Table(name = "MED_UNITE")
public class MedUnite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNIT_CODE", nullable = false)
    private Integer unitCode;

    @Column(name = "UNIT_DSG", length = 200)
    private String unitDsg;

    @Column(name = "UNIT_DSGAR", length = 200)
    private String unitDsgar;

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

    @OneToMany(mappedBy = "medUnite")
    private Set<ActMed> actMeds;
}

