package day12.pkg;

public class Member {

	String id;
	String password;
	String name;
	int age;
	// 기본생성자
	Member(){
		
	}
	// 매개변수 생성자
	Member(String id , String password ,String name , int age){
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(age);
	}
	
	void update(String name) {
		this.name = name;
		System.out.println(this.name);
	}

	String myName() {
		return name;
	}
	
}
