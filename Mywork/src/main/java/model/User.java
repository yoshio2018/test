package model;

public class User {
	private int userId;
	private String name;
	private String pass;
	private String mail;
	private int leaveFlag;
	
	public User(int userId, String name, String pass, String mail, int leaveFlag) {
		super();
		this.userId = userId;
		this.name = name;
		this.pass = pass;
		this.mail = mail;
		this.leaveFlag = leaveFlag;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getLeaveFlag() {
		return leaveFlag;
	}
	
}
