class Mythread implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}
public class Main
{
	public static void main(String[] args) {
		Runnable m = new Mythread();
		Thread n = new Thread(m);
		n.start();
	}
}
