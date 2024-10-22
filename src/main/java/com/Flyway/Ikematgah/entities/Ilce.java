package com.Flyway.Ikematgah.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ilce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isim;

    @ManyToOne
    @JoinColumn(name = "il_id")
    private Il il;

    @OneToMany(mappedBy = "ilce", cascade = CascadeType.ALL)
    private List<Ikametgah> ikametgahlar;

    @OneToMany(mappedBy = "ilce", cascade = CascadeType.ALL)
    private List<Mahalle> mahalleler;
}
