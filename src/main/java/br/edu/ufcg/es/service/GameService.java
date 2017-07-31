package br.edu.ufcg.es.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufcg.es.model.Game;
import br.edu.ufcg.es.repository.GameRepository;
import br.edu.ufcg.es.util.Crud;

@Service
public class GameService implements Crud<Game> {
	private GameRepository gameRepository;
	
	@Autowired
	public GameService(GameRepository gameRepository){
		this.gameRepository = gameRepository;
	}
	
	@Override
	public Game create(Game game) {
        return gameRepository.save(game);
	}

	@Override
	public List<Game> getAll() {
		return gameRepository.findAll();
	}

	@Override
	public Game getById(Long id) {
		return gameRepository.findOne(id);
	}

	@Override
	public Game update(Game game) {
		return gameRepository.exists(game.getId()) ? gameRepository.save(game) : null;
	}

	@Override
	public boolean removeAll() {
		 gameRepository.deleteAll();
	       	return true;
	}

    @Override
    public boolean removeById(Long id) {
        if (gameRepository.exists(id)) {
            gameRepository.delete(id);
            return true;
        }
        return false;
    }

	@Override
	public List<Game> getAllById(List<Long> ids) {
		return (List<Game>) gameRepository.findAll(ids);
	}
    
	public List<Game> getBySport(String sport) {
		return (List<Game>) gameRepository.getBySport(sport);
	}

	@Override
	public List<Game> findByName(String name) {
		return (List<Game>) gameRepository.getByName(name); 
	}

	@Override
	public List<Game> findByAddress(String local) {
		return (List<Game>) gameRepository.getByLocal(local);
	}
}
