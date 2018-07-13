package com.example.biletix.Controller;


import com.example.biletix.Model.Mekan;
import com.example.biletix.Service.MekanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping(value = "/api/mekan")
@RestController
public class MekanController {

    @Autowired
    MekanService mekanService;


    @RequestMapping(path = "/mekanGetir",method = RequestMethod.GET)
    public @ResponseBody List<Mekan> mekanGetir(){

        return mekanService.mekanGetir();
    }
    @RequestMapping(path = "/mekanGetirId/{mekanId}",method = RequestMethod.GET)
    public @ResponseBody List<Mekan> mekanGetirId(@PathVariable Long mekanId)
    {
        return mekanService.mekanGetirId(mekanId);
    }

    @RequestMapping(path = "/mekanSilId/{mekanId}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus mekanSilId(@PathVariable Long mekanId)
    {
        try {
            mekanService.mekanSilId(mekanId);
        }catch (Exception e)
        {

        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/save", method = RequestMethod.POST,consumes = "application/json" )
    public @ResponseBody HttpStatus saveMekan(@RequestBody Mekan mekan)
    {
        try {
            mekanService.saveMekan(mekan);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }

    @RequestMapping(path ="/update/{mekanId}/{mekanAd}" , method = RequestMethod.PUT )
    public @ResponseBody HttpStatus updateMekan(@PathVariable Long mekanId, @PathVariable String mekanAd)
    {
        try {
            mekanService.updateMekan(mekanId,mekanAd);
        }catch (Exception e)
        {

        }

        return  HttpStatus.OK;
    }



}
