package com.masai.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.masai.Model.Enums.TodoStatus;

@Entity
public class Todos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer todoId;
	public String todoName;
	
	@Enumerated(EnumType.STRING)
	public TodoStatus todoStatus;
	public LocalDate startDate;
	public LocalDate endDate;
	
	public String description;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	public Users user;
	
}
