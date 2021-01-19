package ma.ac.upf.linequiz.entitys;

import java.io.Serializable;
import java.time.OffsetDateTime;

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
@Table(name = "dateDuTest")
public class DateDuTestEntity implements Serializable {

	private static final long serialVersionUID = -7753178879682897819L;

	@Id
	@Column(name="id_date_test")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	// OffsetDateTime : DateTime with time zone : https://www.baeldung.com/jpa-java-time
	// OffsetDateTime odt = OffsetDateTime.now( ZoneOffset.UTC ) ;
	@Column(name = "date_heur_du_test", nullable=false /*, columnDefinition = "TIMESTAMP WITH TIME ZONE"*/)
	private OffsetDateTime  dateHeurDuTest;

	public DateDuTestEntity(OffsetDateTime dateHeurDuTest) {
		super();
		this.dateHeurDuTest = dateHeurDuTest;
	}
	
}
