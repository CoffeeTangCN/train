package chances.demo.jpa.repo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import chances.demo.jpa.entity.Role;

public class RoleSpecs {
	public static Specification<Role> isRole(String name) {
		return new Specification<Role>() {

			@Override
			public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				return builder.equal(root.get("name"), name);
			}
		};
	}

}
