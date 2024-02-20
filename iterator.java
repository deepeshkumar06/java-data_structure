import java.util.*;
public class Main
{
	public static void main(String[] args) {
    ArrayList a = new ArrayList();
    a.add(3);
    a.add(4);
    a.add(5);
    Iterator i = a.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
	}
}