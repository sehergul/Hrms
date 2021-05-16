package business.concretes;

import java.util.List;

import business.abstracts.JobPositionService;
import dataAccess.abstracts.JobPositionDao;
import entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void add(JobPosition jobPosition) {
		jobPositionDao.add(jobPosition);
		
	}

	@Override
	public void delete(JobPosition jobPosition) {
		jobPositionDao.delete(jobPosition);
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		jobPositionDao.update(jobPosition);
		
	}

	@Override
	public void getAll() {
		for(JobPosition jobPosition : jobPositionDao.getAll())
			System.out.println(jobPosition.getName());
	}
	

}
