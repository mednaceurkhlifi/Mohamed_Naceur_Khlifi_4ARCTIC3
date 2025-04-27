package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Course;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Registration;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.CourseRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.RegistrationRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.SkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationService {

    private RegistrationRepository registrationRepository;
    private SkierRepository skierRepository;
    private CourseRepository courseRepository;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    @Override
    public Registration getRegistration(Long id) {
        return registrationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        if (skier != null) {
            registration.setSkier(skier);
            return registrationRepository.save(registration);
        }
        return null;
    }

    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Registration registration = registrationRepository.findById(numRegistration).orElse(null);
        Course course = courseRepository.findById(numCourse).orElse(null);
        
        if (registration != null && course != null) {
            registration.setCourse(course);
            return registrationRepository.save(registration);
        }
        return null;
    }
} 