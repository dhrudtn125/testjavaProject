package ch050;

public class Array3Dim {

	public static void main(String[] args) {
		String[][][] subject = {{{"JS01","AL02","PY03","DS04"}  //과목코드
		,{"JSP","알고리즘","파이썬","자료구조"}  //과목명
		,{"이길동","김길동","박길동","홍길동"}  //지도교수
		,{"CS01","CS02","CS03","CS04"}  //과목코드
		,{"생활영어","경제학","생활체육","스포츠"}  //과목명
		,{"구길동","성길동","최길동","황길동"}}};  //지도교수
		
		//subject[0][0][0]=JSP01.....
		
		for(int i=0;i<subject.length;i++) {
			for(int j=0; j<subject[i].length;j++) {
				for(int k=0;k<subject[i][j].length;k++) {
					System.out.println("["+i+"]{"+j+"]{"+k+"] : "+subject[i][j][k]);
				}  //end 2inner for
				System.out.println("=============================================");
			}  //end 1inner for
		}
		
	}
	


	}

