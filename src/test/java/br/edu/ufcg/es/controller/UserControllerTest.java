package br.edu.ufcg.es.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.google.gson.Gson;

import br.edu.ufcg.es.component.TokenService;
import br.edu.ufcg.es.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserControllerTest extends ProjetoEsApplication{
	
	

	@Autowired
    private MockMvc mockMvc;
	@Autowired
	private TokenService token;
	
	
	private User user1 = new User("testBackUser1","teste.user01@teste.com","123456789","123456789","testbackaddress");
	private User user2 = new User("testBackUser2","teste.user02@teste.com","123456789","123456789","testbackaddress");

	
	// cria usuário
	@Before
	public void registerUser() throws Exception {	
	
		Gson gson = new Gson();
		String json = gson.toJson(user1);
		
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/register")
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.content(json)
		).andExpect(status().isCreated());
	}
	
	// remove usuario
	@After
	public void DeleteUser() throws Exception {
		String values = token.generateToken(user1);
		
		this.mockMvc
			.perform(MockMvcRequestBuilders.delete("/user")
			.header("Authorization", values)
			.contentType(MediaType.APPLICATION_JSON_VALUE))			
			.andExpect(MockMvcResultMatchers.status().isOk());
	}

//------------------ test get all user----------------------------------------
	//@Test
	public void testGetAllUser01() throws Exception {
		
		String values = token.generateToken(user1);
		
		this.mockMvc
			.perform(MockMvcRequestBuilders.get("/user")
			.header("Authorization", values))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	//@Test
	public void testGetAllUser02() throws Exception {		
		
		String valuesTemp = token.generateToken(user2);
		
		this.mockMvc
			.perform(MockMvcRequestBuilders.get("/user")
			.header("Authorization", valuesTemp))
			.andExpect(MockMvcResultMatchers.status().isUnauthorized());
	}
	
//------------------ test get user by id----------------------------------------	
	//@Test
	public void testGetUserById01() throws Exception {
		user1.setId((long) 1);
		System.out.println("id :" + user1.getId());
		String values = token.generateToken(user1);
		
		this.mockMvc
			.perform(MockMvcRequestBuilders.get("/user/" + user1.getId())
			.header("Authorization", values))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	//@Test
	public void testGetUserById02() throws Exception {
		user2.setId((long) 2);
		String values = token.generateToken(user2);
		
		this.mockMvc
			.perform(MockMvcRequestBuilders.get("/user/" + user2.getId())
			.header("Authorization", values))
			.andExpect(MockMvcResultMatchers.status().isUnauthorized());
	}

//------------------ test edit user----------------------------------------

	//@Test
	public void testEditUser() throws Exception {
		
		String values = token.generateToken(user1);
		Gson gson = new Gson();
		String json = gson.toJson(user2);
		
		this.mockMvc
		.perform(MockMvcRequestBuilders.put("/user")
		.header("Authorization", values)
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		).andExpect(status().isOk());
	}

	//.content(json)

//------------------ test edit user----------------------------------------
	//@Test
	public void testGetMyFavoriteUsers() {
		fail("Not yet implemented");
	}

	//@Test
	public void testAddOrRemoveFavoriteUser() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSearchUserByAddress() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSearchUserByName() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetMyGameInvites() {
		fail("Not yet implemented");
	}

	//@Test
	public void testAcceptInvite() {
		fail("Not yet implemented");
	}

	//@Test
	public void testRejectInvite() {
		fail("Not yet implemented");
	}

}
