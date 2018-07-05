package com.example.biletix.Service;

import com.example.biletix.Model.Kategori;
import com.example.biletix.Repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KategoriService {

    @Autowired
    KategoriRepository kategoriRepository;

    public List<Kategori> kategoriGetir(){
        //Kategori kategori = new Kategori();
        //kategori.setKategoriAd("deneme");
        return kategoriRepository.findAll();

    }
    public Kategori kategoriGetirId(Long kategoriId)
    {
        return kategoriRepository.findKategoriByKategoriId(kategoriId);
    }

    public void saveKategori(Kategori kategori)
    {
        kategoriRepository.save(kategori);
    }

    public String updateKategori(Long kategoriId,String kategoriAd)
    {
        Kategori kategori=kategoriRepository.findOne(kategoriId);
        if (kategori !=null)
        {
            kategori.setKategoriAd(kategoriAd);
            kategoriRepository.save(kategori);
            return "Guncellendi";
        }
        else
        {
            return "bu ıd mevcut degil";
        }


    }

    public void kategoriSilId(Long kategoriId)
    {
        kategoriRepository.delete(kategoriId);
    }


}

