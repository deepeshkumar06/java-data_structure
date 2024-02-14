class Parent{
    private int a;
    void setdata(int a){
        this.a = a;
        System.out.println(getdata());
    }
    int  getdata(){
        return a;
    }
}
public class Main
{
	public static void main(String[] args) {
    Parent c = new Parent();
    c.setdata(1);
	}
}