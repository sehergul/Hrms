package business.concretes;

import java.util.Random;
import java.util.Scanner;

import business.abstracts.EmailVerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.Employers;
import entities.concretes.JobSeekers;
import entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	private UserDao userDao;

	public EmailVerificationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean checkIfEmailExist(Employers employers) {
		if(userDao.getByMail(employers.getEmail())!=null)
			return false;
		return true;
	}

	
	@Override
	public boolean checkIfEmailExist(JobSeekers jobSeeker) {
		if(userDao.getByMail(jobSeeker.getEmail())!=null)
			return false;
		return true;
	}
	
	@Override
	public int activationCode(JobSeekers jobSeeker) {
		Random random = new Random();
        int verificationCode = random.nextInt(500)*10;
        System.out.println("Kod: " + verificationCode);
		return verificationCode;
	}
	
	@Override
	public int activationCode(Employers employers) {
		Random random = new Random();
        int verificationCode = random.nextInt(500)*10;
        System.out.println("Kod: " + verificationCode);
		return verificationCode;
	}

	@Override
	public boolean checkActivationCode(JobSeekers jobSeeker) {
		int verificationCode = activationCode(jobSeeker);
		Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doðrulama kodunu giriniz: ");
        int vCode = scanner.nextInt();
        
		if(verificationCode == vCode) {
			System.out.println("Kod doðrulandý!");
			System.out.println(jobSeeker.getFirstName() + " sisteme kaydoldu.");
			return true;}
		else {
			System.out.println("Kod doðrulanamadý!");
			System.out.println(jobSeeker.getFirstName() + " sisteme kaydolamadý!");
			return false;}
	}

	
	@Override
	public boolean checkActivationCode(Employers employers) {
		int verificationCode = activationCode(employers);
		Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doðrulama kodunu giriniz: ");
        int vCode = scanner.nextInt();
        
		if(verificationCode == vCode) {
			System.out.println("Kod doðrulandý!");
			System.out.println(employers.getCompanyName() + " sisteme kaydoldu.");
			return true;}
		else {
			System.out.println("Kod doðrulanamadý!");
			System.out.println(employers.getCompanyName() + " sisteme kaydolamadý!");
			return false;}
	}
}
