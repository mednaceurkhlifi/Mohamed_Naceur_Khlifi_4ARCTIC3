package tn.esprit.mohamed_naceur_khlifi_4arctic3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.enums.Support;
import tn.esprit.mohamed_naceur_khlifi_4arctic3.entities.enums.TypeCourse;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float price;
    private int timeSlot;
    @OneToMany(mappedBy = "course")
    private Set<Registration> registrations;

}
