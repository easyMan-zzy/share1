package boot_springDataJPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long personId;
	
	private String guanlian;
	
	private String a;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getGuanlian() {
		return guanlian;
	}

	public void setGuanlian(String guanlian) {
		this.guanlian = guanlian;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public User(Long personId, String guanlian, String a) {
		super();
		this.personId = personId;
		this.guanlian = guanlian;
		this.a = a;
	}

	public User() {
		super();
	}
	
}
