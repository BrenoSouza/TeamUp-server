package br.edu.ufcg.es.repository;

import br.edu.ufcg.es.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    User getByEmail(String email);
    List<User> getByName(String name);
    List<User> getByAddress(String address);
}
