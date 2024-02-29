package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	// /courses [url=" http://localhost:8080/courses " ]
		// Course: id, name, author
		
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
			new Course(1, "Learn AWS", "in28minutes"),
			new Course(2, "Learn DevOps", "in28minutes"),
			new Course(3, "Learn Asur", "in28minutes"),
			new Course(4, "Learn cloud", "in28minutes")
			);
		
		
	}
	
		
	

}

//in chrome we will receive JSON response
