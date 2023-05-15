package com.rfsousa.GameManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfsousa.GameManager.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
