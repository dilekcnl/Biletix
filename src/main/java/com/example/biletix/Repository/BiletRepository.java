package com.example.biletix.Repository;

import com.example.biletix.Model.Bilet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiletRepository  extends CrudRepository<Bilet,Long> {

    List<Bilet> findAll();
    Bilet findBiletByBiletId(@Param("biletId") Long biletId);



}
