package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier course);
    Skier updateSkier(Skier course);
    void deleteSkier(Long id);
    Skier getSkier(Long id);
    List<Skier> getAllSkiers();
}
