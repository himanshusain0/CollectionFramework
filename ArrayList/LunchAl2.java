import java.util.*;

public class LunchAl2 {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList();
        al1.add(100);
        al1.add(2000);
        al1.add(300);
        System.out.println(al1.contains(300));
        int index = al1.indexOf(2000);
        System.out.println(index);
    }
}
