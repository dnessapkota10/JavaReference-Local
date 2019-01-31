package com.home.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Preferences {

	private long customerId;
    private String[] demographic1Answers;
    private String demographic1Other;
    private String[] demographic2Answers;
    private String demographic2Other;
    private String demographic3;
    private String language;
    private Long familyId;
    
    public void Preferences(){}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String[] getDemographic1Answers() {
		return demographic1Answers;
	}

	public void setDemographic1Answers(String[] demographic1Answers) {
		this.demographic1Answers = demographic1Answers;
	}

	public String getDemographic1Other() {
		return demographic1Other;
	}

	public void setDemographic1Other(String demographic1Other) {
		this.demographic1Other = demographic1Other;
	}

	public String[] getDemographic2Answers() {
		return demographic2Answers;
	}

	public void setDemographic2Answers(String[] demographic2Answers) {
		this.demographic2Answers = demographic2Answers;
	}

	public String getDemographic2Other() {
		return demographic2Other;
	}

	public void setDemographic2Other(String demographic2Other) {
		this.demographic2Other = demographic2Other;
	}

	public String getDemographic3() {
		return demographic3;
	}

	public void setDemographic3(String demographic3) {
		this.demographic3 = demographic3;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Long familyId) {
		this.familyId = familyId;
	}
    
    
}
