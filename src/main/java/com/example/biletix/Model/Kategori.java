package com.example.biletix.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "kategori")
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kategoriId;

    String kategoriAd;


    @ManyToMany(mappedBy = "kategoriListesi")
    List<Sehir> sehirListesi;


    /*@OneToMany(mappedBy = "kategori")
    List<Etkinlik> etkinlikListesi;

    @ManyToMany(mappedBy ="kategoriListesi")
    List<Sehir> sehirListesi;*/

}
