public class Main
{
    static void f1() throws Exception{
        int a = 10/0;
    }
	public static void main(String[] args) {
    try{
        f1();
    }
    catch(Exception e){
        System.out.println(e);
    }
	}
}
