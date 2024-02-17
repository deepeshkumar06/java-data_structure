import java.util.*;
class Alphabets{
  Alphabets(char a){
    if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
      System.out.println(a+" :vowel");
    else
      System.out.println(a+" :consonant");
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char l = sc.next().charAt(0);
    Alphabets a = new Alphabets(l);
  }
}