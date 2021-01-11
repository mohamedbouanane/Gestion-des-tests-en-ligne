package ma.ac.upf.linequiz.entitys;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import ma.ac.upf.linequiz.bin.ThemeDuTest;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "test")
public class TestEntity {

	@Id
	@Column(name = "id_test")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "candidature_fk")
	private List<CandidatureEntity> lsCandidatures;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "question_fk")
	private List<QuestionEntity> lsQuestions;
	
	@Column(name = "nbr_segonds_par_question", nullable = false)
	private Short nbrSegondsParQuestion;
	
	@Column(name = "nbr_questions", nullable = false)
	private Short nbrQuestions;
	
	// EnumType.STRING : https://www.baeldung.com/jpa-persisting-enums-in-jpa
	@Column(name = "theme_du_test", nullable = false)
	@Enumerated(EnumType.STRING)
	private ThemeDuTest themeDuTest;
	
	@Column(name = "description", nullable = true)
	private String description;
	/*
	// A corriger
	@Column(name = "date_heur_test_fk", columnDefinition = "TIMESTAMP WITH TIME ZONE", nullable = false)
	//private List<OffsetDateTime> lsDateHeurTest;
	private OffsetDateTime lsDateHeurTest;
	*/
	public TestEntity(List<QuestionEntity> lsQuestions, Short nbrSegondsParQuestion, Short nbrQuestions, ThemeDuTest themeDuTest,
			String description, List<OffsetDateTime> lsDateHeurTest) {
		super();
		this.lsQuestions = lsQuestions;
		this.nbrSegondsParQuestion = nbrSegondsParQuestion;
		this.nbrQuestions = nbrQuestions;
		this.themeDuTest = themeDuTest;
		this.description = description;
		//this.lsDateHeurTest = lsDateHeurTest;
	}
	
}
