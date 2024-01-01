import java.util.*;
public class Main{
  static void insert(int a[], int n){
    int key,i = 0,j;
    for(j=0;j<n;j++){
      key = a[j];
      i = j-1;
      while(i>=0 && a[i]>key){
        a[i+1] = a[i];
        i--;
      }
      a[i+1] = key;
    }
    for(int k : a){
      System.out.print(k+" ");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,i,a[];
    n = sc.nextInt();
    a = new int[n];
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
      //System.out.print(a[i]);
    }
    insert(a,n);
  }
}