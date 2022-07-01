package com.genspark.SpringBootDemo1.Service;

import com.genspark.SpringBootDemo1.Dao.CourseDao;
import com.genspark.SpringBootDemo1.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseDao courseDao;

    public CourseService() { }

    @Override
    public List<Course> getAllCourses() {
       return this.courseDao.findAll();
    }

    @Override
    public Course getCourseById(int course_id) {

        Optional <Course> c = this.courseDao.findById(course_id);
        Course course = null;

        if (c.isPresent()) {
            course = c.get();
        } else {
            throw new RuntimeException("Course not found for id :: " + course_id);
        }

        return course;
    }

    @Override
    public Course addCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public String deleteCourseById(int course_id) {
        this.courseDao.deleteById(course_id);
        return "Course " + course_id + " has been deleted";
    }
}
