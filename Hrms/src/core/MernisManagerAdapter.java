package core;

import java.rmi.RemoteException;

import core.PersonCheckService;
import entities.concretes.JobSeekers;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements PersonCheckService{
	@Override
	public boolean checkIfRealPerson(JobSeekers jobSeekers) {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result=true;
		try {        
			result = client.TCKimlikNoDogrula(jobSeekers.getNationalityId(), 
					jobSeekers.getFirstName().toUpperCase(),
					jobSeekers.getLastName().toUpperCase(), jobSeekers.getDateOfBirth().getYear());
		}catch (RemoteException e) {
          e.printStackTrace();
		}
		if (result==true)
			System.out.println(jobSeekers.getFirstName() + " " + jobSeekers.getLastName() + " kiþisi doðrulandý.");
		else
			System.out.println(jobSeekers.getFirstName() + " " + jobSeekers.getLastName() + " geçerli bir kiþi deðil!");
		return result;
	
	}

}
