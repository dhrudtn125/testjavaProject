package project_java_db;

public class FoodDTO2 {
	
	private String foodname;
	private int price;
	private int kind;
	private int money;
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public FoodDTO2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FoodDTO2(String foodname, int price, int kind) {
		super();
		this.foodname = foodname;
		this.price = price;
		this.kind = kind;
		
	}
	@Override
	public String toString() {
		return "FoodDTO2 [foodname=" + foodname + ", price=" + price + "]";
	}
	public void setEditable(boolean b) {
		
		
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
