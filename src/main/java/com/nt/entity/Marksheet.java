package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MARKSEET")
//@Data
@RequiredArgsConstructor
@Setter
@Getter
public class Marksheet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer rollno ;
	private Integer java ;
	private Integer python ;
	private Integer c_language ;
	private Integer os ;
	private Integer total_marks ;
	private Integer fullMark=400;
	
//	   @OneToOne(mappedBy = "marks")
//	   //@JoinColumn(name = "student_id", referencedColumnName = "studid")
//	
//	private Student student;
}
