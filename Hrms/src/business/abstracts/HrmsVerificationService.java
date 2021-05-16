package business.abstracts;

import entities.concretes.Employers;
import entities.concretes.SystemStaff;

public interface HrmsVerificationService {
	 boolean hrmsVerification(SystemStaff systemStaff, Employers employers);
}
