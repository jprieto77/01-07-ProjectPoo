package co.edu.ue.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Course;
import jakarta.annotation.PostConstruct;

@RestController
public class CourseController {
	
	Course course;
	
	@PostConstruct
	public void init() {
		course = new Course();	
	}
	
	@GetMapping(value="courses", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Course> getCourses(){
		return course.myListCourses();
	}
	@GetMapping(value="course", produces = MediaType.APPLICATION_XML_VALUE)
	public Course getCourse() {
		return new Course ("JavaScript",20,10,24);
	}
	@GetMapping(value="courses/{name}", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Course> searchCourse (@PathVariable("name") String nam){
		return course.searchCourses(nam);
	}
	
	@DeleteMapping(value= "course/{name}")
	public List<Course> deleteCourse(@PathVariable("name") String name){
		return course.deleteCourse(name);
	}
	
	@PostMapping(value= "course", consumes=MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_XML_VALUE)
	public List<Course> postCourse(@RequestBody Course c){
		return course.postCourse(c);
	}

}

