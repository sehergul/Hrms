package core;

import entities.concretes.JobSeekers;

public interface PersonCheckService {
	boolean checkIfRealPerson(JobSeekers jobSeekers);
}

