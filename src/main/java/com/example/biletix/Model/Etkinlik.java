package com.example.biletix.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "etkinlik")
public class Etkinlik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long etkinlikId;
    private String etkinlikAd;
    private Date etkinlikTrh;
    private Time etkinlikSaat;


    @JsonBackReference
    @ManyToMany
    List<Mekan> mekanListesi;


//    @OneToMany(mappedBy = "etkinlik")
//    List<Bilet> biletListesi;

   /* @ManyToOne
    @JoinColumn(name = "kategori")
    Kategori kategori;

    @OneToMany(mappedBy = "etkinlik")
    List<Bilet> biletListesi;

    @ManyToMany(mappedBy = "etkinlikListesi")
    List<Mekan> mekanListesi; */
}
