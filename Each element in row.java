import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r,c,a[][],i,j;
    r = sc.nextInt();
    c = sc.nextInt();
    a = new int[r][c];
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j+=2){
        if(a[i][j] > a[i][j+1])
          System.out.println(a[i][j]+"\n");
        else if(a[i][j] < a[i][j+1])
          System.out.println(a[i][j+1]+"\n");
        else
          break;
      }
    }
  }
}