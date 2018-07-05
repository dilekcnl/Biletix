package com.example.biletix.Service;

import com.example.biletix.Model.Sehir;
import com.example.biletix.Repository.SehirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SehirService {

    @Autowired
    SehirRepository sehirRepository;

    public List<Sehir> sehirGetir(){
        Sehir sehir = new Sehir();
        sehir.setSehirAd("deneme");
        return sehirRepository.findAll();

    }
    public Sehir sehirGetirId(Long sehirId)
    {
        return sehirRepository.findSehirBySehirId(sehirId);
    }

    public void saveSehir(Sehir sehir)
    {
        sehirRepository.save(sehir);
    }

    public String updateSehir(Long sehirId,String sehirAd)
    {
        Sehir sehir=sehirRepository.findOne(sehirId);
        if (sehir !=null)
        {
            sehir.setSehirAd(sehirAd);
            sehirRepository.save(sehir);
            return "Guncellendi";
        }
        else
        {
            return "bu id mevcut degil";
        }


    }

    public void sehirSilId(Long sehirId)
    {
        sehirRepository.delete(sehirId);
    }


}

