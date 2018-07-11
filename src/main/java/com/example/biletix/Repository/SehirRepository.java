package com.example.biletix.Repository;

import com.example.biletix.Model.Kategori;
import com.example.biletix.Model.Sehir;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SehirRepository  extends CrudRepository<Sehir,Long> {

    List<Sehir> findAll();
    Sehir findSehirBySehirId(@Param("sehirId") Long sehirId);



}
