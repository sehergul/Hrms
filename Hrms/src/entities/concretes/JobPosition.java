package entities.concretes;

import entities.abstracts.Entity;

public class JobPosition implements Entity{
	
	
	private String name;

	public JobPosition() {}
	
	public JobPosition(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
