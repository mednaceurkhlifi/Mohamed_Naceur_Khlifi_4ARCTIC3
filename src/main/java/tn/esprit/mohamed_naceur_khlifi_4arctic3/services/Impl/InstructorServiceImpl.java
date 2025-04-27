package tn.esprit.mohamed_naceur_khlifi_4arctic3.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Instructor;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.InstructorRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.IInstructorService;

import java.util.List;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorService {

    private InstructorRepository instructorRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public Instructor getInstructor(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
} 