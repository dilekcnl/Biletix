package com.example.biletix.Service;

import com.example.biletix.Model.Bilet;
import com.example.biletix.Repository.BiletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BiletService {

    @Autowired
    BiletRepository biletRepository;

    public List<Bilet> biletGetir(){

        return biletRepository.findAll();

    }
    public Bilet biletGetirId(Long biletId)
    {
        return biletRepository.findBiletByBiletId(biletId);
    }

    public void saveBilet(Bilet bilet)
    {
        biletRepository.save(bilet);
    }

   /* public String updateBilet(Long biletId,String biletAd)
        {
            Bilet bilet=biletRepository.findOne(biletId);
            if (bilet !=null)
            {
                bilet.setBiletAd(biletAd);
                biletRepository.save(bilet);
                return "Guncellendi";
            }
            else
            {
                return "bu ıd mevcut degil";
            }

    }*/

    public void biletSilId(Long biletId)
    {
        biletRepository.delete(biletId);
    }

}

