package tn.adminproject.mainwebapplication.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ActEmploiId implements Serializable {
    private Emploi emploi;
    private ActMed actMed;
}

