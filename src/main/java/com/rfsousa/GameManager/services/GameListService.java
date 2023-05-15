package com.rfsousa.GameManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfsousa.GameManager.dto.GameListDTO;
import com.rfsousa.GameManager.entities.GameList;
import com.rfsousa.GameManager.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> gameList = gameListRepository.findAll();
		return gameList.stream().map( x -> new GameListDTO(x)).toList();
	}
}