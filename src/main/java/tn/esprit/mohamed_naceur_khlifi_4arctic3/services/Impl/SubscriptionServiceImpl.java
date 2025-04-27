package tn.esprit.mohamed_naceur_khlifi_4arctic3.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.Subscription;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.repository.SubscriptionRepository;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.services.ISubscriptionService;

import java.util.List;

@Service
@AllArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionService {

    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Override
    public Subscription getSubscription(Long id) {
        return subscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }
} 