package com.javeed.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter 
	private Long id;
	
	@Getter
	@Setter 
	private String name;
	
	@Getter
	@Setter 
	@Column(name = "course_id")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> course;
	
}
