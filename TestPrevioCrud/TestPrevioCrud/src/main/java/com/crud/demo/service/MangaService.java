package com.crud.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.demo.modelo.Manga;
import com.crud.demo.modeloDAO.MangaRepository;

@Service
public class MangaService implements MangaServiceImpl {

    @Autowired
    private MangaRepository dao;

    @Override
    public List<Manga> listar() {        
        return (List<Manga>) dao.findAll();
    }

    @Override
    public Optional<Manga> listarId(Long id) {        
        return dao.findById(id);
    }

    @Override
    public Manga save(Manga m) {
        return dao.save(m);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
