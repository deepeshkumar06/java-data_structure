class Parent{
    int a;
    static void f1(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    static void f1(){
       // System.out.println("Hello");
    }
}
public class Main
{
	public static void main(String[] args) {
    Child c = new Child();
    c.f1();
	}
}
