package dataAccess.abstracts;

import java.util.List;

import entities.concretes.JobPosition;

public interface JobPositionDao {
	void add(JobPosition jobPosition);
	void delete(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	List<JobPosition> getAll();

}
