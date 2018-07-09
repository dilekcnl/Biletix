package com.example.biletix.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "mekan")
public class Mekan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mekanId;
    private String mekanAd;

    @ManyToOne
    Sehir sehir;

    @JsonBackReference
    @ManyToMany(mappedBy = "mekanListesi")
    List<Etkinlik> etkinlikListesi;

}
