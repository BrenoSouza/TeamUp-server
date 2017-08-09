package models;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.User;

public class UserTest {
	
	User user;
	@Before
	public void setUp() {
		user = new User();
		user.setId((long) 0);
		user.setName("Lucas");
		user.setAddress("Campina Grande");
		user.setEmail("lucas@ccc.ufcg.edu.br");
		user.setPassword("1234");
		user.setPhone("9999-9999");
		
		
	}


	@Test
	public void testGetName() {
		assertEquals("Lucas",user.getName());
	}

	
	@Test
	public void testGetEmail() {
		assertEquals("lucas@ccc.ufcg.edu.br",user.getEmail());
	}

	
	@Test
	public void testGetPassword() {
		assertEquals("1234",user.getPassword());
	}


	@Test
	public void testGetPhone() {
		assertEquals("9999-9999",user.getPhone());
	}


	@Test
	public void testGetAddress() {
		assertEquals("Campina Grande",user.getAddress());
	}

	
	

}
