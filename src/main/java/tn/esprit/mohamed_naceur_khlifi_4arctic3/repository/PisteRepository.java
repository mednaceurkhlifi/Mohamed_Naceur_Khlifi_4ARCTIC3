package tn.esprit.mohamed_naceur_khlifi_4arctic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Piste;

@Repository
public interface PisteRepository  extends JpaRepository<Piste, Long> {
}
