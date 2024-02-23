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
	//INorder
    void displayinorder(){
        displayrec(root);
    }
    void displayrec(Node root){
        if(root == null)
            return;
        else{
            displayrec(root.left);
            System.out.println(root.data);
            displayrec(root.right);
        }
    }
	//Preorder
    void displaypreorder(){
        displayrec1(root);
    }
    void displayrec1(Node root){
        if(root == null)
            return;
        else{
            System.out.println(root.data);
            displayrec(root.left);
            displayrec(root.right);
        }
    }
	//postorder
    void displaypostorder(){
        displayrec2(root);
    }
    void displayrec2(Node root){
        if(root == null)
            return;
        else{
            displayrec(root.left);
            displayrec(root.right);
            System.out.println(root.data);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(03);
		tree.insert(20);
		tree.displayinorder();
		System.out.println();
		tree.displaypreorder();
		System.out.println();
		tree.displaypostorder();
	}
}