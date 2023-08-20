package tn.adminproject.mainwebapplication.models;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GRBMEM_GROUP")
    private Long grbmenmember;


    @Column(name = "GRB_TYPE")
    private Integer type;

    @Column(name = "GRB_DESCRIPTION", length = 200)
    private String description;

    @Column(name = "GRB_ACTIVE")
    private Integer active;

    @Column(name = "GRB_EN_GROUP_NAME", length = 500)
    private String englishGroupName;

    @Column(name = "GRB_EN_GROUP_DESC", length = 500)
    private String englishGroupDescription;

    @Column(name = "GRB_AR_GROUP_NAME", length = 500)
    private String arabicGroupName;

    @Column(name = "GRB_AR_GROUP_DESC", length = 500)
    private String arabicGroupDescription;

    @Column(name = "GRB_FR_GROUP_NAME", length = 500)
    private String frenchGroupName;

    @Column(name = "GRB_FR_GROUP_DESC", length = 500)
    private String frenchGroupDescription;

    @Column(name = "GRB_TASKS_DISTRIBUTION")
    private Integer tasksDistribution;

    @Column(name = "GRB_WORKING_DAYS")
    private Integer workingDays;

    @Column(name = "GRBMEM_CREATED_BY", length = 200, nullable = false)
    private String createdBy;

    @Column(name = "GRBMEM_CREATED_ON")
    @Temporal(TemporalType.DATE)
    private Date createdOn;

    @Column(name = "GRBMEM_UPDATED_BY", length = 1000, nullable = false)
    private String updatedBy;

    @Column(name = "GRBMEM_UPDATED_ON")
    @Temporal(TemporalType.DATE)
    private Date updatedOn;
}
