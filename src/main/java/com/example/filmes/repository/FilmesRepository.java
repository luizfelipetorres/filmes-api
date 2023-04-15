package com.example.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.filmes.domain.entities.Filme;

public interface FilmesRepository extends JpaRepository<Filme, Long> {

}
