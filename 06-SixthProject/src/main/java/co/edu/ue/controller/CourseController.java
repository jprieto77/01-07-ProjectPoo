package co.edu.ue.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Course;
import co.edu.ue.service.CourseService;

@RestController
@RequestMapping(value = "api")
public class CourseController {

    CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }


    /*public void setService(CourseService service) {
        this.service = service;
    }*/


    /*@Autowired
    CourseService service;

    @Autowired
    ICourseService service;*/

    @GetMapping(value = "courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getAllCourses() {
        return service.allCourseList();
    }

    @GetMapping(value = "courses19", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getAllCourses19() {
        return service.allCourseList19();
    }

    @GetMapping(value = "courses9", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getAllCourses9() {
        return service.allCourseList9();
    }

    @GetMapping(value = "courses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Course getCourseById(@PathVariable ("id") long id) {
        return service.courseId(id);
    }

    @PostMapping(value = "courses", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> postCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }



}
