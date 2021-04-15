package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_role_id")
	private Long userroleid;
	@Column(name = "user_id")
	private Long userid;
	@Column(name = "role")
	private String role;
	
	
	public UserRole() {
	}


	public UserRole(Long userroleid, Long userid, String role) {
		this.userroleid = userroleid;
		this.userid = userid;
		this.role = role;
	}


	public Long getUserroleid() {
		return userroleid;
	}


	public void setUserroleid(Long userroleid) {
		this.userroleid = userroleid;
	}


	public Long getUserid() {
		return userid;
	}


	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		result = prime * result + ((userroleid == null) ? 0 : userroleid.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRole other = (UserRole) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (userroleid == null) {
			if (other.userroleid != null)
				return false;
		} else if (!userroleid.equals(other.userroleid))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserRole [userroleid=" + userroleid + ", userid=" + userid + ", role=" + role + "]";
	}
	
	
	

	
}
