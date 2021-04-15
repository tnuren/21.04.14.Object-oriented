package day12.pkg;

public class Member {
	// 필드값
	String id;
	String password;
	String name;
	int age;
	// 기본생성자
	Member(){
		
	}
	// 매개변수 생성자
	Member(String id , String password ,
			String name , int age){
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
		// 필드 쓸때는 this 다 붙이기
	}
	
	void update(String name) {
		this.name = name;
		//System.out.println(this.name);
	}

	String myName() {
		return this.name;
	}
	
}
