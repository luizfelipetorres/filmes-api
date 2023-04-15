package com.example.filmes.domain.entities;

import com.example.filmes.domain.dto.FilmeDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Filme {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String sinopse;
  private String nome;
  private String foto;

  public Filme(FilmeDto dto) {
    id = dto.id();
    sinopse = dto.sinopse();
    nome = dto.nome();
    foto = dto.foto();
  }
}
