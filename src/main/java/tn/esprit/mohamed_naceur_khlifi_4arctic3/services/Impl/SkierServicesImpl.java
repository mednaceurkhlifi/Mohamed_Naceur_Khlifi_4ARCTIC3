package tn.esprit.mohamed_naceur_khlifi_4arctic3.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.SkierRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ISkierServices;

import java.util.List;

@Service
@AllArgsConstructor
public class SkierServicesImpl implements ISkierServices {

    private SkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void deleteSkier(Long id) {
        skierRepository.deleteById(id);
    }

    @Override
    public Skier getSkier(Long id) {
        return skierRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
}
