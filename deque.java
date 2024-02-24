import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Deque s = new ArrayDeque();
        s.addLast(10);
        s.addFirst(0);
        s.addLast(20);
        System.out.println(s);
        s.removeFirst();
        s.removeLast();
        System.out.println(s);
	}
}
