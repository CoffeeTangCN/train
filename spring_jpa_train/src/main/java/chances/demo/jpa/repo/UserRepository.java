/**
 * 
 */
package chances.demo.jpa.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import chances.demo.jpa.entity.User;

/**
 * @author chenxx
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByLoginName(String loginName);

	public List<User> findByStatusOrderByLoginNameDesc(int status);

	@Query("from User where loginName = :loginName and loginPwd = :loginPwd")
	public User findUser(@Param("loginName") String loginName, @Param("loginPwd") String loginPwd);

	public Page<User> findByStatus(int status, Pageable pageable);

}
