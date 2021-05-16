package business.abstracts;

import java.util.List;

import entities.concretes.JobPosition;

public interface JobPositionService {
	void add(JobPosition jobPosition);
	void delete(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	void getAll();

}
