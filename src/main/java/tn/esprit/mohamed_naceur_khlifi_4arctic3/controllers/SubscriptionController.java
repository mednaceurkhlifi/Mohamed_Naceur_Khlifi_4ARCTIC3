package tn.esprit.mohamed_naceur_khlifi_4arctic3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Subscription;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ISubscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/subscription")
public class SubscriptionController {

    private ISubscriptionService subscriptionService;

    @PostMapping("/add")
    public Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.updateSubscription(subscription);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }

    @GetMapping("/get/{id}")
    public Subscription getSubscription(@PathVariable Long id) {
        return subscriptionService.getSubscription(id);
    }

    @GetMapping("/all")
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }
} 