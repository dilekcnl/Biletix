package com.example.biletix.Service;

import com.example.biletix.Model.Mekan;
import com.example.biletix.Repository.MekanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MekanService {

    @Autowired
    MekanRepository mekanRepository;

    public List<Mekan> mekanGetir(){
        Mekan mekan = new Mekan();
        mekan.setMekanAd("deneme");
        return mekanRepository.findAll();

    }
    public Mekan mekanGetirId(Long mekanId)
    {
        return mekanRepository.findMekanByMekanId(mekanId);
    }

    public void saveMekan(Mekan mekan)
    {
        mekanRepository.save(mekan);
    }

    public String updateMekan(Long mekanId,String mekanAd)
    {
        Mekan mekan=mekanRepository.findOne(mekanId);
        if (mekan !=null)
        {
            mekan.setMekanAd(mekanAd);
            mekanRepository.save(mekan);
            return "Guncellendi";
        }
        else
        {
            return "bu ıd mevcut degil";
        }


    }

    public void mekanSilId(Long mekanId)
    {
        mekanRepository.delete(mekanId);
    }


}

