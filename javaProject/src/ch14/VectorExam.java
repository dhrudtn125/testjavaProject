package ch14;

import java.util.Vector;

public class VectorExam {
//컬랙션 - 배열의 단점을 보완한 클래스
	//배열의 단점 -사이즈조절이 안됨,삽입,삭제가 어려움,다양한 자료형을 저장할수 없음
	//컬랙션 Map걔열 -순서는 제공되지 않지만 키가 제공됨 인덱스가 없고 키로 조회
	//List계열 - 순서대로 저장 ,키가 없음(인덱스로 조회)
	//Vector대신 요즘 ArrayList를 많이 씀
	public static void main(String[] args) {
		Vector<Object> v = new Vector();//<Object> 없이도 오류는 안나지만 이렇게 처리하는게 좋음
		//모든 자료형 저장가능 
		//사이즈가 자동으로 늘어남 
		System.out.println("초기사이즈: "+v.capacity());
		//벡터는 기본적으로 10개의 사이즈를 만들어 놓는다.
		//그 길이값을 알아보고 싶을땐 capacity()를 활용한다.
		v.add("first");
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		
		System.out.println("중간 사이즈: "+v.capacity());
		//데이터 벡터가 만들어놓은 초기 10개의 사이즈가 넘어가면 
		//또 10개의 사이즈를 추가로 만든다.
		
		System.out.println("데이터의 갯수: "+v.size());
		//벡터.size() 벡터요소의 실제 데이터갯수를 알 수 있으며, 이는 배열의 length와 같다.
		
		System.out.println("초기데이터");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+"\t");//벡터에서는 배열[i]처럼 사용하면 안된다.
			
		}
		System.out.println();
		
		v.add(6, 102);  //벡터의 인덱스 6번에 데이터 추가
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();
		
		v.remove(6);
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
		}
		
	}
}
