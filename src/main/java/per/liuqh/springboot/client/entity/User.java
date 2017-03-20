package per.liuqh.springboot.client.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private Integer age;
	private String status;
	private String name;
	private Integer isactive;
	private Date inserttime;
	private Date updatetime;
	
	public User() {
	}
	
	public User(Integer id) {
		this.id = id;
	}
	
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="age")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	@Column(name="isactive",insertable=false)
	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}
	@Column(name="inserttime",updatable=false,insertable=false)
	public Date getInserttime() {
		return inserttime;
	}
	
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	@Column(name="updatetime",updatable=false,insertable=false)
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	@Column(name="status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", status=" + status
				+ ", name=" + name + "]";
	}

	

	
} 