package tn.adminproject.mainwebapplication.models;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import tn.adminproject.mainwebapplication.models.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email")
})

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 20)
	private String nom;

	@Size(max = 20)
	// Control de saisie : Not a Number
	private String prenom;

	@Size(max = 20)
	String username;

	@Email
	@Size(max=50)
	private String email;

	@Size(min = 4 , max = 20 )
	// Control de saisie
	private String password;

	@Size (max = 50)
	private String address;

	// Twilio Validation API
	private String phoneNumber;

	// Control de saisie par date
	@Temporal(TemporalType.DATE)
	private Date birthDate ;

	private boolean connected;

	private boolean isEnabled;

	private boolean stateUser;

	// Relation Many to Many with

	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinTable(name = "user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Roles> roles = new HashSet<>();

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	// Constructor for the signup request

	public User(@Size(max = 80) String username, @Size(max = 50) @Email String email, @Size(max = 120) String password,
				String address, @Size(max = 50) String tel, @Size(max = 50) String nom, @Size(max = 50) String prenom, Date birthDate) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = tel;
		this.nom = nom;
		this.prenom = prenom;
		//Control de saisie : <18 ans
		this.birthDate=birthDate;

	}
}
