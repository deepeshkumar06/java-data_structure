import java.util.*;
public class Main
{
	public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        a.add(sc.next());
    }
    Iterator i = a.iterator();
    while(i.hasNext()){
        if(i.next().equals("adam")){
            i.remove();
            //break;
        }
        System.out.println(a);
    }
	}
}