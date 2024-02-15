import java.util.*;
class BMI{
  double b;
  void bmi(int n,float m){
    b = n/(m*m);
  }
}
class G extends BMI{
  void print(){
    if(b < 18.5)
      System.out.println("U");
    else if(18.5 <= b && b <= 25.0)
      System.out.println("N");
    else if(25.0 <= b && b<= 30.0)
      System.out.println("H");
    else
      System.out.println("O");
}
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float h;
    int w;
    w = sc.nextInt();
    h = sc.nextFloat();
    G b = new G();
    b.bmi(w,h);
    b.print();
  }
}