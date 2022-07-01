package com.genspark.SpringBootDemo1.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;
    private String title;
    private String instructor;

    public Course(){}

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseid() {
        return course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
