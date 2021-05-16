package business.concretes;

import business.abstracts.HrmsVerificationService;
import business.abstracts.VerificationService;
import entities.concretes.Employers;
import entities.concretes.SystemStaff;

public class HRMSVerificationManager implements HrmsVerificationService{
	
	@Override
	public boolean hrmsVerification(SystemStaff systemStaff, Employers employers) {
		System.out.println(employers.getCompanyName() + " þirketi " + systemStaff.getFirstName() + " tarafýndan doðrulanmýþtýr!");
		return true;
	}

}
