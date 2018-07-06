package com.example.biletix.Controller;


import com.example.biletix.Model.Bilet;
import com.example.biletix.Service.BiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping(value = "/api/bilet")
@RestController
public class BiletController {

    @Autowired
    BiletService biletService;


    @RequestMapping(path = "/biletGetir",method = RequestMethod.GET)
    public @ResponseBody List<Bilet> biletGetir(){

        return biletService.biletGetir();
    }
    @RequestMapping(path = "/biletGetirId/{biletId}",method = RequestMethod.GET)
    public @ResponseBody Bilet biletGetirId(@PathVariable Long biletId)
    {
        return biletService.biletGetirId(biletId);
    }

    @RequestMapping(path = "/biletSilId/{biletId}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus biletSilId(@PathVariable Long biletId)
    {
        try {
            biletService.biletSilId(biletId);
        }catch (Exception e)
        {

        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/saveBilet", method = RequestMethod.POST,consumes = "application/json" )
    public @ResponseBody HttpStatus saveBilet(@RequestBody Bilet bilet)
    {
        try {
            biletService.saveBilet(bilet);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }

    @RequestMapping(path ="/updateBilet/{biletId}" , method = RequestMethod.PUT )
    public @ResponseBody HttpStatus updateBilet(@PathVariable Long biletId)
    {
        try {
            biletService.updateBilet(biletId);
        }catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }



}
