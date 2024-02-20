import java.util.*;
abstract class AbstractClass{
  abstract void setdata(int n);
  abstract void getdata(int n);
}
class Child extends AbstractClass{
  int n;
  public void setdata(int n){
    this.n = n;
  }
  public void getdata(int n){
    int temp = 1,sum = 0;
    while(temp <= n){
      if(n%temp == 0){
        sum += temp;
      }
      temp+=1;
    }
    System.out.println(sum);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Child c = new Child();
    c.setdata(n);
    c.getdata(n);
  }
}