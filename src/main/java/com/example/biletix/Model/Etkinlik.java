package com.example.biletix.Model;

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
    Long etkinlikId;
    String etkinlikAd;
    Date etkinlikTrh;
    Time etkinlikSaat;

    @JoinTable(name = "etkinlikMekani",joinColumns = {@JoinColumn(name = "ETKINLIK_ID",referencedColumnName = "etkinlikId")},
            inverseJoinColumns = {@JoinColumn(name = "MEKAN_ID ",referencedColumnName = "mekanId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Mekan> mekanListesi;

    @OneToMany(mappedBy = "etkinlik")
    List<Bilet> biletListesi;

   /* @ManyToOne
    @JoinColumn(name = "kategori")
    Kategori kategori;

    @OneToMany(mappedBy = "etkinlik")
    List<Bilet> biletListesi;

    @ManyToMany(mappedBy = "etkinlikListesi")
    List<Mekan> mekanListesi; */
}
