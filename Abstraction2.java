import java.util.*;
abstract class A{
  abstract void calculation(int m1,int m2,int m3);
  abstract void calculation(int m1,int m2,int m3,int m4);
}
class B extends A{
  int marks1,marks2,marks3;
  public void calculation(int m1,int m2,int m3){
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
    float avg = (float)(m1+m2+m3)/3;
    System.out.printf("%.2f\n",avg);
  }
  public void calculation(int m1,int m2,int m3,int m4){
    float avg = (float)(m1+m2+m3+m4)/4;
    System.out.printf("%.2f",avg);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m1,m2,m3,m4,m5,m6,m7;
    B b = new B();
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();
    m4 = sc.nextInt();
    m5 = sc.nextInt();
    m6 = sc.nextInt();
    m7 = sc.nextInt();
    b.calculation(m1,m2,m3);
    b.calculation(m4,m5,m6,m7);
  }
}