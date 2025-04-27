package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Piste;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.PisteRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.SkierRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SkierServicesImpl implements ISkierServices {

    private final SkierRepository skierRepository;
    private final PisteRepository pisteRepository;

    // Constructor-based dependency injection
    public SkierServicesImpl(SkierRepository skierRepository, PisteRepository pisteRepository) {
        this.skierRepository = skierRepository;
        this.pisteRepository = pisteRepository;
    }

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier); // Save the skier to the database
    }

    @Override
    public Skier updateSkier(Skier skier) {
        if (!skierRepository.existsById(skier.getNumSkier())) {
            throw new EntityNotFoundException("Skier not found");
        }
        return skierRepository.save(skier); // Update the skier details
    }

    @Override
    public void deleteSkier(Long id) {
        if (!skierRepository.existsById(id)) {
            throw new EntityNotFoundException("Skier not found");
        }
        skierRepository.deleteById(id); // Delete the skier by ID
    }

    @Override
    public Skier getSkier(Long id) {
        return skierRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Skier not found")); // Retrieve the skier by ID
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll(); // Get all skiers from the database
    }

    @Override
    public Skier assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier)
                .orElseThrow(() -> new EntityNotFoundException("Skier not found"));

        Piste piste = pisteRepository.findById(numPiste)
                .orElseThrow(() -> new EntityNotFoundException("Piste not found"));
        Set<Piste> setPiste = new HashSet<Piste>();
        setPiste.add(piste);

        skier.setPistes(setPiste);
        return skierRepository.save(skier);
    }
}

