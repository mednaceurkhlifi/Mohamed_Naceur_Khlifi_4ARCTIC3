package tn.esprit.mohamed_naceur_khlifi_4arctic3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.enums.TypeSubscription;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
}
