package com.example.filmes.service;

import java.util.List;

import com.example.filmes.domain.dto.FilmeDto;

public interface FilmesService {

  void save(FilmeDto dto);

  List<FilmeDto> getAll();

  FilmeDto getOne(Long id);

  void update(Long id, FilmeDto dto);

  void delete(Long id);
}
