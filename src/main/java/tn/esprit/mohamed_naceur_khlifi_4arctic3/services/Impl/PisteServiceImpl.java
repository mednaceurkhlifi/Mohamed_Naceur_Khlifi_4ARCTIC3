package tn.esprit.mohamed_naceur_khlifi_4arctic3.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Piste;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.PisteRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.IPisteService;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService {

    private PisteRepository pisteRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepository.deleteById(id);
    }

    @Override
    public Piste getPiste(Long id) {
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }
} 