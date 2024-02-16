import java.util.*;
class Person{
  protected String firstName;
  String lastName;
  int id,a[],avg,n,sum;
  char g;
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = identification;
  }
  void setdata(int a[],int n){
    this.a = a;
    this.n = n;
  }
  String getdata(){
    return firstName;
  }
  void print(){
    for(int i=0;i<n;i++){
    this.sum += a[i];
    }
    avg = sum/n;
    if(avg>=90 && avg<=100)
      g = 'O';
    else if(avg>=80 && avg<90)
      g = 'E';
    else if(avg>=70 && avg<80)
      g = 'A';
    else if(avg>=55 && avg<70)
      g = 'P';
    else if(avg>=40 && avg<55)
      g = 'D';
    else 
      g = 'T';
    System.out.println("Name: "+lastName+" "+getdata());
}