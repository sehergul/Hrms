package business.abstracts;

import entities.concretes.Employers;
import entities.concretes.JobSeekers;

public interface EmailVerificationService {
	boolean checkIfEmailExist(JobSeekers jobSeeker);
	boolean checkIfEmailExist(Employers employers);
	int activationCode(Employers employers);
	int activationCode(JobSeekers jobSeeker);
	boolean checkActivationCode(JobSeekers jobSeeker);
	boolean checkActivationCode(Employers employers);
}
