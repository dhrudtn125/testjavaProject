package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set은 중복값을 허용하지 않는다.
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");  //중복값은 입력되지 않는다.
		System.out.println(hs);  //순서대로 저장되어지지 않는다.
		for(String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {  //다음요소가 있으면 true
			System.out.println(it.next());  //다음요소를 꺼냄
		}
	}

}
