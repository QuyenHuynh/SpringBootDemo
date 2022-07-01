package com.genspark.SpringBootDemo1.Service;

import com.genspark.SpringBootDemo1.Entity.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getAllCourses();
    Course getCourseById(int course_id);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourseById(int course_d);

}
