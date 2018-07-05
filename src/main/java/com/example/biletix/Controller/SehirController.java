package com.example.biletix.Controller;


import com.example.biletix.Model.Sehir;
import com.example.biletix.Service.SehirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping(value = "/api/sehir")
@RestController
public class SehirController {

    @Autowired
    SehirService sehirService;


    @RequestMapping(path = "/sehirGetir",method = RequestMethod.GET)
    public @ResponseBody List<Sehir> sehirGetir(){

        return sehirService.sehirGetir();
    }
    @RequestMapping(path = "/sehirGetirId/{sehirId}",method = RequestMethod.GET)
    public @ResponseBody Sehir sehirGetirId(@PathVariable Long sehirId)
    {
        return sehirService.sehirGetirId(sehirId);
    }

    @RequestMapping(path = "/sehirSilId/{sehirId}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus sehirSilId(@PathVariable Long sehirId)
    {
        try {
            sehirService.sehirSilId(sehirId);
        }catch (Exception e)
        {

        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/save", method = RequestMethod.POST,consumes = "application/json" )
    public @ResponseBody HttpStatus saveSehir(@RequestBody Sehir sehir)
    {
        try {
            sehirService.saveSehir(sehir);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }

    @RequestMapping(path ="/update/{sehirId}/{sehirAd}" , method = RequestMethod.PUT )
    public @ResponseBody HttpStatus updateSehir(@PathVariable Long sehirId, @PathVariable String sehirAd)
    {
        try {
            sehirService.updateSehir(sehirId,sehirAd);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }



}
