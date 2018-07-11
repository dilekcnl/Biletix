package com.example.biletix.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "sehir")
public class Sehir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sehirId;
    private String sehirAd;


   /* @ManyToMany
    List<Kategori> kategoriListesi;*/

    @JsonBackReference
    @OneToMany(mappedBy = "sehir")
    List<Mekan> mekanlistesi;

    /*@OneToMany(mappedBy = "sehir")
    List<Mekan> mekanlistesi;

   // @JoinTable(name = "kategori",joinColumns = {@JoinColumn(name = "MEKAN_ID",referencedColumnName = "mekanId")},
            inverseJoinColumns = {@JoinColumn(name = "ETKINLIK_ID",referencedColumnName = "etkinlikId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Kategori> kategoriListesi;*/
}
