package com.Flyway.Ikematgah.entities;

import jakarta.persistence.*;


@Entity
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;

    @OneToOne(mappedBy = "kisi", cascade = CascadeType.ALL)
    private Ikametgah ikametgah;
}
