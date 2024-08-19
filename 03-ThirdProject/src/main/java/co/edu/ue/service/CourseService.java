package co.edu.ue.service;

import java.util.List;
import java.util.stream.Collectors;

import co.edu.ue.model.Course;
import co.edu.ue.repositories.CourseData;

public class CourseService implements ICourseServiceConst, ICourseService {

    CourseData courseData = new CourseData();

    @Override
    public List<Course> allCourseList() {
        return courseData.getDataList();
    }

    @Override
    public List<Course> allCourseList19() {
        return courseData.getDataList().stream().map(
                c -> {
                    double priceNew = (c.getPrice() + c.getPrice() * IVA_19);
                    Course course = new Course(c.getId(),c.getName(),c.getDescription(),(long)priceNew);
                    return course;
                }).collect(Collectors.toList());
    }

    @Override
    public List<Course> allCourseList9() {
        return courseData.getDataList().stream().map(
                c -> {
                    double priceNew = (c.getPrice() + c.getPrice() * IVA_9);
                    c.setPrice((long) priceNew);
                    return c;
                }).collect(Collectors.toList());
    }

    @Override
    public Course courseName(String name) {
        return courseData.getCourseName(name);
    }

    @Override
    public Course courseId(long id) {
        return courseData.getCourseId(id);
    }

    @Override
    public List<Course> addCourse(Course course) {
        return courseData.postCourse(course);
    }

    @Override
    public List<Course> removeCourse(long id) {
        return courseData.deleteCourse(id);
    }

}
