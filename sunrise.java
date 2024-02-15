import java.util.*;
class Sunrise{
  String name;
  double deposit;
  double costPerDay;
  public void setDeposit(double deposit)
  { 
    this.deposit=deposit; 
  }
  public void cost(double costPerDay)
  {
    this.costPerDay=costPerDay; 
  }
  void print(){
    System.out.println("Name : "+this.name);
    System.out.println("Deposit Amount : "+this.deposit);
    System.out.println("Cost per day : "+this.costPerDay);
  }
} 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name;
    double deposit,costPerDay;
    name = sc.nextLine();
    deposit = sc.nextDouble();
    costPerDay = sc.nextDouble();
    Sunrise s = new Sunrise();
    s.name = name;
    s.setDeposit(deposit);
    s.cost(costPerDay);
    s.print();
  }
}