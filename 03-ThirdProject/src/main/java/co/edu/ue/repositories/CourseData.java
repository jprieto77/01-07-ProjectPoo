package co.edu.ue.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.edu.ue.model.Course;

public class CourseData {
    List<Course> dataCourses;

    public CourseData() {
        this.dataCourses = new ArrayList<>(Arrays.asList(
                new Course(1, "Java", "Java Inicio", 50),
                new Course(2, "PHP", "PHP Inicio", 40),
                new Course(3, "Ruby", "Ruby", 80),
                new Course(4, "Java2", "Java intermedio", 60)

        ));
    }

    public List<Course> getDataList() {
        return this.dataCourses;
    }

    public Course getCourseName(String name) {
        for (Course c : this.dataCourses) {
            if (c.getName().contains(name)) {
                return c;
            }
        }

        return null;
    }

    public Course getCourseId(long id) {
       return this.dataCourses.stream().filter(e->e.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Course> postCourse(Course course){
        this.dataCourses.add(course);
        return this.dataCourses;
    }

    public List<Course> deleteCourse(long id) {
        this.dataCourses.removeIf(c-> c.getId().equals(id));
        return this.dataCourses;
    }
}
