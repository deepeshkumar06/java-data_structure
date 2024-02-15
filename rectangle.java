import java.util.*;
class Rectangle{
  int area,peri;
  Rectangle(int w,int h){
    this.area = w*h;
    this.peri = 2*(w+h);
  }
    void print(){
    System.out.println("---------------------------------");
    System.out.printf("The area of the rectangle is %d.0\n",this.area);
    System.out.printf("The perimeter of the rectangle is %d.0\n",this.peri);
    }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int width,height;
    int n;
    n = sc.nextInt();
    Rectangle r[] = new Rectangle[n];
    for(int i=0;i<n;i++){
      width = sc.nextInt();
      height = sc.nextInt();
      r[i] = new Rectangle(width,height);
      r[i].print();
    }
  }
}