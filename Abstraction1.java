import java.util.*;
abstract class Shape{
  abstract void rectangleArea(int l,int b);
  abstract void squareArea(int l);
  abstract void circleArea(int r);
}
class Area extends Shape{
  public void rectangleArea(int l,int b){
    System.out.printf("%.0f\n",(float)l*b);
  }
  public void squareArea(int l){
    System.out.printf("%.0f\n",(float)l*l);
  }
  public void circleArea(int r){
    System.out.printf("%.2f",(float)Math.PI*r*r);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l,b,s,r;
    l = sc.nextInt();
    b = sc.nextInt();
    s = sc.nextInt();
    r = sc.nextInt();
    Area a = new Area();
    a.rectangleArea(l,b);
    a.squareArea(s);
    a.circleArea(r);
  }
}