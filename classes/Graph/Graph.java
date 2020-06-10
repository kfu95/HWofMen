import java.util.*;

public class Graph<T>{
	//UUID.
	int id = 0;

	// 
	List<Object> Vertices = new ArrayList<Object>();
	//instead of storing into a list.. why not store into a map??
	//what advantage does a list of vertixes have??
	// list is useful for keeping order
	// map takes more memory. 
	// put in id to show when it was added in?
	Map<Object,Object> VertexMap = new HashMap<Object, Object>();

	Graph(){}

	public void AddVertex(T data){
		Node added = new Node(id++,data);
		Vertices.add(added);
		VertexMap.put(added, id)
	}

	public void AddEdge(Node v1, Node v2){

	}

	public static void main(String[] args){

		Graph a = new Graph();
		a.AddVertex("65");
		a.AddVertex("45");
		a.AddVertex("69");
		Node second = (Node) a.Vertices.get(2);
		System.out.println( second.getID());
		
	}
	
}

class Node<T>{
		//everytime a node is created, add 1 to ID.
		int id;
		private T data;
		Map<Integer,Node> neighbors = new HashMap<Integer, Node>();

		Node(){}

		Node(int id,T data){
			this.data = data;
			this.id = id;
		}

		public T getData(){
			return this.data;
		}

		public int getID(){
			return this.id;
		}
		//and now I need something which is edges.

}