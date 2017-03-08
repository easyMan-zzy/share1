package boot_springDataJPA.domain;

public class DTO {
	private String a;
	private String personName;
	
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DTO(String a, String personName) {
		super();
		this.a = a;
		this.personName = personName;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
}
