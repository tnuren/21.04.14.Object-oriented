package day12.pkg;

public class Student {
	// 필드 생성
	String name;
	int stuNum;
	
	// 생성자를 아무것도 쓰지않으면 기본생성자를 쓸 수 있지만.
	// 기본생성자 형태가 아닌 생성자를 정의하면 기본생성자를 쓸 수 없음.
	// 기본생성자를 쓰고 싶다면 따로 정의를 해줘야 함.
	
	// 기본생성자 선언
	Student(){
		System.out.println("기본생성자 호출");
	}
	
	// 매개변수가 있는 생성자 선언
	Student(String name , int stuNum){
		System.out.println("매개변수 있는 생성자 호출");
		this.name = name;
		this.stuNum = stuNum;
	}
	
	// 메소드(함수) 선언
	// 리턴이 없는 메소드 선언
	/*
	 * void : 리턴이 없다는 의미
	 * 메소드이름 : fieldPrint ( 메소드 이름은 자유 )
	 * 매개변수 : 없음.
	 */
	void fieldPrint() {
		System.out.println("메소드 호출됨");
		System.out.println(this.name);
		System.out.println(this.stuNum);
	}
	
	// 리턴이 있는 메소드 선언
	/*
	 * int : 리턴되는 값이 int
	 * 메소드이름 : numberMethod
	 * 매개변수 : 없음
	 */
	int numberMethod() {
		int num = 10; // 정수형변수
		return num; // num 변수가 가진 값을 리턴해줌
	}
	
	 /* String : 리턴되는 값이 String
	 * 메소드이름 : stringMethod
	 * 매개변수 : 없음
	 */ 
	String stringMethod() {
		String val = "리턴값";
		return val;
	}
	
	// 매개변수가 있는 메소드
	int numberMethod2(int num1) {
		int num2 = 10;
		int sum = num1 + num2 ;
		return sum;
	}
	
	
	
	
	
}
