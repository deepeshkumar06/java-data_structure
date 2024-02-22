import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
    void addFirst(int data){
        Node NewNode=new Node(data);
        NewNode.next=head;
        head=NewNode;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void delatBeg(){
        if(head==null){
            System.out.print("lIST IS EMPTY");
        }
        else
        {
            head=head.next;
        }
    }
    void delatLast(){
        if(head==null){
            System.out.print("empty list");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
}
public class Main{
    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        
        l1.delatBeg();
        l1.delatLast();
        l1.print();
        
    }
}
