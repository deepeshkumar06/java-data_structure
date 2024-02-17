class Printer{
    void printdoc(int p,String s){
        for(int i=0;i<=p;i++){
            System.out.println("Printing "+i+" page for "+s);
        }
    }
}
class Mathsthread extends Thread{
    Printer p;
    Mathsthread(Printer p){
        this.p = p;
    }
    public void run(){
        this.p.printdoc(5,"Maths");
    }
}
class Sciencethread extends Thread{
    Printer p;
    Sciencethread(Printer p){
        this.p = p;
    }
    public void run(){
        this.p.printdoc(7,"Science");
    }
}
public class Main{
    public static void main(String[] args){
        Printer p = new Printer();
        Mathsthread m = new Mathsthread(p);
        Sciencethread s = new Sciencethread(p);
        m.start();
        s.start();
    }
}