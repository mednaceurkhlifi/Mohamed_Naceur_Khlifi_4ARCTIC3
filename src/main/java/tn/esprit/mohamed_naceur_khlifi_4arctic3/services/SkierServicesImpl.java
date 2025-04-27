package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.SkierRepository;

import java.util.List;

@Service
public class SkierServicesImpl implements ISkierServices {

    @Autowired
    private SkierRepository skierRepository;

    @Override
    public void addSkier(Skier skier) {
        skierRepository.save(skier);
    }

    @Override
    public List<Skier> getSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public void updateSkier(long numSkier, Skier skier) {

    }

    @Override
    public void deleteSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public Skier getSkier(long id) {
        return skierRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Skier n°"+ id + ": not found"));
    }
}
