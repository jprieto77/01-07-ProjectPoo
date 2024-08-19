package co.edu.ue.repositories;

import java.util.List;

import co.edu.ue.model.Course;

public interface ICourseData {
    List<Course> getDataList();
    Course getCourseName(String name);
    Course getCourseId(long id);
    List<Course> postCourse(Course course);
    List<Course> deleteCourse(long id);
}
