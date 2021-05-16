package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.JobPositionDao;
import entities.concretes.JobPosition;

public class InMemoryJobPositionDao implements JobPositionDao{

	private List<JobPosition> jobList = new ArrayList<JobPosition>();

	
	@Override
	public void add(JobPosition jobPosition) {
		jobList.add(jobPosition);
		
	}

	@Override
	public void delete(JobPosition jobPosition) {
		jobList.remove(jobPosition);
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		System.out.println(jobPosition.getName() + " güncellendi!");
		
	}

	@Override
	public List<JobPosition> getAll() {
		return jobList;
	}
	

}
