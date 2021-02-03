package ma.ac.upf.linequiz.dao.entities;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data	// Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 
@Entity
@Table(name = "candidat")
public class CandidatEntity implements Serializable {

	private static final long serialVersionUID = -5333008388870411418L;

	@Id
	@Column(name = "id_candidat")
	private Long id;
	
	@Column(name="nom", length=30, nullable=false)
	private String nom;
	
	@Column(name="prenom", length=30, nullable=false)
	private String prenom;
	
	@Column(name="ecole", length=30, nullable=false)
	private String ecole;
	
	@Column(name="filiere", length=80, nullable=true)
	private String filiere;
	
	@Column(name="email", length=80, nullable=false)
	private String email;
	
	@Column(name="gsm", length=10, nullable=false)
	private String gsm;

	
	public CandidatEntity(String nom, String prenom, String ecole, String filiere, String email, String gsm) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ecole = ecole;
		this.filiere = filiere;
		this.email = email;
		this.gsm = gsm;
	}
	
}
