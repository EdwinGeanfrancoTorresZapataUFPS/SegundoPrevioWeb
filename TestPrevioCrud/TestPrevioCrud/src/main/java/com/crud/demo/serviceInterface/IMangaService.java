package com.crud.demo.serviceInterface;

import com.crud.demo.modelo.Manga;

import java.util.List;

public interface IMangaService {
    List<Manga> getAllMangas();
    Manga getMangaById(Long id);
    Manga createManga(Manga manga);
    Manga updateManga(Long id, Manga manga);
    void deleteManga(Long id);
}
