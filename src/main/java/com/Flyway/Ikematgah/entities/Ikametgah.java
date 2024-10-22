package com.Flyway.Ikematgah.entities;

import jakarta.persistence.*;


@Entity
public class Ikametgah {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "kisi_id")
    private Kisi kisi;

    @ManyToOne
    @JoinColumn(name = "ilce_id")
    private Ilce ilce;
}
