package com.masai.entity;

import com.masai.entity.Enums.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Todos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer todoId;
	
	
	private String title;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private Users user;
	
	
}
