import java.util.*;
public class Main
{
	public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    String o = "";
    while(!o.equals("-1")){
        o = sc.next();
        a.add(o);
    }
    String n = sc.next();
    for(int i=0;i<a.size();i++){
        if(a.get(i).equals(n)){
            a.remove(i);
        }
        System.out.println(a.get(i));
    }
	}
}