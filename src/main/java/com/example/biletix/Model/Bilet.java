package com.example.biletix.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "bilet")
public class Bilet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long biletId;
    private Long biletFiyati;

    @JsonBackReference
    @ManyToOne
    Etkinlik etkinlik;

}
