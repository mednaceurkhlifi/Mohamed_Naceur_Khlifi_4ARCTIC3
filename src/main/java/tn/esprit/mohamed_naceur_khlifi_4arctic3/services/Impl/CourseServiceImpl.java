package tn.esprit.mohamed_naceur_khlifi_4arctic3.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Course;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.CourseRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ICourseService;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course getCourse(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
} 