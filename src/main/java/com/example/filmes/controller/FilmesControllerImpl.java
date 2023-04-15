package com.example.filmes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filmes.domain.dto.FilmeDto;
import com.example.filmes.service.FilmesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/filme")
public class FilmesControllerImpl implements FilmesController {

  @Autowired
  private FilmesService filmesService;

  @Override
  @PostMapping
  public ResponseEntity<Void> save(@RequestBody @Valid FilmeDto dto) {
    filmesService.save(dto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .build();
  }

  @Override
  @GetMapping
  public ResponseEntity<List<FilmeDto>> getAll() {
    return ResponseEntity.ok(filmesService.getAll());
  }

  @Override
  @GetMapping(path = "/{id}")
  public ResponseEntity<FilmeDto> getOne(@PathVariable Long id) {
    return ResponseEntity.ok(filmesService.getOne(id));
  }

  @Override
  @PutMapping(path = "/{id}")
  public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody FilmeDto dto) {
    filmesService.update(id, dto);
    return ResponseEntity
        .noContent()
        .build();
  }

  @Override
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    filmesService.delete(id);
    return ResponseEntity
        .noContent()
        .build();
  }
}
