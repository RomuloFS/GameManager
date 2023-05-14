package com.rfsousa.GameManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfsousa.GameManager.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
