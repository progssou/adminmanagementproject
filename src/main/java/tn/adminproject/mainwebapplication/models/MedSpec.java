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
@Table(name = "MED_SPEC", schema = "GRH_TUN")
public class MedSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPECM_CODE")
    private Integer specmCode;

    @Column(name = "SPECM_DSG")
    private String specmDsg;

    @Column(name = "SPECM_DSGAR")
    private String specmDsgar;

    @Column(name = "SPECM_DUREE")
    private Integer specmDuree;

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

    // Constructors, getters, setters, and other methods...

    // Other methods...
}

