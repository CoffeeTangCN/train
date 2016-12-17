/**
 * 
 */
package chances.demo.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * @author chenxx
 *
 */
@Entity
@Table(name = "jpa_role")
@Proxy
public class Role implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 6398393158343936469L;

	@Id
	@GeneratedValue
	@Column(name = "role_id")
	private Long id;

	@Column
	private String name;

	@Column(name = "role_desc")
	private String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
