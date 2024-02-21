class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head;
    Linkedlist(){
        this.head = null;
    }
    void addfirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.addfirst(30);
		l.addfirst(50);
		l.addfirst(60);
		l.print();
	}
}
