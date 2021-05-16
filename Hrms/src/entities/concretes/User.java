package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String email;
	private String password;
	
	
	public User() {
		super();
	}


	public User(String email, String password, int id) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
