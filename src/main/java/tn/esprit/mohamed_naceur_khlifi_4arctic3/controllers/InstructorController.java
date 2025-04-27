package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Instructor;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.IInstructorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/instructor")
public class InstructorController {

    private IInstructorService instructorService;

    @PostMapping("/add")
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }

    @GetMapping("/get/{id}")
    public Instructor getInstructor(@PathVariable Long id) {
        return instructorService.getInstructor(id);
    }

    @GetMapping("/all")
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @PostMapping("/add/course/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(@RequestBody Instructor instructor, @PathVariable Long numCourse) {
        return instructorService.addInstructorAndAssignToCourse(instructor, numCourse);
    }
} 