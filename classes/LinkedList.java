public class LinkedList {
   Node head;  // head of list 
   Node end;   // moving to current end
   int size = 0;

  private void add(int a){

  	Node added = new Node(a);

  	if(head==null){
  		head = added;
  		end = head;
  	}
  	else{

	  	end.next = added;
	  	end = end.next;
  	}
  	size++;

  }
  private void addToHead(int a){
  	
  	Node newHead = new Node(a);
  	
  	if(head==null){
  		head = newHead;
  		end = head;
  	}

  	else{
  		newHead.next = head;
  		head = newHead;
  	}
  	size++;

  }

  private void addAtPosition(int a,int pos){
  	//start from head and move it there.
  	if(pos == 0){
  		addToHead(a);
  	}
  	else{
  		Node inserted = new Node(a);
  		Node curr = head;
  		while(pos>0){
  			
  			curr = curr.next;
  			pos--;
  		}
  		
  		inserted.next = curr.next;
  		curr.next = inserted;
  	}
  	size++;
  }


  public static void main(String[] args){

  	LinkedList begin = new LinkedList();

  	begin.add(4);
  	begin.add(5);
  	begin.add(6);
  	begin.addToHead(1);
  	begin.addAtPosition(2,2);
  	begin.add(8);
  	begin.addAtPosition(142,4);
  	//1,4,5,2,6,8

  	System.out.println(begin.head.next.next.next.next.next.val);
    
  }
  public class Node{
	int val;
	Node next;

	Node(){}

	Node(int a){
		this.val = a;
	}

	}
}