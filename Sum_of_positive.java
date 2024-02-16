import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int size;
      size = s.nextInt();
      int[] arr = new int[size];
      int ans  = 0;
      for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
            int sq = (int)Math.sqrt(arr[i]);
            if(arr[i] == sq*sq){
              ans += arr[i];
            }
        }
      System.out.print(ans);
    }
  }