package models.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.es.model.DTO.SearchDTO;

public class SearchDTOTest {
	private SearchDTO search;
	@Before
	public void setUp() {
		search = new SearchDTO();
		search.setName("search");
	}
	@Test
	public void testSearchDTO() {
		SearchDTO scr = new SearchDTO("procura");
	}


	@Test
	public void testGetName() {
		assertEquals(search.getName(),"search");
	}

}
