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
		
		System.out.println("메소드 호출전");
		
		// fieldPrint 메소드 호출
		s1.fieldPrint();
		
		System.out.println("메소드 호출끝");
		
		s2.fieldPrint();
		
		Student s3 = new Student("학생3" , 333333);
		s3.fieldPrint();
		
		System.out.println("리턴있는 메소드 호출");
		// 리턴이 있는 메소드를 호출할 때는 호출만하고
		// 끝나는 것이 아니라 리턴값을 활용하는 내용이 필요.
		
		s1.numberMethod(); // 이 문장만 있으면 이문장이 
							//10이 되는거다.
		
		int aa = 0;
		System.out.println(aa); // 메소드 호출전
		aa = s1.numberMethod();
		System.out.println(aa); // 메소드 호출후
		
		System.out.println(s2.numberMethod());
		
		
		
		
		
		
		
	}

}
