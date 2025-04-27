package tn.esprit.mohamed_naceur_khlifi_4arctic3.services;

import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    void deleteSubscription(Long id);
    Subscription getSubscription(Long id);
    List<Subscription> getAllSubscriptions();
} 