package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
    Course getCourse(Long id);
    List<Course> getAllCourses();
} 