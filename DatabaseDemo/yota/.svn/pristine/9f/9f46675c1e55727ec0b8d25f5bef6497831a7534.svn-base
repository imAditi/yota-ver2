package com.yash.yota.domain;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * TestGroups represents the group of Users that are supposed to give a particular list of tests.
 * @author arju.yadav
 *
 */
@Entity
@Table(name="testgroups")
public class TestGroup {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * Name of the TestGroup
	 */
	private String name;
	/**
	 * Registraion Code of this TestGroup is the code given to each User so they can be added to this TestGroup
	 */
	@Column(unique=true)
	private Long registrationCode;
	/**
	 * List of Tests that Users 
	 */
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Test> tests;
	/**
	 * Date at which the TestGroup was created
	 */
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date created_at;
	/**
	 * Date at which the User was updated
	 */
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updated_at;
	/**
	 * Id of User (trainer) who created this TestGroup
	 */
	private Long createdBy;
	/**
	 * Id of the User (trainer) who updated this TestGroup
	 */
	private Long updatedBy;
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
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
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
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
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
