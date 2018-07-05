package com.example.biletix.Controller;


import com.example.biletix.Model.Kategori;
import com.example.biletix.Service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping(value = "/api/kategori")
@RestController
public class KategoriController {

    @Autowired
    KategoriService kategoriService;


    @RequestMapping(path = "/kategoriGetir",method = RequestMethod.GET)
    public @ResponseBody List<Kategori> kategoriGetir(){

       return kategoriService.kategoriGetir();
    }
    @RequestMapping(path = "/kategoriGetirId/{kategoriId}",method = RequestMethod.GET)
    public @ResponseBody Kategori kategoriGetirId(@PathVariable Long kategoriId)
    {
        return kategoriService.kategoriGetirId(kategoriId);
    }

    @RequestMapping(path = "/kategoriSilId/{kategoriId}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus kategoriSilId(@PathVariable Long kategoriId)
    {
        try {
            kategoriService.kategoriSilId(kategoriId);
        }catch (Exception e)
        {

        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/save", method = RequestMethod.POST,consumes = "application/json" )
    public @ResponseBody HttpStatus saveKategori(@RequestBody Kategori kategori)
    {
        try {
            kategoriService.saveKategori(kategori);

        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }

    @RequestMapping(path ="/update/{kategoriId}/{kategoriAd}" , method = RequestMethod.PUT )
    public @ResponseBody HttpStatus updateKategori(@PathVariable Long kategoriId, @PathVariable String kategoriAd)
    {
        try {
            kategoriService.updateKategori(kategoriId,kategoriAd);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }



}
