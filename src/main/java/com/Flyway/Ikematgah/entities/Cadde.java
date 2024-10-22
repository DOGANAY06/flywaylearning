package com.Flyway.Ikematgah.entities;
import jakarta.persistence.*;

@Entity
public class Cadde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cadde_adi") // Kolon adını burada belirtiyoruz
    private String isim;

    @ManyToOne
    @JoinColumn(name = "mahalle_id")
    private Mahalle mahalle;

    // Getters and setters
}
