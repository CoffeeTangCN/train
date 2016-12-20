package chances.demo.jpa.service;

import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import chances.demo.jpa.entity.Role;
import chances.demo.jpa.entity.User;

@RepositoryEventHandler
public class RoleEventHandler {
	@HandleBeforeSave(User.class) public void handleUserSave(User user){
		
	}
	@HandleBeforeSave(Role.class) public void handleRoleSave(Role role){
		
	}
	
}
