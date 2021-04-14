package day12.pkg;

public class Cal {

	int num1;
	int num2;
	
	// 기본생성자
	Cal(){
		
	}
	// 메소드를 정의할 때
	// 리턴타입 , 메소드이름 , 매개변수유무 , 실행내용(리턴유무)체크
	void sum1(int num1 , int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}
	
	int sum2(int num1 , int num2) {
		int sum = num1 + num2;
		return sum;
		
	}
	
	
	
}
