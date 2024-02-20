import java.util.*;
class Vehicle{
  void move(String name){
    System.out.println(name);
  }
}
class Motorbike extends Vehicle{
  void move(String name){
    System.out.println(name);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a,b;
    a = sc.nextLine();
    b = sc.next();
    Motorbike m = new Motorbike();
    m.move(b);
    m.move(a);
  }
}