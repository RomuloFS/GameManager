package com.rfsousa.GameManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfsousa.GameManager.dto.GameDTO;
import com.rfsousa.GameManager.dto.GameMinDTO;
import com.rfsousa.GameManager.entities.Game;
import com.rfsousa.GameManager.projections.GameMinProjection;
import com.rfsousa.GameManager.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> games = gameRepository.findAll();
		return games.stream().map( x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		return games.stream().map( x -> new GameMinDTO(x)).toList();
	}
}
