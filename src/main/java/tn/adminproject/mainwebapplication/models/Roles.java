package tn.adminproject.mainwebapplication.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "roles")
public class Roles implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private ERole name;

	public Roles() {
	}
	public Roles(ERole name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}


}
