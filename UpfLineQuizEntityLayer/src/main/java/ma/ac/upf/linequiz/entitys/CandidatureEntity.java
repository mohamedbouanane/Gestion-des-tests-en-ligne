package ma.ac.upf.linequiz.entitys;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "candidature")
public class CandidatureEntity {

	@Id
	@Column(name="id_candidature")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "candidat_fk", nullable=false)
	private CandidatEntity candidat;
	
	// OffsetDateTime : https://www.baeldung.com/jpa-java-time
	@Column(name = "dateheur_du_test", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	private OffsetDateTime  dateHeurDuTest;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "reponse_fk")
	List<ReponsePossibleEntity> lsReponse;
	
	@Column(name="code_candidature", length=10, nullable=true)
	private String codeCandidature;
	
	@Column(name="note_finale", length=7, nullable=true)
	private String noteFinale;

	
	public CandidatureEntity(CandidatEntity candidat, OffsetDateTime dateHeurDuTest , String codeCandidature, String noteFinale) {
		super();
		this.candidat = candidat;
		//this.dateHeurDuTest = dateHeurDuTest;
		this.codeCandidature = codeCandidature;
		this.noteFinale = noteFinale;
	}
		
}
