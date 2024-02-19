import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    multiplicationGame ob = new multiplicationGame();
    ob.setValue(n);
    ob.John();
  }
}

class multiplicationGame{
  int n,p=1,i=1;
  void setValue(int n){
    this.n=n;
    
  }
  public void John(){
    p=p*i;
    i++;
    if(p>=n){
      System.out.print(n+" John wins");
    
    }else{
      Michael();
    }
  }
  public void Michael(){
    p=p*i;
    i++;
    if(p>=n){
      System.out.print(n+" Michael wins");
    }else{
      John();
    }
  }
}