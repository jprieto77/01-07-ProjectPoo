package co.edu.ue.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Course;
import co.edu.ue.repositories.CourseData;

@Service

public class CourseService implements ICourseServiceConst, ICourseService {

    @Autowired //principio de hollywood clase 09 agosto
    CourseData courseData;

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
