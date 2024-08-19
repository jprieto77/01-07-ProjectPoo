package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Course;

public interface ICourseService {


    List<Course> allCourseList();
    List<Course> allCourseList19();
    List<Course> allCourseList9();
    Course courseName(String name);
    Course courseId(long id);
    List<Course> addCourse(Course course);
    List<Course> removeCourse(long id);


}
