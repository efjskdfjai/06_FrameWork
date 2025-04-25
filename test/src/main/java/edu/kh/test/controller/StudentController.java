package edu.kh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.test.dto.Student;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("student")
public class StudentController {

	@GetMapping("select")
	public String selectStudent(HttpServletRequest req, @ModelAttribute Student student) {
		req.setAttribute("stdName", student.getStdName());
		req.setAttribute("stdAge", student.getStdAge());
		req.setAttribute("stdAddress", student.getStdAddress());
		return "student/select";
	}
}