package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Course {
    private String courseName;
    private int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}