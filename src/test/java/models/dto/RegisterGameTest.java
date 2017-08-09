package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.RegisterGame;

public class RegisterGameTest {
	private RegisterGame register;
	@Before
	public void setUp() {
		register = new RegisterGame();
		register.setDate("19/12/2017");
		register.setDescription("Grandes encontros");
		register.setLocal("UFCG");
		register.setName("The Top");
		register.setSport("Volei");
	}
	@Test
	public void testGetDate() {
		assertEquals("19/12/2017",register.getDate());
	}

	@Test
	public void testSetDate() {
		register.setDate("28/12/2018");
		assertEquals("28/12/2018",register.getDate());
	}

	@Test
	public void testGetLocal() {
		assertEquals("UFCG",register.getLocal());
	}

	@Test
	public void testSetLocal() {
		register.setLocal("UEPB");
		assertEquals("UEPB",register.getLocal());
	}

	@Test
	public void testGetSport() {
		assertEquals("Volei",register.getSport());
	}

	@Test
	public void testSetSport() {
		register.setSport("Basquete");
		assertEquals("Basquete",register.getSport());
	}

	@Test
	public void testGetDescription() {
		assertEquals("Grandes encontros",register.getDescription());
	}

	@Test
	public void testSetDescription() {
		register.setDescription("Reencontro");
		assertEquals("Reencontro",register.getDescription());
	}

	@Test
	public void testGetName() {
		assertEquals("The Top",register.getName());
	}

	@Test
	public void testSetName() {
		register.setName("Lendas");
		assertEquals("Lendas",register.getName());
	}

}
