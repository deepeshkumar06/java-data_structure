import java.util.*;
public class Main{
  static void quicksort(int a[],int st,int end){
    if(st < end){
      int pi = partition(a,st,end);
      quicksort(a,st,pi-1);
      quicksort(a,pi+1,end);
    }
  }
  static int partition(int a[],int st,int end){
    int pivot = a[end];
    int pi = st-1;
    for(int i=st;i<end;i++){
      if(a[i] < pivot){
        ++pi;
        int t = a[i];
        a[i] = a[pi];
        a[pi] = t;
      }
    }
    ++pi;
    int t = a[pi];
    a[pi] = a[end];
    a[end] = t;
    return pi;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[],i;
    a = new int[n];
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int st = 0, end = a.length-1;
    quicksort(a,st,end);
    for(int l=0;l<n;l++){
    System.out.print(a[l]+" ");
  }}
}