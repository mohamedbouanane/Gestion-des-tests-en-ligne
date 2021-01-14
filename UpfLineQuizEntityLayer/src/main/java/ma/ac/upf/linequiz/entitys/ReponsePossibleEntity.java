package ma.ac.upf.linequiz.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "reponse_possible")
public class ReponsePossibleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5461003393370452036L;

	@Id
	@Column(name="id_reponse_possible", unique = true, nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "reponse", nullable = false)
	private String reponse;
	
	@Column(name = "reponse_correcte", nullable = false)
	private Boolean reponseCorrecte;
	
	@Column(name = "note_reponse", nullable = false)
	private Byte noteReponse;

	
	public ReponsePossibleEntity(String reponse, Boolean reponseCorrecte, Byte noteReponse) {
		super();
		this.reponse = reponse;
		this.reponseCorrecte = reponseCorrecte;
		this.noteReponse = noteReponse;
	}
	
}
