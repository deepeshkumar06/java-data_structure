class A{
    int pid = 101;
}
class B extends A{
    int pid = 500;
    void print(){
        System.out.println(this.pid);
        System.out.println(super.pid);
    }
}
public class Main
{
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
