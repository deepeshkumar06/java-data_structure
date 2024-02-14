class Parent{
    int a;
    static void f1(int a){
        System.out.println(a);
    }
    static void f1(int a,int b){
        System.out.println(a+b);
    }
}
public class Main
{
	public static void main(String[] args) {
    Parent c = new Parent();
    c.f1(1);
    c.f1(2,5);
	}
}