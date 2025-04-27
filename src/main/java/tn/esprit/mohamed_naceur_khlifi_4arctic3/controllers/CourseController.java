package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Course;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ICourseService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/course")
public class CourseController {

    private ICourseService courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/get/{id}")
    public Course getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
} 