public class BinaryTree{
	Node root;

	BinaryTree(){}

	BinaryTree(int a){

		this.root = new Node(a);

	}





	public static void main(String[] args){

		BinaryTree a = new BinaryTree(4);

  		System.out.println(a);
  		System.out.println("4");
    
  	}
	public class Node{
		int val;
		Node left;
		Node right;

		Node(){}

		Node(int a){
			this.val = a;
		}


	}

}
