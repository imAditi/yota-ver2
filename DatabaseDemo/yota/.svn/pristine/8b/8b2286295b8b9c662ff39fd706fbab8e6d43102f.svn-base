package com.yash.yota.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * This User model is used as data traveler from layer to layer. 
 * User can be a trainer, trainee or training manager.
 * @author arju.yadav
 *
 */
@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * First name of the user
	 */
	private String firstName;
	/**
	 * Last name of the user
	 */
	private String lastName;
	/**
	 * Login name of the user
	 */
	private String loginname;
	/**
	 * Email of the user
	 */
	private String email;
	/**
	 * Status of the user
	 * 1: Active
	 * 2: Blocked
	 */
	@OneToOne
	private Status status;
	/**
	 * Role of the user
	 * 1: Training Manager
	 * 2: Trainer
	 * 3: Trainee
	 * 4: Admin
	 * 5: Super User
	 */
	@OneToOne
	private Role role;
	/**
	 * Password of the user
	 */
	private String password;
	/**
	 * Registration Code of the user. This registration code is associated with the user's TestGroup, 
	 * therefore it determines which TestGroup this User belongs to
	 */
	private Long registrationCode;
	/**
	 * Date at which the User was created
	 */
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date created_at;
	/**
	 * Date at which the User was updated
	 */
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updated_at;
	/**
	 * Id of the User who created this User
	 */
	private Long created_By;
	/**
	 * Id of the User who update this User
	 */
	private Long updated_By;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRegistrationCode() {
		return registrationCode;
	}
	public void setRegistrationCode(Long registrationCode) {
		this.registrationCode = registrationCode;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	public Long getCreated_By() {
		return created_By;
	}
	public void setCreated_By(Long created_By) {
		this.created_By = created_By;
	}
	public Long getUpdated_By() {
		return updated_By;
	}
	public void setUpdated_By(Long updated_By) {
		this.updated_By = updated_By;
	}
	@PrePersist
	public void onCreate() {
		this.created_at = new Date();
	}
	@PostUpdate
	public void onUpdate() {
		this.updated_at = new Date();
	}
}
