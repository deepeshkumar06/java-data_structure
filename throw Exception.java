
public class HelloWorld
{
	public static void main(String[] args) {
    try{
        throw new Exception("There is some error");
    }
    catch(Exception e){
        System.out.println(e);
    }
	}
}