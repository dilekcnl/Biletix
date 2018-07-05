package com.example.biletix.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "mekan")
public class Mekan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long mekanId;
    String mekanAd;

    @ManyToOne
    @JoinColumn(name = "sehir")
    Sehir sehir;


    @ManyToMany(mappedBy = "mekanListesi")
    List<Etkinlik> etkinlikListesi;

    /*@JoinTable(name = "etkinlikMekani",joinColumns = {@JoinColumn(name = "MEKAN_ID",referencedColumnName = "mekanId")},
            inverseJoinColumns = {@JoinColumn(name = "ETKINLIK_ID",referencedColumnName = "etkinlikId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Etkinlik> etkinlikListesi;*/
}
