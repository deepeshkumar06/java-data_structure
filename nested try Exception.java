
public class HelloWorld
{
	public static void main(String[] args) {
    try{
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch(Exception e){
            int b[] = new int[5];
            b[7] = 10;
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
	}
}
