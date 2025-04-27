package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();
    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
} 