import java.util.Scanner;

public class array_insertion {
    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++)
            a[i] = s.nextInt();
        int pos = s.nextInt();
        int in = s.nextInt();
        for(int i = 0 ;i<num;i++)
        {
            if(i==pos-1)
                System.out.print(in+" ");
            System.out.print(a[i]+" ");
        }

        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++)
            a[i] = s.nextInt();
        int pos = s.nextInt();
        int ele = s.nextInt();
        for(int i=0;i<size;i++)
         {
             if(pos-1==i){
                System.out.print(ele+" ");
                
            System.out.print(a[i]+" ");
         }  

    }
}
