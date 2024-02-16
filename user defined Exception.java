
class UDException extends Throwable{
    String s;
    UDException(String s){
        this.s = s;
        
    }
    public String toString(){
        return "It shows : "+this.s;
    }
} 
public class Main
{
	public static void main(String[] args) {
    try{
        throw new UDException("It is Created by the User");
    }
    catch(UDException e){
        System.out.println(e);
    }
	}
}
