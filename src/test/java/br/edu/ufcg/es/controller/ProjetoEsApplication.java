package br.edu.ufcg.es.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjetoEsApplication.class)
@TestPropertySource(locations="classpath:application.properties")
@AutoConfigureMockMvc
public class ProjetoEsApplication {

	@Test
	public void contextLoads() {
	}

}