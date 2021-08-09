package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
	public Graph(int V) {
		for(int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public boolean containsEdge(int v1, int v2) {
		
		return map.get(v1).containsKey(v2) || map.get(v2).containsKey(v1);
	}
	
	public int noOfEdges() {
		int ans = 0 ;
		for(int key : map.keySet()) {
			ans += map.get(key).size();
		}
		
		return ans / 2;

	}
	
	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}
	
	public void display() {
		for(int i = 1; i <= map.size();i++) {
			System.out.println(i + " -> " + map.get(i));
		}
	}

	public boolean hasPath(int src, int dst, Set<Integer> visited) {
		visited.add(src);
		
		if(src == dst)
			return true;
		
		for(int nbr : map.get(src).keySet()) {
			if(!visited.contains(nbr)) {
				boolean res = hasPath(nbr, dst,visited);
				if(res)
					return true;
			}
		}
		return false;
	}
	
	public void printAllPath(int src, int dst, Set<Integer> visited, String ans) {
		visited.add(src);
		
		if(src == dst) {
			System.out.println(ans);
			visited.remove(src);
			return;
		}
		
		for(int nbr : map.get(src).keySet()) {
			
			if(!visited.contains(nbr)) {
				
				printAllPath(nbr, dst,visited,ans + nbr);
				
			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int dst) {
		Set<Integer> visited = new HashSet<>();
		
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		while(!q.isEmpty()) {
			int rn = q.remove();
			if(visited.contains(rn))
				continue;
			visited.add(rn);
			if(rn == dst) {
				return true;
			}
			for(int nbr : map.get(rn).keySet()) {
				if(!visited.contains(nbr))
					q.add(nbr);
			}
		}
		return false;
	}
}
