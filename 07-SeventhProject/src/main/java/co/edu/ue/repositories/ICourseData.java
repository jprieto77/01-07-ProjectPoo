package co.edu.ue.repositories;

import java.util.List;

import co.edu.ue.model.Course;

public interface ICourseData {
    List<Course> getDataList();
    Course getCourseName(String name);
    Course getCourseId(long id);
    List<Course> postCourse(Course course);
    List<Course> deleteCourse(long id);


    public class CourseJson implements ICourseData {
        @Override
        public List<Course> getDataList() {
            return null;
        }

        @Override
        public Course getCourseName(String name) {
            return null;
        }

        @Override
        public Course getCourseId(long id) {
            return null;
        }

        @Override
        public List<Course> postCourse(Course course) {
            return null;
        }

        @Override
        public List<Course> deleteCourse(long id) {
            return null;
        }
    }
}
