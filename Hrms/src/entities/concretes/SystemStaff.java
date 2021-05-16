package entities.concretes;


public class SystemStaff extends User{
	private String firstName;
	private String lastName;
	private String position;


	public SystemStaff(String email, String password, int id, String firstName, String lastName, String position) {
		super(email, password, id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
}
