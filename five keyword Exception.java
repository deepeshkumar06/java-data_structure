
public class Main
{
    static void f1() throws ArithmeticException{
        throw new ArithmeticException();
    }
	public static void main(String[] args) {
		try{
		    f1();
		}
		catch(ArithmeticException e){
		    System.out.println("There is error called : "+e);
		}
		finally{
		    System.out.println("The Executed successfully");
		}
	}
}
