import java.util.*;
class Bicycle{
  int gear,speed,height;
}
class MountainBike extends Bicycle{
  MountainBike(int g,int s,int h){
    super.gear = g;
    super.speed = s;
    super.height = h;
  }
  public String toString(){
    return "No of gears are "+gear+"\nspeed of bicycle is "+speed+"\nseat height is "+height;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int gear,speed,height;
    gear = sc.nextInt();
    speed = sc.nextInt();
    height = sc.nextInt();
    MountainBike m = new MountainBike(gear,speed,height);
    System.out.print(m);
  }
}