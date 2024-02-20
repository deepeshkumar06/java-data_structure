import java.util.*;
class Hello{
  void sayHello(){
    System.out.println("Hello");
  }
  void sayHello(String s){
    System.out.println("Hello "+s);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    Hello s = new Hello();
    s.sayHello();
    s.sayHello(str);
  }
}