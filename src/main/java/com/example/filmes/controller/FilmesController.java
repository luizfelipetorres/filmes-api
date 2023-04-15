package com.example.filmes.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.filmes.domain.dto.FilmeDto;

import jakarta.validation.Valid;

public interface FilmesController {

  @PostMapping
  ResponseEntity<Void> save(@RequestBody @Valid FilmeDto dto);

  @GetMapping
  ResponseEntity<List<FilmeDto>> getAll();

  @GetMapping(path = "/{id}")
  ResponseEntity<FilmeDto> getOne(@PathVariable Long id);

  @PutMapping(path = "/{id}")
  ResponseEntity<Void> update(@PathVariable Long id, @RequestBody FilmeDto dto);

  @DeleteMapping(path = "/{id}")
  ResponseEntity<Void> delete(@PathVariable Long id);
}
