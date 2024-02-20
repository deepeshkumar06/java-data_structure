import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        LinkedList l = new LinkedList();
        l.add(4);
        l.add(5);
        l.add(6);
        l.addAll(a);
        System.out.println(l);
    }
}