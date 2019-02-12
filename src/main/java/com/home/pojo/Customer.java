package com.home.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
//@JsonIgnoreProperties({ "rest" })

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	@XmlID
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean distributor;
	private boolean thirdParty;
	private boolean thirdPartyAccount;
	private String distributorId;
	private Date entryDate;
	private String countryCode;
	private Distributor myDistributor;
	private Preferences perferneces;
	private NoteSummary messageSummary;
    private Distributor wellnessCoordinator;
    
    public Customer () {}
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isDistributor() {
		return distributor;
	}
	public void setDistributor(boolean distributor) {
		this.distributor = distributor;
	}
	public boolean isThirdParty() {
		return thirdParty;
	}
	public void setThirdParty(boolean thirdParty) {
		this.thirdParty = thirdParty;
	}
	public boolean isThirdPartyAccount() {
		return thirdPartyAccount;
	}
	public void setThirdPartyAccount(boolean thirdPartyAccount) {
		this.thirdPartyAccount = thirdPartyAccount;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Distributor getMyDistributor() {
		return myDistributor;
	}
	public void setMyDistributor(Distributor myDistributor) {
		this.myDistributor = myDistributor;
	}
	public Preferences getPerferneces() {
		return perferneces;
	}
	public void setPerferneces(Preferences perferneces) {
		this.perferneces = perferneces;
	}
	public NoteSummary getMessageSummary() {
		return messageSummary;
	}
	public void setMessageSummary(NoteSummary messageSummary) {
		this.messageSummary = messageSummary;
	}
	public Distributor getWellnessCoordinator() {
		return wellnessCoordinator;
	}
	public void setWellnessCoordinator(Distributor wellnessCoordinator) {
		this.wellnessCoordinator = wellnessCoordinator;
	}
    
    
}

class NoteSummary {
	private NoteTypeSummary account;
	private NoteTypeSummary order;

	public NoteTypeSummary getAccount() {
		return account;
	}

	public void setAccount(NoteTypeSummary account) {
		this.account = account;
	}

	public NoteTypeSummary getOrder() {
		return order;
	}

	public void setOrder(NoteTypeSummary order) {
		this.order = order;
	}

}

class NoteTypeSummary {

	private long totalCount;
	private long unreadCount;

	public NoteTypeSummary() {
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getUnreadCount() {
		return unreadCount;
	}

	public void setUnreadCount(long unreadCount) {
		this.unreadCount = unreadCount;
	}

}