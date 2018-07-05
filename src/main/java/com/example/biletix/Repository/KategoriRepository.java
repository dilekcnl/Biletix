package com.example.biletix.Repository;

import com.example.biletix.Model.Kategori;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KategoriRepository  extends CrudRepository<Kategori,Long> {

    List<Kategori> findAll();
    Kategori findKategoriByKategoriId(@Param("kategoriId") Long kategoriId);



}
