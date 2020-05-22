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


  private void removePos(int pos){
  		//get to the position, set the one before to the next one.
      Node curr = head;
  		Node prev = null;
  		while(pos> 0){
  			
  			if(pos == 1){
  				prev = curr;
  			}
  			curr = curr.next;
  			pos --; 
  		}
  		prev.next = curr.next;
  		curr = null;
  		size --;
  }
  // Iterator such as contains and such


  public static void main(String[] args){

    //strengths of LinkedList are fast insertion. 

  	LinkedList begin = new LinkedList();

  	begin.add(4);
  	begin.add(5);
  	begin.add(6);
  	begin.addToHead(1);
  	begin.addAtPosition(2,2);
  	begin.add(8);
  	begin.removePos(2);
  	//1,4,5,2,6,8
  	Node curr = begin.head;

  	for(int i = 0; i < begin.size; i++){
  		System.out.println(curr.val);
  		curr = curr.next;
  	}
    
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