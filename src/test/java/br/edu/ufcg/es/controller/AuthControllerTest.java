package br.edu.ufcg.es.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.google.gson.Gson;

import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.model.DTO.AuthDTO;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AuthControllerTest extends ProjetoEsApplication {
	
	@Autowired
    private MockMvc mockMvc;

	//Cria o usuario para todos os testes
	@Test
	public void atestAuthController() throws Exception {
		
		User user = new User("testBackAuth","teste.auth@teste.com","123456789","123456789","testbackaddress");

		Gson gson = new Gson();
		String json = gson.toJson(user);
		
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/register")
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.content(json)
		).andExpect(status().isCreated());

	}
	// Testa um caso válido
	@Test
	public void testAuthUser01() throws Exception {
		AuthDTO auth = new AuthDTO("teste.auth@teste.com", "123456789");
		
		Gson gson = new Gson();
		String json = gson.toJson(auth);
		
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/auth")
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.content(json)
		).andExpect(status().isAccepted());
		
	}
	
	//Testa o caso em que a senha esteja errada
	@Test
	public void testAuthUser02() throws Exception {
		AuthDTO auth = new AuthDTO("teste.auth@teste.com", "senha.errada");
		
		Gson gson = new Gson();
		String json = gson.toJson(auth);
		
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/auth")
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.content(json)
		).andExpect(status().isForbidden());
		
	}
	
	//Testa o caso em que o email esteja errado
		@Test
		public void testAuthUser03() throws Exception {
			AuthDTO auth = new AuthDTO("email.nao.existe@teste.com", "123456789");
			
			Gson gson = new Gson();
			String json = gson.toJson(auth);
			
			this.mockMvc
			.perform(MockMvcRequestBuilders.post("/auth")
			.contentType(MediaType.APPLICATION_JSON_VALUE)
			.content(json)
			).andExpect(status().isForbidden());
			
		}

}
