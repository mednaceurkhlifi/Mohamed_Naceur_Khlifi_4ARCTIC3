package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistration(Long id);
    List<Registration> getAllRegistrations();
    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier);
    Registration assignRegistrationToCourse(Long numRegistration, Long numCourse);
} 