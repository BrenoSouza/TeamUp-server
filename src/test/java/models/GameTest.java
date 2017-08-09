package models;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.Game;

public class GameTest {
	Game game;
	@Before
	public void setUp() {
		game = new Game();
		game.setName("Matheus");
		game.setId(0);
		game.setDate("28/12/1997");
		game.setLocal("UFCG");
		game.setSport("Futsal");
		game.setDescription("Racha das estrelas");
		game.setIdOwner(0);
		game.setFinished(false);
	}
	

	@Test
	public void testGetId() {
		assertEquals(0,game.getId());
	}


	@Test
	public void testGetDate() {
		assertEquals("28/12/1997",game.getDate());
	}


	@Test
	public void testGetName() {
		assertEquals("Matheus",game.getName());
	}


	@Test
	public void testGetLocal() {
		assertEquals("UFCG",game.getLocal());
	}


	@Test
	public void testGetSport() {
		assertEquals("Futsal",game.getSport());
	}
	

	@Test
	public void testGetDescription() {
		assertEquals("Racha das estrelas",game.getDescription());
	}


	@Test
	public void testGetIdOwner() {
		assertEquals(0,game.getIdOwner());
	}


	@Test
	public void testIsFinished() {
		assertEquals(false,game.isFinished());
	}


}
