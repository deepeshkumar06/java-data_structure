class Mythread extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
public class Main
{
	public static void main(String[] args) {
		Mythread m = new Mythread();
		m.start();
	}
}
