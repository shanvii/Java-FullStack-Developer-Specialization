package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Student;

@RestController
public class StudentController {
	public static List<Student> students = new ArrayList<Student>();
	
	//constructor of the class
	public StudentController() {
		//adding to list students
		//Student object parameterized constructor call
		students.add(new Student("Satakshi", "Shanvi"));
		students.add(new Student("Shrey", "Dikshant"));
		students.add(new Student("Vanshika", "Verma"));
		students.add(new Student("Shreya", "Verma"));
	}
	
	// displays the complete list
	// http://localhost:8089/students
	// returns all the students list data
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	// displays the first and last name entered in URL but does not gets added in the students list
	// http://localhost:8089/student/Harshita/Sinha
	@GetMapping("/student/{firstName}/{lastName}")
	// The @PathVariable annotation is used to extract the value from the URI
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// displayed the first and last name that was entered
	// http://localhost:8089/student/query?firstName=John&lastName=Smith
	@GetMapping("student/query")
	public Student studentQueryParam(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// adds student information entered by the user to the students list
	// http://localhost:8089/student 
	// creates user resource - the firstName & lastName in JSON is added to students list
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	// http://localhost:8089/student/Vanshika
	// updates all the enteries having the firstName passed in URL with the JSON entry firstName & lastName
	@PutMapping("/student/{firstName}")
	public void updateStudent(@PathVariable("firstName") String firstName, @RequestBody Student student) {
		//for each loop Student stud from students list
		for(Student stud: students) {
			if(stud.getFirstName().equals(firstName)) {
				stud.setFirstName(student.getFirstName());
				stud.setLastName(student.getLastName());
			}
		}
	}
	
	// http://localhost:8089/student/Himanshu
	// http://localhost:8089/student/Vanshika
	// deletes the entry
	@DeleteMapping("/student/{firstName}")
	public void deleteStudent(@PathVariable("firstName") String firstName) {
		for(Student stud: students) {
			if(stud.getFirstName().equals(firstName)) {
				students.remove(stud);
			}
		}
	}
}
