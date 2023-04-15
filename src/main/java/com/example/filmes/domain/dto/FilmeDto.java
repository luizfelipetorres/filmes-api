package com.example.filmes.domain.dto;

import com.example.filmes.domain.entities.Filme;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public record FilmeDto(
    Long id,
    String foto,
    @NotNull(message = "O nome não pode ser nulo")
    String nome,
    @NotNull(message = "A sinopse não pode ser nula")
    @Size(max = 255, min = 25, message = "A sinopse deve ter entre 255 e 25 caracteres")
    String sinopse) {

  public FilmeDto(Filme filme) {
    this(filme.getId(), filme.getNome(), filme.getFoto(), filme.getSinopse());
  }
}
