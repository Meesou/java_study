package mvc.model.vo;

public class Member0701 {

	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	public Member0701() {
		// TODO Auto-generated constructor stub
	}

	public Member0701(String userId, String userPwd, String name, int age, char gender, String email) {
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member0701 [userId=" + userId + ", userPwd=" + userPwd + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", email=" + email + "]";
	}
	
}
