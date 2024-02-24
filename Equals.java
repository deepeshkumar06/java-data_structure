import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    int n = sc.nextInt();
     Set s = new TreeSet();
     for(int i=0;i<n;i++){
       int b = sc.nextInt();
       s.add(b);
     }
    Set s1 = new TreeSet();
    for(int i=0;i<n;i++){
      int b = sc.nextInt();
      s1.add(b);
    }
    if(s.equals(s1))
      System.out.println("Both sets are same");
    else
      System.out.println("Both sets are different");
  }
}
