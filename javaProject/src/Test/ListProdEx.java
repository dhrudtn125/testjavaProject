package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	static void print(Map map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		for(ProdEx p : list2) {
			System.out.println(p.getName()+"\t"+p.getNum()+"\t"+p.getComp()+"\t"+p.getPrice()
			+"\t"+p.getAmount()+"\t"+p.getMoney());
		}
	}
	
	public static void main(String[] args) {
		Map<String,Object> map =  new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
	    
		list.add(new ProdEx("OLEDTV", "lg01tv", "LG", 300, 10));
		list.add(new ProdEx("냉장고", "sm02re", "삼성", 200, 5));
		list.add(new ProdEx("에어콘", "win03", "위니아", 100, 8));
		list.add(new ProdEx("컴퓨터", "asus1", "아수스", 200, 6));
		
		map.put("list", list);
		System.out.println("============================================");
		System.out.println("                                    (단위:만원)");
		System.out.println("상품명\t제품번호\t제조회사\t단가\t수량\t가격");
		System.out.println("--------------------------------------------");
		print(map);
		System.out.println("============================================");
	}

}
