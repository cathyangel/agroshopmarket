package com.agrishop.agroshop.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;



@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String userName;
	private String password;
	private String email;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
		
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="person_id")
	private Person person;
	
	
	
	@OneToMany(mappedBy="users")
	private List<Command>commands;
	
	
	@ManyToMany
	@JoinTable(name="user_role",
	           joinColumns=@JoinColumn(name="user_id",referencedColumnName = "id"),
	           inverseJoinColumns=@JoinColumn(name="role_id",referencedColumnName = "id"))
	private List<Role> roles;
	
	//@ManyToMany
	//@JoinTable(name="user_order",
	     //      joinColumns=@JoinColumn(name="user_id"),
	   //        inverseJoinColumns=@JoinColumn(name="order_id"))
	//private Set<Command>command=new HashSet<>();
	
	
	//@ManyToOne
	//@JoinColumn(name="role_id", referencedColumnName = "id")
	//private Role role;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="farmer_id")
	private Farmer farmer;
	
	
	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		
		return this.id;
	}
	public void setId(long id2) {
		 this.id=id2;
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Command> getCommands() {
		return commands;
	}
	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}