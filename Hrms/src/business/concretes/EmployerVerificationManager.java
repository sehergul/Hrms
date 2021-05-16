package business.concretes;

import java.util.Random;

import business.abstracts.EmailVerificationService;
import business.abstracts.HrmsVerificationService;
import business.abstracts.VerificationService;
import entities.concretes.Employers;
import entities.concretes.JobSeekers;
import entities.concretes.SystemStaff;

public class EmployerVerificationManager implements VerificationService{
	
	private EmailVerificationService emailVerificationService;
	private HrmsVerificationService hrmsVerificationService;
	
	
	
	
	public EmployerVerificationManager(EmailVerificationService emailVerificationService,
			HrmsVerificationService hrmsVerificationService) {
		super();
		this.emailVerificationService = emailVerificationService;
		this.hrmsVerificationService = hrmsVerificationService;
	}




	public boolean verification(SystemStaff systemStaff, Employers employers) {
		if(emailVerificationService.checkIfEmailExist(employers)==true &&
				emailVerificationService.checkActivationCode(employers)==true && 
				hrmsVerificationService.hrmsVerification(systemStaff,employers)==true)
			return true;
		else
			return false;
	}

	
	


}
