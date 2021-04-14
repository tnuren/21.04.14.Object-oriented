package day12.pkg;

public class CalMain {

	public static void main(String[] args) {
		
		// 리턴이 없는 메소드		
		Cal c1 = new Cal();
		c1.sum1(10, 20);
		
		// 리턴이 있는 메소드
		Cal c2 = new Cal();
	    int number = c2.sum2(10, 20);  		
		System.out.println(number);
		
		
		
		
	}

}
