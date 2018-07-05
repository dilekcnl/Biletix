package com.example.biletix.Model;

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
    Long sehirId;
    String sehirAd;

    @JoinTable(name = "kategoriSehri",joinColumns = {@JoinColumn(name = "SEHIR_ID ",referencedColumnName = "sehirId")},
            inverseJoinColumns = {@JoinColumn(name = "KATEGORI_ID",referencedColumnName = "kategoriId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Kategori> kategoriListesi;

    @OneToMany(mappedBy = "sehir")
    List<Mekan> mekanlistesi;

    /*@OneToMany(mappedBy = "sehir")
    List<Mekan> mekanlistesi;

   // @JoinTable(name = "kategori",joinColumns = {@JoinColumn(name = "MEKAN_ID",referencedColumnName = "mekanId")},
            inverseJoinColumns = {@JoinColumn(name = "ETKINLIK_ID",referencedColumnName = "etkinlikId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Kategori> kategoriListesi;*/
}
