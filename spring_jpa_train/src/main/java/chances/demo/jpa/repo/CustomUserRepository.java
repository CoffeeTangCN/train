package chances.demo.jpa.repo;

import chances.demo.jpa.entity.User;

public interface CustomUserRepository {
	public User loadUser(Long id);
}
