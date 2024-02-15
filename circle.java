import java.util.*;
class Circle{
    double area,cir;
    int r;
    Circle(int r){
      this.area = Math.PI*(r*r);
      this.cir = (2*(Math.PI*r));
      this.r = r;
    }
    void print(){
      System.out.println("Radius of the circle is "+this.r);
      System.out.println("The area of the circle is "+this.area);
      System.out.println("The circumference of the circle is "+this.cir);
    }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r;
    Circle c[] = new Circle[n];
    for(int i=0;i<n;i++){
      r = sc.nextInt();
      c[i] = new Circle(r);
      c[i].print();
    }
  }
}