package com.home.smooks;

import java.util.Date;

public class Order {
	
	public enum Status {
	    NEW, IN_PROGRESS, FINISHED
	}

	private Date creationDate;
	private Long number;
	private Status status;
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
