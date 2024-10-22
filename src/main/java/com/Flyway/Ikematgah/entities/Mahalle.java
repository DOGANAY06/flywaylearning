package com.Flyway.Ikematgah.entities;


import jakarta.persistence.*;

import java.util.List;


@Entity
public class Mahalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isim;

    @ManyToOne
    @JoinColumn(name = "ilce_id")
    private Ilce ilce;

    @OneToMany(mappedBy = "mahalle", cascade = CascadeType.ALL)
    private List<Cadde> caddeler;  // Mahalle-Cadde ilişkisi
}
