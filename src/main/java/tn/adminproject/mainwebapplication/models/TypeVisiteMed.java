package tn.adminproject.mainwebapplication.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "TYPE_VISITE_MED", schema = "GRH_TUN")
public class TypeVisiteMed implements Serializable {
    @Id
    @Column(name = "TVM_CODE")
    private Integer tvmCode;

    @Column(name = "TVM_DSGAR")
    private String tvmDsgar;

    @Column(name = "TVM_DSG")
    private String tvmDsg;

    @Column(name = "TVM_NATURE")
    private Integer tvmNature;

    @Column(name = "UTIL_CREATED_BY")
    private String utilCreatedBy;

    @Column(name = "UTIL_CREATED_ON")
    private LocalDateTime utilCreatedOn;

    @Column(name = "UTIL_UPDATED_BY")
    private String utilUpdatedBy;

    @Column(name = "UTIL_UPDATED_ON")
    private LocalDateTime utilUpdatedOn;

    @Column(name = "UTIL_REMOTEUSER")
    private String utilRemoteUser;

    @Column(name = "UTIL_TRAC")
    private String utilTrac;

    @Column(name = "PAGE_TRAC")
    private String pageTrac;

    @OneToMany(mappedBy = "typeVisiteMed", fetch = FetchType.LAZY)

    private Set<VisiteMedical> visiteMedicalList;
}
