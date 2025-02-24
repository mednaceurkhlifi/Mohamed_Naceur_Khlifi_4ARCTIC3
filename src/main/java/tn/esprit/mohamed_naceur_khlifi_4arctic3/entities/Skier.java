package tn.esprit.mohamed_naceur_khlifi_4arctic3.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
    @ManyToMany
    private Set<Piste> pistes;
    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
    private Subscription subscription;
    @OneToMany(mappedBy = "skier")
    private Set<Registration> registrations;
}
