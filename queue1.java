import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Queue s = new LinkedList();
        s.add("hi");
        s.add("Im parker");
        s.add(35);
        System.out.println(s);
        System.out.println(s.poll());
        System.out.println(s.peek());
        System.out.println(s);
	}
}
