package ch14;

public class Member {
	private String userid;
	private String password;
	private String name;
	private String tel;
	private String email;
	//setter,getter
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Member() {  //기본 생성자
		
	}
	
	public Member(String userid, String password, String name, String tel, String email) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", password=" + password + ", name=" + name + ", tel=" + tel + ", email="
				+ email + "]";
	}
	
	
	

}
