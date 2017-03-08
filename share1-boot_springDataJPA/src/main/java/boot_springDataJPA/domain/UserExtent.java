package boot_springDataJPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserExtent {
	
	@Id
	@GeneratedValue
	private Long personId;
	
	private String personName;
	
	private String guanlian;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getGuanlian() {
		return guanlian;
	}

	public void setGuanlian(String guanlian) {
		this.guanlian = guanlian;
	}

	public UserExtent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserExtent(Long personId, String personName, String guanlian) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.guanlian = guanlian;
	}
	
}
