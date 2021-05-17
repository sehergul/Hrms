import java.time.LocalDate;

import business.concretes.EmailVerificationManager;
import business.concretes.EmployerVerificationManager;
import business.concretes.HRMSVerificationManager;
import business.concretes.JobPositionManager;
import business.concretes.JobSeekerVerificationManager;
import core.MernisManagerAdapter;
import dataAccess.abstracts.JobPositionDao;
import dataAccess.concretes.InMemoryJobPositionDao;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.Employers;
import entities.concretes.JobPosition;
import entities.concretes.JobSeekers;
import entities.concretes.SystemStaff;

public class Main {

	public static void main(String[] args) {
		
		SystemStaff systemStaff = new SystemStaff(null, null, 0, "Kerem", "Varýþ", "Bilgisayar Mühendisi");
		
		EmailVerificationManager emailVerificationManager = new EmailVerificationManager(new InMemoryUserDao());
		
		JobSeekers jobSeeker1 = new JobSeekers("engindemirog@gmail.com","12345", 1,"Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1));
		JobSeekerVerificationManager jobSeekerVerificationManager = new JobSeekerVerificationManager(new MernisManagerAdapter(), emailVerificationManager);
		jobSeekerVerificationManager.verification(jobSeeker1);
		
		System.out.println("\n\n----------\n\n");
		
		Employers employer1 = new Employers("desenpack@ambalaj.tr","678910",2,"DesenPack Ambalaj", "www.desenpack.com.tr",03323323232);
		EmployerVerificationManager employerVerificationManager = new EmployerVerificationManager(emailVerificationManager, new HRMSVerificationManager());
		employerVerificationManager.verification(systemStaff, employer1);
		
		System.out.println("\n\n----------\n\n");

		JobPosition jobPosition1 = new JobPosition("Yazýlým Mühendisi",5);
		JobPositionManager jobPositionManager = new JobPositionManager(new InMemoryJobPositionDao());
		jobPositionManager.add(jobPosition1);
		jobPositionManager.getAll();
		
		
	}

}
