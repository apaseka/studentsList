package org.itstep.model;
import java.util.Date;

public class Student {

	public String firstName;
	public String secondName;
	private long dateOfBirthInMills;
	private Date dateOfBirth;
	private String login;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Date getDateOfBirth() {
		return (Date) dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getDateOfBirthInMills() {
		return dateOfBirthInMills;
	}
	public void setDateOfBirthInMills(long dateOfBirthInMills) {
		this.dateOfBirthInMills = dateOfBirthInMills;
	}
	public Student(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}	
	public Student() {
	}	
	public Student(String firstName, String secondName, long dateOfBirthInMills,
					String login, String password) {
	this.firstName = firstName;
	this.secondName = secondName;
	this.dateOfBirthInMills = dateOfBirthInMills;
	this.login = login;
	this.password = password;	
	}
	public Student(String firstName, String secondName, long dateOfBirthInMills,
			String login, String password, Date dateOfBirth) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirthInMills = dateOfBirthInMills;
		this.dateOfBirth = dateOfBirth;
		this.login = login;
		this.password = password;	
	}
	public static void printStudent() {
		System.out.println("Hi! I'm student!");
		}
	
	public String toString() {
		return firstName+", "+secondName+", "+dateOfBirth+", "+dateOfBirthInMills;
	}
	}
		
	