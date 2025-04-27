package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void deletePiste(Long id);
    Piste getPiste(Long id);
    List<Piste> getAllPistes();
} 