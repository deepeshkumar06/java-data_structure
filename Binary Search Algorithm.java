import java.util.*;
public class Main{
  static int element(int a[],int low,int high,int key){
      if(low <= high){
        int mid = (low+high)/2;
        if(key == a[mid]){
          return mid;
        }
        else if(key < a[mid]){
          return element(a,low,mid-1,key);
        }
        else
           return element(a,mid+1,high,key);
       }
    return -1;
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,a[],e,i = 0;
    n = sc.nextInt();
    a = new int[n];
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    e = sc.nextInt();
    int low = 0,high = n-1;
    int ans = element(a,low,high,e);
    System.out.print(ans);
  }
}