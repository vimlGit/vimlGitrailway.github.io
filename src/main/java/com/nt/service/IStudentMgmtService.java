//IEmployeeMgmtService
package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface IStudentMgmtService {
    public  List<Student>  fetchAllStudent();
    public  String    registerStudent(Student stud);
    public  Student   searchStudentByNo(int no);
    public  String    modifyStudent(Student stud);
    public   String   deleteStudent(int no);
}
