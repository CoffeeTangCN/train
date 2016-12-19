package chances.demo.jpa.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chances.demo.jpa.entity.Role;
import chances.demo.jpa.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-application.xml")
public class UserServiceTest {
	@Autowired
	UserService userService;

	@Before
	public void insert() {
		User aUser = new User();
		aUser.setName("coffee");
		aUser.setLoginName("coffee");
		aUser.setLoginPwd("password");
		userService.saveUser(aUser);
		Role aRole = new Role();
		aRole.setName("admin");
		userService.saveRole(aRole);

	}

	@Test
	public void testFindUser() {
		List<User> users = userService.findUser("coffee", "password");
		assertEquals(1, users.size());
	}

	@Test
	public void testGetRole() {
		Role aRole = userService.getRole("admin");
		assertNotNull(aRole);
	}

}
