package ma.ac.upf.linequiz.dao.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "theme")
public class ThemeEntity implements Serializable {

	private static final long serialVersionUID = 7755563995629845603L;
	
	@Id
	@Column(name = "id_theme")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="titre", length=30, nullable=false)
	private String titre;

	
	public ThemeEntity(String titre) {
		super();
		this.titre = titre;
	}
	
}
