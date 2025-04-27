package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Skier;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ISkierServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skier")
public class SkierController {

    private ISkierServices skierService;

    @PostMapping("/add")
    public Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkier(@PathVariable Long id) {
        skierService.deleteSkier(id);
    }

    @GetMapping("/get/{id}")
    public Skier getSkier(@PathVariable Long id) {
        return skierService.getSkier(id);
    }

    @GetMapping("/all")
    public List<Skier> getAllSkiers() {
        return skierService.getAllSkiers();
    }

    @PutMapping("/assign/{numSkier}/piste/{numPiste}")
    public Skier assignSkierToPiste(@PathVariable Long numSkier, @PathVariable Long numPiste) {
        return skierService.assignSkierToPiste(numSkier, numPiste);
    }
} 