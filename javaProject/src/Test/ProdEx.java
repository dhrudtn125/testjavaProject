package Test;

public class ProdEx {
	private String name;
	private String num;
	private String comp;
	private int price;
	private int amount;
	private int money;
	public ProdEx(String name, String num, String comp, int price, int amount) {
		super();
		this.name = name;
		this.num = num;
		this.comp = comp;
		this.price = price;
		this.amount = amount;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money=price*amount;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
