import java.util.ArrayList;
//change to generic types 
public class BinaryTree{
	Node root;
	int size = 1;

	BinaryTree(){}

	BinaryTree(int a){

		this.root = new Node(a);

	}


	public void addNode(int a, Node check){
		// First check right or left. 
		
		if(a > check.val){
			//if it's greater than the value then check the right subtree.
			if(check.right == null){
				check.right = new Node(a);
				size++;
			}
			else{
				addNode(a,check.right);
			}

		}
		else{
			if(check.left == null){
				check.left = new Node(a);
				size++;
			}
			else{
				addNode(a,check.left);
			}

		}
	}

	public void remove(int a){
		size--;

		removeRecursively(a, root);

		// what to do with removal. 
		// how to remove??
		// get the inorder successor 
		// if it's a child node then can just set to null
		// if it has one child then you can just set that val to what it is then delete the child
		// if 2 children then you have to get inorder successor. delete that one and replace

	}

	public void removeRecursively(int val, Node deleted){
		if (deleted == null){
			return;
		}
		else if(val < deleted.val){
			removeRecursively(val,deleted.left);
		}
		else if(val > deleted.val){
			removeRecursively(val,deleted.right);
		}
		else if(val == deleted.val){
			
			if(deleted.left == null && deleted.right == null){
				//this is if it's a child.
				deleted = null;

			}

			// one child
			else if(deleted.left == null && deleted.right!=null){
				deleted.val = deleted.right.val;
				deleted.right = null;
			}
			else if(deleted.right == null && deleted.left!=null){
				deleted.val = deleted.left.val;
				deleted.left = null;
			}

			else{
				//2 children you have to get inorder sucessor which means that you have to do an inorder traversal.
				//most left of the right subtree.
				//if there's no right subtree, then the ancestor
				ArrayList<Integer> storage = new ArrayList<Integer>();

				storage = InOrderSuccessor(root,storage);
				for(int i = 0;i<size;i++){

					if(storage.get(i).equals(val)){
						removeRecursively(storage.get(i+1),root);
						deleted.val = storage.get(i+1);
						// remove(storage.get(i+1),r);
						
						
					}
				}


			}


		}
		else{
			System.out.println("Not in tree");
		}

	}

	public ArrayList<Integer> InOrderSuccessor(Node a, ArrayList<Integer> storage){
		if(a == null){
			return null;
		}
		InOrderSuccessor(a.left,storage);
		storage.add(a.val);
		InOrderSuccessor(a.right,storage);

		return storage;
		
	}


	public String InOrder(){
		return "";
	}

	public String PostOrder(){
		return "";
	}

	public String PreOrder(){
		return "";
	}




	public static void main(String[] args){

		//what does a BT have. Left, Right, val. 
		//Implement add, delete 
		// going to implement a binary search tree to make it more practical, (easier on adding?)

		BinaryTree a = new BinaryTree(10);
		a.addNode(5, a.root);
		a.addNode(15,a.root);
		a.addNode(20,a.root);
		a.addNode(12,a.root);
		a.addNode(8,a.root);
		a.addNode(2,a.root);
		a.remove(10);
		
    
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
