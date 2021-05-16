package business.concretes;

import business.abstracts.EmailVerificationService;
import business.abstracts.VerificationService;
import core.PersonCheckService;
import entities.concretes.JobSeekers;

public class JobSeekerVerificationManager implements VerificationService{
	
	private PersonCheckService personCheckService;
	private EmailVerificationService emailVerificationService;
	
	
	public JobSeekerVerificationManager(PersonCheckService personCheckService,
			EmailVerificationService emailVerificationService) {
		super();
		this.personCheckService = personCheckService;
		this.emailVerificationService = emailVerificationService;
	}
	
	public boolean verification(JobSeekers jobSeeker) {
		if(personCheckService.checkIfRealPerson(jobSeeker)==true &&
				emailVerificationService.checkIfEmailExist(jobSeeker)==true &&
				emailVerificationService.checkActivationCode(jobSeeker)==true) 
			return true;
		else 
			return false;
		
	}
	

}
