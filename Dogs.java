import java.util.*;
class Dog{
  String name,breed;
  Dog(String breed){
    this.breed = breed;
  }
  public void setName(String name) 
  {
    this.name = name;
  }
  public String getBreed() 
  {
    return breed; 
  }
  public String getName() 
  {
    return name;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    String name,breed;
    n = sc.nextInt();
    Dog d[] = new Dog[n];
    for(int i=0;i<n;i++){
      name = sc.next();
      breed = sc.next();
      d[i] = new Dog(breed);
      d[i].setName(name);
      if(breed.equals("Labrador"))
        System.out.println(d[i].getName()+" is a "+d[i].getBreed()+" which is arrogant");
      else
        System.out.println(d[i].getName()+" is a "+d[i].getBreed()+" which is nice");
    }
}