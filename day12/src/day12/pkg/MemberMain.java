package day12.pkg;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.id = "abc";
		m.password = "123abc";
		m.name = "손흥민";
		m.age = 20;
		
		m.info();		
		m.update("박지성");
				
		String name2 = m.myName();
		System.out.println(name2);
//		sysout(m.myName()); 가능
		
		Member m3 = new Member("tnuren" , "abc" ,
								"배준호" , 26);
		m3.info();
		m3.update("배준호호");
		
		String name3 = m3.myName();
		System.out.println(name3);
		
																		
	}

}
