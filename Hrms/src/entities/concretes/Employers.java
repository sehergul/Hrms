package entities.concretes;

public class Employers extends User{
	private String companyName;
	private String website;
	private long phoneNumber;
	
	
	public Employers() {}
	
	public Employers(String email, String password, int id, String companyName, String website, long phoneNumber) {
		super(email, password, id);
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	

}
