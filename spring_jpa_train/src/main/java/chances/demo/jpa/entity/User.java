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

/**
 * @author chenxx
 *
 */
@Entity
@Table(name = "jpa_user")
@Proxy(lazy = false)
public class User implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 7414012905775562725L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;

	@Column(name = "login_name")
	private String loginName;

	@Column(name = "login_pwd")
	private String loginPwd;

	@Column(name = "user_name")
	private String name;

	@Column(name = "user_status")
	private int status;

	@Column(name = "create_time")
	private Date createTime = new Date();
	
	

	@Column(name = "email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
