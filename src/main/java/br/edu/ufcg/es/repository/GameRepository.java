package br.edu.ufcg.es.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.edu.ufcg.es.model.Game;

public interface GameRepository extends CrudRepository<Game, Long> {
	List<Game> findAll();
	List<Game> getByName(String name);
	List<Game> getByLocal(String local);
	List<Game> getBySport(String sport);
}
