package com.rfsousa.GameManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rfsousa.GameManager.dto.GameMinDTO;
import com.rfsousa.GameManager.entities.Game;
import com.rfsousa.GameManager.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> gameList = gameRepository.findAll();
		
		return gameList.stream().map( x -> new GameMinDTO(x)).toList();
	}
}
