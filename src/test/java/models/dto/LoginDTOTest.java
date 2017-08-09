package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.LoginDTO;

public class LoginDTOTest {
	LoginDTO login = new LoginDTO();
	@Before
	public void setUp() {
		login.setToken("123");
		login.setUserId((long) 10);
	}


	@Test
	public void testLoginDTO() {
		LoginDTO log = new LoginDTO("10",(long) 10);
	}

	@Test
	public void testGetToken() {
		assertEquals("123",login.getToken());
	}

	@Test
	public void testSetToken() {
		login.setToken("6464");
		assertEquals("6464",login.getToken());
	}


}
