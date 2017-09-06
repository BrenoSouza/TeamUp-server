package br.edu.ufcg.es.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufcg.es.model.Game;
import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.repository.UserRepository;
import br.edu.ufcg.es.util.Crud;

@Service
public class UserService implements Crud<User> {
	private UserRepository userRepository;
	
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public User create(User user) {
        return userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User update(User user) {
		return userRepository.exists(user.getId()) ? userRepository.save(user) : null;
	}

	@Override
	public boolean removeAll() {
		 userRepository.deleteAll();
	       	return true;
	}
	
    public User getByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    public boolean removeById(Long id) {
        if (userRepository.exists(id)) {
            userRepository.delete(id);
            return true;
        }
        return false;
    }

	@Override
	public List<User> getAllById(List<Long> ids) {
		return (List<User>) userRepository.findAll(ids);
	}
	
	@Override
	public List<User> findByName(String name) {
		return (List<User>) userRepository.getByName(name); 
	}
	
	@Override
	public List<User> findByAddress(String address) {
		return (List<User>) userRepository.getByAddress(address); 
	}
}
