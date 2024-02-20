import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(3);
		a.add(4.8);
		a.add("hello");
		for(Object j : a){
		    System.out.println(j);
		}
	}
}
