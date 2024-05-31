package com.crud.demo.modeloDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
}