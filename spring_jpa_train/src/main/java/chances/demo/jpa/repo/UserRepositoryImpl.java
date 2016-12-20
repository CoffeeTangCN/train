package chances.demo.jpa.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;

import chances.demo.jpa.entity.User;

public class UserRepositoryImpl implements CustomUserRepository {
	
	
	@Autowired
	private  EntityManager entityManager;
	
	
	public  UserRepositoryImpl() {
		super();
	}
	@Autowired
	public UserRepositoryImpl(JpaContext context) {
	    this.entityManager = context.getEntityManagerByManagedType(User.class);
	 }

	@Override
	public User loadUser(Long id) {
		return entityManager.find(User.class, id);
	}
	
	
	
}
