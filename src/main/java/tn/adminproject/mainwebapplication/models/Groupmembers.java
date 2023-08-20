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
@Table(name = "groupmembers")
public class Groupmembers {

    @EmbeddedId
    private GroupMemberId id;

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

    @Embeddable
    public static class GroupMemberId implements Serializable {

        @Column(name = "GRBMEM_MEMBER")
        private Long member;


        @Column(name = "GRBMEM_GROUP")
        private Long group;

    }
}