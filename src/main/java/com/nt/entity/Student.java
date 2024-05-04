package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "STUDENT")
//@Data
@RequiredArgsConstructor
@Setter
@Getter
public class Student implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 1000, allocationSize = 1, sequenceName = "STUDNO_SEQ")
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer studid;

	@Column(length = 20)
	private String sname;

	@Column(length = 20)
	private String fname;

	@Column(length = 20)
	private String course = "MCA";

	@Column(length = 40)
	private String deptname;

	private Long phoneno;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "marks_id", referencedColumnName = "rollno")
	private Marksheet marks;

}
