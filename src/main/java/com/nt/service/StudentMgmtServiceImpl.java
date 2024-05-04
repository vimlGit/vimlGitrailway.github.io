//EmployeeMgmtServiceImpl.java
package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.IStudentRepository;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	@Autowired
	private   IStudentRepository  studRepo;

	@Override
	public List<Student> fetchAllStudent() {
		// TODO Auto-generated method stub
		List<Student> list=studRepo.findAll();
		list.sort((stud1,stud2)->stud1.getStudid()-stud2.getStudid());
		return list;
	}
	
	@Override
	public String registerStudent(Student emp) {
		   int idVal=studRepo.save(emp).getStudid();
		   return "Student is saved with id Value ::"+idVal;
	}
	
	@Override
	public Student searchStudentByNo(int no) {
		return  studRepo.findById(no).orElseThrow(()->new IllegalArgumentException("Student is not found"));
	}
	
	@Override
	public String modifyStudent(Student student) {
		Optional<Student> opt=studRepo.findById(student.getStudid());
		if(opt.isPresent()) {
			  //upddate the object
			studRepo.save(student);
			return student.getStudid() +" --> Student details are updated";
		}
		return student.getStudid() +" --> Student is not found";
	}
	
	@Override
	public String deleteStudent(int no) {
		Optional<Student> opt=studRepo.findById(no);
		if(opt.isPresent()) {
			studRepo.deleteById(no);
			return no+"  id Student is deleted";
		}
		else 
		  return no+"  id is not found for Deletion";   	
	}

}
