import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push("hi");
        s.push("uss");
        System.out.println(s);
        s.pop();
        System.out.println(s);
	}
}
