package com.example.biletix.Repository;

import com.example.biletix.Model.Etkinlik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtkinlikRepository  extends CrudRepository<Etkinlik,Long> {

    List<Etkinlik> findAll();
    Etkinlik findEtkinlikByEtkinlikId(@Param("etkinlikId") Long etkinlikId);



}
