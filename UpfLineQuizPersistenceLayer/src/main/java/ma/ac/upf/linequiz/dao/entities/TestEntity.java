package ma.ac.upf.linequiz.dao.entities;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "test")
public class TestEntity implements Serializable {

	private static final long serialVersionUID = -8148111060080731353L;

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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "theme_du_test", nullable = false)
	private ThemeEntity themeDuTest;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "date_heur_test_fk", nullable = false)
	private List<DateDuTestEntity> lsDateDuTests;
	
	
	public TestEntity(List<QuestionEntity> lsQuestions, Short nbrSegondsParQuestion, Short nbrQuestions, ThemeEntity themeDuTest,
			String description, List<DateDuTestEntity> lsDateDuTests) {
		super();
		this.lsQuestions = lsQuestions;
		this.nbrSegondsParQuestion = nbrSegondsParQuestion;
		this.nbrQuestions = nbrQuestions;
		this.themeDuTest = themeDuTest;
		this.description = description;
		this.lsDateDuTests = lsDateDuTests;
	}
	
}
