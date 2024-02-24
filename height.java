class BST{
  Node root;
  BST(){
    this.root = null;
  }
  void insert(int data){
    Node NewNode = new Node(data);
    if(root == null){
      root = NewNode;
    }else{
      Node temp = root;
      while(true){
        if(NewNode.data<temp.data){
          if(temp.left==null){
            temp.left = NewNode;
            break;
          }else{
            temp = temp.left;
          }
        }else if(NewNode.data>temp.data){
          if(temp.right == null){
            temp.right = NewNode;
            break;
          }else{
            temp = temp.right;
          }
        }
      }
    }
    
  }
  void height(){
    int count = 0;
    int count2 = 0;
    while(root.right!=null){
      root = root.right;
      count++;
    }
    while(root.left!=null){
      root = root.left;
      count2++;
    }
    if(count<count2){
      System.out.print(count2);
    }else{
      System.out.print(count);
    }
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
      tree.height();
      
    }
}
