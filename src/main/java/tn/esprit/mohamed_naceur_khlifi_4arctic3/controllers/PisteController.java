package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Piste;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteController {

    private IPisteService pisteService;

    @PostMapping("/add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePiste(@PathVariable Long id) {
        pisteService.deletePiste(id);
    }

    @GetMapping("/get/{id}")
    public Piste getPiste(@PathVariable Long id) {
        return pisteService.getPiste(id);
    }

    @GetMapping("/all")
    public List<Piste> getAllPistes() {
        return pisteService.getAllPistes();
    }
} 