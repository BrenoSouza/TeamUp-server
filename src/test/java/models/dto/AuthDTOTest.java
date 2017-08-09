package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.AuthDTO;

public class AuthDTOTest {
	
	AuthDTO authDTO;
	
	@Before
	public void setUp() {
		authDTO = new AuthDTO();
		authDTO.setEmail("pedro@ccc.ufcg.edu.br");
		authDTO.setPassword("1234");
	}
	@Test
	public void testAuthDTOStringString() {
		AuthDTO auth = new AuthDTO("matheus@ccc","123654");
	}

	@Test
	public void testGetEmail() {
		assertEquals("pedro@ccc.ufcg.edu.br",authDTO.getEmail());
	}

	@Test
	public void testSetEmail() {
		authDTO.setEmail("josé@ccc");
		assertEquals("josé@ccc",authDTO.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("1234",authDTO.getPassword());
	}

	@Test
	public void testSetPassword() {
		authDTO.setPassword("123654");
		assertEquals("123654",authDTO.getPassword());
	}

}
