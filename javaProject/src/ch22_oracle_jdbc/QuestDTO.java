package ch22_oracle_jdbc;

public class QuestDTO {
	private String userid;
	private String name;
	private String pwd;
	private int clear_num;
	
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
	
	public int getClear_num() {
		return clear_num+1;
	}
	public void setClear_num(int clear_num) {
		this.clear_num = clear_num;
	}
	public QuestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestDTO(String userid, String name, int clear_num) {
		super();
		this.userid = userid;
		this.name = name;
		this.clear_num = clear_num;
		
	}
	@Override
	public String toString() {
		return "QuestDTO [userid=" + userid + ", name=" + name + ", pwd=" + pwd + 
				 ", clear_num=" + clear_num + "]";
	}
	public QuestDTO(String userid, String name, String pwd) {
		super();
		this.userid = userid;
		this.name = name;
		this.pwd = pwd;
	}
	public QuestDTO(String userid, int clear_num) {
		super();
		this.userid = userid;
		this.clear_num = clear_num;
	} 
	
	
}
