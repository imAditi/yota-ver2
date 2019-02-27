package com.yash.yota.domain;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
/**
 * Test consists of questions of the relevant category
 * Test is assigned to the TestGroups
 * @author arju.yadav
 *
 */
@Entity
@Table(name="tests")
public class Test {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * Name of the Test
	 */
	private String name;
	/**
	 * Duration of Test
	 */
	private Integer duration;
	/**
	 * passing marks of Test
	 */
	private Integer passingMarks;
	/**
	 * Number of questions in Test
	 */
	private Integer totalQuestions;
	/**
	 * Visibility of Test
	 * 3: Visible
	 * 4: Hidden
	 */
	@OneToOne
	private Status visibility;
	/**
	 * Questions assigned to this Test
	 */
	@ManyToMany(mappedBy="tests")
	private List<Question> questions;
	/**
	 * TestGroups which are assigned this Test
	 */
	@ManyToMany(mappedBy="tests",fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private List<TestGroup> testGroups;
	/**
	 * Category to which this test belongs
	 */
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Category category;
	
	public Status getVisibility() {
		return visibility;
	}
	public void setVisibility(Status visibility) {
		this.visibility = visibility;
	}
	public List<TestGroup> getGroups() {
		return testGroups;
	}
	public void setGroups(List<TestGroup> groups) {
		this.testGroups = groups;
	}
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getPassingMarks() {
		return passingMarks;
	}
	public void setPassingMarks(Integer passingMarks) {
		this.passingMarks = passingMarks;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public Integer getTotalQuestions() {
		return totalQuestions;
	}
	public void setNoOfQuestions(Integer totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
