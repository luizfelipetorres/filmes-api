package com.example.filmes.service;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filmes.domain.dto.FilmeDto;
import com.example.filmes.domain.entities.Filme;
import com.example.filmes.repository.FilmesRepository;

@Service
public class FilmesServiceImpl implements FilmesService {

  @Autowired
  private FilmesRepository filmesRepository;

  @Override
  public void save(FilmeDto dto) {
    filmesRepository.save(new Filme(dto));
  }

  @Override
  public List<FilmeDto> getAll() {
    return toDto(filmesRepository.findAll());
  }

  private List<FilmeDto> toDto(List<Filme> filmeList) {
    return filmeList
        .stream()
        .map(FilmeDto::new)
        .toList();
  }

  @Override
  public FilmeDto getOne(Long id) {
    return filmesRepository
        .findById(id)
        .map(FilmeDto::new)
        .orElse(null);
  }

  @Override
  public void update(Long id, FilmeDto dto) {
    filmesRepository
        .findById(id)
        .ifPresent(update(dto));
  }

  private Consumer<Filme> update(FilmeDto dto) {
    return filme -> {
      filme.setFoto(dto.foto());
      filme.setNome(dto.nome());
      filme.setSinopse(dto.sinopse());
      filmesRepository.save(filme);
    };
  }

  @Override
  public void delete(Long id) {
    filmesRepository.deleteById(id);
  }
}
