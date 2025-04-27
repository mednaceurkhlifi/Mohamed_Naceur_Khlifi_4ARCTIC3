package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Registration;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.IRegistrationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/registration")
public class RegistrationController {

    private IRegistrationService registrationService;

    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationService.updateRegistration(registration);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
    }

    @GetMapping("/get/{id}")
    public Registration getRegistration(@PathVariable Long id) {
        return registrationService.getRegistration(id);
    }

    @GetMapping("/all")
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @PostMapping("/add/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration, @PathVariable Long numSkier) {
        return registrationService.addRegistrationAndAssignToSkier(registration, numSkier);
    }

    @PutMapping("/assign/{numRegistration}/course/{numCourse}")
    public Registration assignRegistrationToCourse(@PathVariable Long numRegistration, @PathVariable Long numCourse) {
        return registrationService.assignRegistrationToCourse(numRegistration, numCourse);
    }
} 