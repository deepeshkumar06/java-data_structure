class A{
    void f1(int a){
        System.out.println("parent"+a);
    }
}
class B extends A{
    void f1(int a){
        System.out.println("child"+a);
    }
}
public class Main
{
	public static void main(String[] args) {
		B b = new B();
		b.f1(3);
	}
}
