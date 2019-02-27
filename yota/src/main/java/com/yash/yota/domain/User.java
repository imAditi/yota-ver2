package com.yash.yota.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="First Name is required")
	private String firstName;
	@NotEmpty(message="Last Name is required")
	private String lastName;

	private String loginname;
	@NotEmpty
	@Email(message="Please provide a valid email address")
	
	private String email;
	@OneToOne
	@JoinColumn(name="status_id")
	private Status status;
	@OneToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	private String password;
	@NotNull(message="Please provide registration code")
	
	private Long registrationCode;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date created_at;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updated_at;
	
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
	@PrePersist
	public void onCreate() {
		this.created_at = new Date();
	}
	@PostUpdate
	public void onUpdate() {
		this.updated_at = new Date();
	}
}
