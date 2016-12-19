/**
 * 
 */
package chances.demo.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

/**
 * @author chenxx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "jpa_role")
@Proxy
public class Role implements Serializable {

	
	@CreatedDate
	private Date createdDate;
	
	
	@LastModifiedBy
	private Date modiftyDate;

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

	

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModiftyDate() {
		return modiftyDate;
	}

	public void setModiftyDate(Date modiftyDate) {
		this.modiftyDate = modiftyDate;
	}

}
