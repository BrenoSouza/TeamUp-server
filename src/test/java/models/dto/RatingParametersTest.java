package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.RatingParameters;

public class RatingParametersTest {
	private RatingParameters rating;
	@Before
	public void setUp() {
		rating = new RatingParameters();
		rating.setAbility(10);
		rating.setFairPlay(10);
	}
	@Test
	public void testGetAbility() {
		assertEquals(10,rating.getAbility());
	}

	@Test
	public void testSetAbility() {
		rating.setAbility(8);
		assertEquals(8,rating.getAbility());
	}

	@Test
	public void testGetFairPlay() {
		assertEquals(10,rating.getFairPlay());
	}

	@Test
	public void testSetFairPlay() {
		rating.setFairPlay(8);
		assertEquals(8,rating.getFairPlay());
	}

}
