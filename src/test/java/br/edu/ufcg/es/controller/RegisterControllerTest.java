package br.edu.ufcg.es.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.google.gson.Gson;
import br.edu.ufcg.es.model.User;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class RegisterControllerTest extends ProjetoEsApplication {
	
	@Autowired
    private MockMvc mockMvc;

	@Test
	public void testRegisterUser01() throws Exception {
		
		User user = new User("testBack01","testback01@teste.com","123456789","123456789","testbackaddress");
		Gson gson = new Gson();
		String json = gson.toJson(user);
		
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/register")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(json)
				).andExpect(status().isCreated());
	}
	
	//
	@Test
	public void testRegisterUser02() throws Exception {
		
		User user = new User("testBack01","testback01@teste.com","123456789","123456789","testbackaddress");
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/register")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(json)
				).andExpect(status().isConflict());
	}
	
	@Test
	public void testRegisterUser03() throws Exception {
		
		User user = new User("testBack02","testback02@teste.com","123456789","123456789","testbackaddress");
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/register")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(json)
				).andExpect(status().isCreated());
	}


	@Test
	public void testRegisterUser04() throws Exception {
		
		User user = new User("testBack02","testback02@teste.com","123456789","123456789","testbackaddress");
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/register")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(json)
				).andExpect(status().isConflict());
	}

}
