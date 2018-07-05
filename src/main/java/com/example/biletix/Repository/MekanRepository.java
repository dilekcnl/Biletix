package com.example.biletix.Repository;

import com.example.biletix.Model.Mekan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MekanRepository  extends CrudRepository<Mekan,Long> {

    List<Mekan> findAll();
    Mekan findMekanByMekanId(@Param("mekanId") Long mekanId);



}
