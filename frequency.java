import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,i,sum = 0;
    n = sc.nextInt();
    String s = "";
    ArrayList<String> arr = new ArrayList<String>();
    for(i=0;i<n;i++){
      s = sc.next();
      arr.add(s);
    }
    String search = sc.next();
    System.out.println(Collections.frequency(arr,search));
  }
}