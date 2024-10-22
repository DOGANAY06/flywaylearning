package com.Flyway.Ikematgah.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Il {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isim;

    @OneToMany(mappedBy = "il", cascade = CascadeType.ALL)
    private List<Ilce> ilceler;
}
