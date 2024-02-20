import java.util.*;
class F{
  void sum(int a,int b){
    System.out.println(a+b);
  }
  void sum(int a,int b,int c){
    System.out.println(a*b*c);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    F f = new F();
    if(t == 2){
      int a = sc.nextInt();
      int b = sc.nextInt();
      f.sum(a,b);
    }
    else if(t == 3){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      f.sum(a,b,c);
    }
    else
      System.out.println("WRONG INPUT");
  }
}