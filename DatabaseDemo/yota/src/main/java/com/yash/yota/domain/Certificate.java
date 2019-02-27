package com.yash.yota.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Certificate for User (Trainee) who has completed the training
 * @author arju.yadav
 *
 */
@Entity
@Table(name="certificates")
public class Certificate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * Title of Certificate
	 */
	private String title;
	/**
	 * User to whom certificate is presented
	 */
	private String presentedTo;
	/**
	 * Score of the User
	 */
	private Integer score;
	/**
	 * Batch of the User
	 */
	private String batch;
	/**
	 * Date at which certificate was issued
	 */
	private Date date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPresentedTo() {
		return presentedTo;
	}
	public void setPresentedTo(String presentedTo) {
		this.presentedTo = presentedTo;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
