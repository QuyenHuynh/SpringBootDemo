package com.genspark.SpringBootDemo1.Controller;

import com.genspark.SpringBootDemo1.Entity.Course;
import com.genspark.SpringBootDemo1.Service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private ICourseService CourseService;

    //http://localhost:8080/
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "msg", defaultValue = "Good morning!") String msg) {
        return "Hello " + name + "! " + msg;
    }

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.CourseService.getAllCourses();
    }

    @GetMapping("/courses/{course_id}")
    public Course getCourseById(@PathVariable String course_id) {
        return this.CourseService.getCourseById(Integer.parseInt(course_id));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.CourseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.CourseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{course_id}")
    public String deleteCourse(@PathVariable String course_id) {
        return this.CourseService.deleteCourseById(Integer.parseInt(course_id));
    }


}
