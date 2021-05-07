package Entities;

import java.util.Date;

public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private String nickName;
	private Date dateOfBirth;
	private String region;
	private String language;
	private String nationalityId;

	public User(int userId, String firstName, String lastName, String nickName, Date dateOfBirth, String region,
			String language, String nationalityId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.region = region;
		this.language = language;
	    this.nationalityId = nationalityId;

	}


		
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityID) {
		this.nationalityId = nationalityID;
	}





	
}
