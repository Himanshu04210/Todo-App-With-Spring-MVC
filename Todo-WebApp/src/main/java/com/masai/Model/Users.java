package com.masai.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer userId;
	public String name;
	public String email;
	public String password;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<Todos> todos;
}
