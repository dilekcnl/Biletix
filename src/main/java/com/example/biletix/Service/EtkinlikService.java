package com.example.biletix.Service;

import com.example.biletix.Model.Etkinlik;
import com.example.biletix.Repository.EtkinlikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EtkinlikService {

    @Autowired
    EtkinlikRepository etkinlikRepository;

    public List<Etkinlik> etkinlikGetir(){
       // Etkinlik etkinlik = new Etkinlik();
        //etkinlik.setEtkinlikAd("deneme");
        return etkinlikRepository.findAll();

    }
    public Etkinlik etkinlikGetirId(Long etkinlikId)
    {
        return etkinlikRepository.findEtkinlikByEtkinlikId(etkinlikId);
    }

    public void saveEtkinlik(Etkinlik etkinlik)
    {
        etkinlikRepository.save(etkinlik);
    }

    public String updateEtkinlik(Long etkinlikId,String etkinlikAd)
    {
        Etkinlik etkinlik=etkinlikRepository.findOne(etkinlikId);
        if (etkinlik !=null)
        {
            etkinlik.setEtkinlikAd(etkinlikAd);
            etkinlikRepository.save(etkinlik);
            return "Guncellendi";
        }
        else
        {
            return "bu id mevcut degil";
        }


    }

    public void etkinlikSilId(Long etkinlikId)
    {
        etkinlikRepository.delete(etkinlikId);
    }


}

