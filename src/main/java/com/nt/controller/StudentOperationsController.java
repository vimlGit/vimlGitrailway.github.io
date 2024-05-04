//EmployeeOperations.java
package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Student;
import com.nt.service.IStudentMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentOperationsController {
	@Autowired
	private IStudentMgmtService studService;

	@GetMapping("/")
	public String showHomePage() {
		System.out.println("StudentOperationsController.showHomePage()");
		// return LVN
		return "welcome";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("StudentOperationsController.showReport()");

		// invoke the service class method
		List<Student> list = studService.fetchAllStudent();
		// keep the result in the Model attribute
		map.put("studList", list);
		// return LVN
		return "show_report";
	}
	
	//Show Result same as Show Report
	@GetMapping("/result")
	public String showResult(Map<String, Object> map) {
		System.out.println("StudentOperationsController.showReport()");

		// invoke the service class method
		List<Student> list = studService.fetchAllStudent();
		// keep the result in the Model attribute
		map.put("studList", list);
		// return LVN
		return "view_student_marks_form";
	}

	@GetMapping("/register")
	public String addEmployeeFormPage(@ModelAttribute("student") Student student) {
		System.out.println("EmployeeOperationsController.addEmployeeFormPage()");
		// return LVN
		return "student_register";

	}

	@PostMapping("/register")
	public String registerEmployee(HttpSession ses, @ModelAttribute("student") Student student) {
		System.out.println("StudentOperationsController.registerStudent()");
		// use the service
		String result = studService.registerStudent(student);
		// keep the result in RedirectAttributes Shared Memory as the FlashAttributes
		ses.setAttribute("resultMsg", result);

		// return LVN
		return "redirect:report";
	}

	@GetMapping("/edit") // for edit form launch
	public String showEditFormPage(@ModelAttribute("student") Student student, @RequestParam("no") int no) {
		// use the service
		Student stud1 = studService.searchStudentByNo(no);
		// copy recieved emp1 obj data to Model class object
		BeanUtils.copyProperties(stud1, student); // copies emp1 obj data emp obj
		// return LVN
		return "edit_student_form";
	}

	//LVN for result page
	/*
	 * @GetMapping("/result") // for edit form launch public String
	 * showResult(@ModelAttribute("student") Student student, @RequestParam("no")
	 * int no) { // use the service Student stud1 =
	 * studService.searchStudentByNo(no); // copy recieved emp1 obj data to Model
	 * class object BeanUtils.copyProperties(stud1, student); // copies emp1 obj
	 * data emp obj // return LVN return "view_student_marks_form"; }
	 */
	
	
	@PostMapping("/edit") // for edit form submission
	public String editStudent(RedirectAttributes attrs, @ModelAttribute("Student") Student student) {
		System.out.println("StudentOperationsController.registerStudent()");
		// use the service
		String result = studService.modifyStudent(student);
		// keep the result in RedirectAttributes Shared Memory as the FlashAttributes
		attrs.addFlashAttribute("resultMsg", result);

		// return LVN
		return "redirect:report";
	}

	@GetMapping("/delete")
	public String removeStudentById(@RequestParam("no") int no, RedirectAttributes attrs) {
		// use service
		String result = studService.deleteStudent(no);
		// keep the results RedirectAttrs shared Memory
		attrs.addFlashAttribute("resultMsg", result);
		// return LVN
		return "redirect:report";
	}

	
}
