import java.util.*;
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
    int  cal(){
      return calsum(this.root);
    }
  int calsum(Node root){
    if(root == null)
      return 0;
    if(root.left == null && root.right == null)
      return root.data;

      return calsum(root.left) + calsum(root.right);
  }
}
public class Main
{
	public static void main(String[] args) {
		BST tree = new BST();
      Scanner sc = new Scanner(System.in);
		while(true){
          int n = sc.nextInt();
          if(n<1)
            break;
          tree.insert(n);
        }
      int sum = tree.cal();
      System.out.print(sum);
	}
}