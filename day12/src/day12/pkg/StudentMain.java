package day12.pkg;

public class StudentMain {

	public static void main(String[] args) {
		// 기본생성자를 이용한 객체선언
		
		Student s1 = new Student();
		
		s1.name = "학생1";
		s1.stuNum = 111111;
		System.out.println(s1.name);
		System.out.println(s1.stuNum);
		
		// 매개변수가 있는 생성자를 이용한 객체선언
		Student s2 = new Student("학생2" , 222222);
		System.out.println(s2.name);
		System.out.println(s2.stuNum);

		// 박지성 > 매개변수가 있는 생성자 String name >
		// = 뒤 name > this.name 적용
		
	}

}
