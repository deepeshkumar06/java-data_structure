class A{
    final int pid = 101;
    final void f1(int n){
        System.out.println("hello"+n);
    }
}
public class Main
{
	public static void main(String[] args) {
		A b = new A();
		b.f1(b.pid);
	}
}
