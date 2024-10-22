import java.util.*;
public class LunchAl {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1);
		
		System.out.println("************");
		ArrayList al2 = new ArrayList();
		al2.add("shsud");
		al2.add(9027);
		al2.add("sdgshd");
		System.out.println(al2);
		System.out.println("********");
		ArrayList al3 = new ArrayList();
		al3.add(1);
		al3.add(4);
		al3.add(8);
		System.out.println(al3);
		System.out.println("********");
		al3.add(al2);
		
		System.out.println(al3);
		System.out.println("********");
		al3.add(2,"pw");
		System.out.println(al3);

	}

}
