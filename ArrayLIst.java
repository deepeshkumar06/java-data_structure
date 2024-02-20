import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,i=0;
    String a = "";
    n = sc.nextInt();
    ArrayList<String> arr = new ArrayList<String>();
    Iterator itr = arr.iterator();
    while(i<=n){
      a = sc.nextLine();
      arr.add(a);
      System.out.println(arr.get(i));
      i++;
    }
  }
}