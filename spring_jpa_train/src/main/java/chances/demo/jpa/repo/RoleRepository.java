/**
 * 
 */
package chances.demo.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import chances.demo.jpa.entity.Role;

/**
 * @author chenxx
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
