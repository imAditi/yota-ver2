package com.yash.yota.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * Option class is associated to Question
 * @author arju.yadav
 *
 */
@Entity
@Table(name="options")
public class Option {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * Option statement that will be displayed for the Question
	 */
	@Lob
	@NotBlank(message="option cannot be blank")
	private String optionStmt;
	/**
	 * This boolean value show whether this option is answer for this Question
	 */
	private Boolean isAnswer;
	/**
	 * The Question to which this Option is associated
	 */
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Question question;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOptionStmt() {
		return optionStmt;
	}
	public void setOptionStmt(String optionStmt) {
		this.optionStmt = optionStmt;
	}
	@JsonIgnore
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Boolean getIsAnswer() {
		return isAnswer;
	}
	public void setIsAnswer(Boolean isAnswer) {
		this.isAnswer = isAnswer;
	}
}