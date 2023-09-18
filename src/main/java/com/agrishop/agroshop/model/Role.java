package com.agrishop.agroshop.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
    private String nameRole;
	
	
	@ManyToMany(mappedBy="roles")
	List<User> users;
	
	//@OneToMany(mappedBy="role")
	//private List<User>users;


	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
