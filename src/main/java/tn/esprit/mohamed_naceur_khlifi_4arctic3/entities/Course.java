package tn.esprit.mohamed_naceur_khlifi_4arctic3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
