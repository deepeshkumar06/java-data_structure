class Parent{
    private int a;
    void setdata(int a){
        this.a = a;
        getdata();
    }
    void getdata(){
        System.out.println(a);
    }
}
public class Main
{
	public static void main(String[] args) {
    Parent c = new Parent();
    c.setdata(1);
	}
}