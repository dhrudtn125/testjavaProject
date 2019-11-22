package project_java_db;

public class FoodDTO {
	private String userid;
	private String name;
	private String pwd;
	@Override
	public String toString() {
		return "FoodDTO [userid=" + userid + ", name=" + name + ", pwd=" + pwd + "]";
	}
	public FoodDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public FoodDTO(String userid, String name, String pwd) {
		super();
		this.userid = userid;
		this.name = name;
		this.pwd = pwd;
	}
	
	
}
