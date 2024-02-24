import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root;
    BST(){
        this.root = null;
    }
    void insert(int data){
        Node newnode = new Node(data);
        if(root == null){
            root = newnode;
        }
        else{
            Node temp = root;
            while(true){
                if(newnode.data < temp.data){
                    if(temp.left == null){
                        temp.left = newnode;
                        break;
                    }
                    else
                        temp = temp.left;
                }
                else{
                    if(temp.right == null){
                        temp.right = newnode;
                        break;
                   }
                  else
                      temp = temp.right;
            }
        }
    }
    }
  void max(){
    System.out.print("Maximum element is ");
	  while(true){
        if(root.right == null){
          System.out.print(root.data);
          break;
        }
        root = root.right;
      }
  }
}
public class Main
{
	public static void main(String[] args) {
		BST tree = new BST();
		int n = 0;
 Scanner sc = new Scanner(System.in);
        while(true){
          n = sc.nextInt();
          if(n<0)
            break;
          tree.insert(n);
        }
      tree.max();
      
    }
}