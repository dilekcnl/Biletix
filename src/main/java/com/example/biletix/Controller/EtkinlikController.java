package com.example.biletix.Controller;


import com.example.biletix.Model.Etkinlik;
import com.example.biletix.Service.EtkinlikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping(value = "/api/etkinlik")
@RestController
public class EtkinlikController {

    @Autowired
    EtkinlikService etkinlikService;


    @RequestMapping(path = "/etkinlikGetir",method = RequestMethod.GET)
    public @ResponseBody List<Etkinlik> etkinlikGetir(){

        return etkinlikService.etkinlikGetir();
    }
    @RequestMapping(path = "/etkinlikGetirId/{etkinlikId}",method = RequestMethod.GET)
    public @ResponseBody Etkinlik etkinlikGetirId(@PathVariable Long etkinlikId)
    {
        return etkinlikService.etkinlikGetirId(etkinlikId);
    }

    @RequestMapping(path = "/etkinlikSilId/{etkinlikId}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus etkinlikSilId(@PathVariable Long etkinlikId)
    {
        try {
            etkinlikService.etkinlikSilId(etkinlikId);
        }catch (Exception e)
        {

        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/save", method = RequestMethod.POST,consumes = "application/json" )
    public @ResponseBody HttpStatus saveEtkinlik(@RequestBody Etkinlik etkinlik)
    {
        try {
            etkinlikService.saveEtkinlik(etkinlik);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }

    @RequestMapping(path ="/update/{etkinlikId}/{etkinlikAd}" , method = RequestMethod.PUT )
    public @ResponseBody HttpStatus updateEtkinlik(@PathVariable Long etkinlikId, @PathVariable String etkinlikAd)
    {
        try {
            etkinlikService.updateEtkinlik(etkinlikId,etkinlikAd);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }



}
