package Graph;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Graph graph = new Graph(7);
		graph.addEdge(1, 2, 10);
		graph.addEdge(1, 4, 20);
		graph.addEdge(2, 3, 30);
		graph.addEdge(3, 4, 50);
		graph.addEdge(4, 5, 6);
		graph.addEdge(5, 6, 8);
		graph.addEdge(5, 7, 9);
		graph.addEdge(6, 7, 5);
		
//		graph.display();
//		
//		graph.removeEdge(4, 5);
//		
//		graph.display();
//		
//		System.out.println(graph.noOfEdges());
//		
//		System.out.println(graph.containsEdge(3, 4));
//		
//		System.out.println(graph.hasPath(1, 6, new HashSet<>()));

		//graph.printAllPath(1, 6, new HashSet<>(), "1");
		System.out.println(graph.BFS(1, 6));
	}

}
