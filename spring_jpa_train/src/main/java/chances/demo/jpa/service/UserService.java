package chances.demo.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import chances.demo.jpa.entity.Role;
import chances.demo.jpa.entity.User;
import chances.demo.jpa.repo.RoleRepository;
import chances.demo.jpa.repo.RoleSpecs;
import chances.demo.jpa.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired 
	RoleRepository roleRepository;

	public List<User> findUser(String name, String password) {
		User user = new User();
		user.setLoginName(name);
		user.setLoginPwd(password);
		ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();

		Example<User> example = Example.of(user, matcher);
		return userRepository.findAll(example);
	}
	
	public Role getRole(String name){
		return roleRepository.findOne(RoleSpecs.isRole(name));
	}
	
	public void saveUser(User user){
		this.userRepository.save(user);
	}
	
	public void saveRole(Role role){
		this.roleRepository.save(role);
	}
}
