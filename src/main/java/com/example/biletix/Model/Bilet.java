package com.example.biletix.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "bilet")
public class Bilet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long biletId;
    Long biletFiyati;

    @ManyToOne
    @JoinColumn(name = "etkinlik")
    Etkinlik etkinlik;

}
