package com.home.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distributor {

	private String distributorId;
    private String distributorName;
    private String distributorFirstName;
    private String distributorLastName;
    private String distributorPhone;
    private String distributorEmail;
    private String distributorIpid; 
    private String wellnessCoordinator;
    private String distributorWebsite; 
    
    public Distributor(){}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getDistributorFirstName() {
		return distributorFirstName;
	}

	public void setDistributorFirstName(String distributorFirstName) {
		this.distributorFirstName = distributorFirstName;
	}

	public String getDistributorLastName() {
		return distributorLastName;
	}

	public void setDistributorLastName(String distributorLastName) {
		this.distributorLastName = distributorLastName;
	}

	public String getDistributorPhone() {
		return distributorPhone;
	}

	public void setDistributorPhone(String distributorPhone) {
		this.distributorPhone = distributorPhone;
	}

	public String getDistributorEmail() {
		return distributorEmail;
	}

	public void setDistributorEmail(String distributorEmail) {
		this.distributorEmail = distributorEmail;
	}

	public String getDistributorIpid() {
		return distributorIpid;
	}

	public void setDistributorIpid(String distributorIpid) {
		this.distributorIpid = distributorIpid;
	}

	public String getWellnessCoordinator() {
		return wellnessCoordinator;
	}

	public void setWellnessCoordinator(String wellnessCoordinator) {
		this.wellnessCoordinator = wellnessCoordinator;
	}

	public String getDistributorWebsite() {
		return distributorWebsite;
	}

	public void setDistributorWebsite(String distributorWebsite) {
		this.distributorWebsite = distributorWebsite;
	}
    
    

}

