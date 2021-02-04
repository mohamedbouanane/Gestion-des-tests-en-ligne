package ma.ac.upf.linequiz.dao.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "utilisateur")
public class UtilisateurEntity implements Serializable {

	private static final long serialVersionUID = 8718435441823598950L;

	@Id
	@Column(name = "id_utilisateur")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "candidat_fk", nullable=false)
	private CandidatEntity candidat;
	
	@Column(name="login", length=30, nullable=false)
	private String login;
	
	@Column(name="password", length=30, nullable=false)
	private String password;

	@Column(name="token")
	private String token;
	
	
	public UtilisateurEntity(CandidatEntity candidat, String login, String password) {
		super();
		this.candidat = candidat;
		this.login = login;
		this.password = password;
	}
	
}
