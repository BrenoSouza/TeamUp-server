package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.RegisterUser;

public class RegisterUserTest {
	private RegisterUser register;
	@Before
	public void setUp() {
		register = new RegisterUser();
		register.setAddress("João Pessoa");
		register.setEmail("joão@ccc.ufcg.edu.br");
		register.setName("João");
		register.setPassword("123456");
		register.setPhone("9999-9999");
	}

	@Test
	public void testGetName() {
		assertEquals("João",register.getName());
	}

	@Test
	public void testSetName() {
		register.setName("Paulo");
		assertEquals("Paulo",register.getName());
	}

	@Test
	public void testGetEmail() {
		assertEquals("joão@ccc.ufcg.edu.br",register.getEmail());
	}

	@Test
	public void testSetEmail() {
		register.setEmail("paulo@ccc");
		assertEquals("paulo@ccc",register.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("123456",register.getPassword());
	}

	@Test
	public void testSetPassword() {
		register.setPassword("1234");
		assertEquals("1234",register.getPassword());
	}

	@Test
	public void testGetPhone() {
		assertEquals("9999-9999",register.getPhone());
	}

	@Test
	public void testSetPhone() {
		register.setPhone("8888-8888");
		assertEquals("8888-8888",register.getPhone());
	}

	@Test
	public void testGetAddress() {
		assertEquals("João Pessoa",register.getAddress());
	}

	@Test
	public void testSetAddress() {
		register.setAddress("São Paulo");
		assertEquals("São Paulo",register.getAddress());
	}

}
