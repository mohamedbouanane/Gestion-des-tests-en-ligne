package ma.ac.upf.linequiz.entitys;

import java.io.Serializable;
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
@Table(name = "question")
public class QuestionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1775875953575489400L;

	@Id
	@Column(name="id_question", unique = true, nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "enonce_question", nullable = false)
	private String enonceQuestion;
	
	@Column(name = "reponses_multyples ", nullable = false)
	private Boolean reponsesMultyples;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "reponse_possibles_fk")
	List<ReponsePossibleEntity> lsReponsePossibles;

	
	public QuestionEntity(String enonceQuestion, Boolean reponsesMultyples,
			List<ReponsePossibleEntity> lsReponsePossibles) {
		super();
		this.enonceQuestion = enonceQuestion;
		this.reponsesMultyples = reponsesMultyples;
		this.lsReponsePossibles = lsReponsePossibles;
	}
	
}
