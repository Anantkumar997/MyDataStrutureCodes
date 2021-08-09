package GenricTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenricTree {
	Scanner scn = new Scanner(System.in);
	private class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	private Node root ;
	
	public GenricTree() {
		root = construct(null, -1);
	}
	
	private Node construct(Node parent,int ith) {
		if (parent == null) {
			System.out.println("Enter the data for root Node ? ");
		}else {
		System.out.println("Enter the data for " + ith + " child of " + parent.data + "?");
		}
		int item = scn.nextInt();
		Node nn = new Node();
		nn.data= item;
		System.out.println("enter the no of children for " + nn.data + "?");
		int noc = scn.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}
	public void display() {
		display(root);
	}
	public void display(Node node) {
		String str = node.data + "->" ;
		for(Node child : node.children) {
			str += child.data + " ";
		}
		str += ".";
		System.out.println(str);
		for(Node child : node.children) {
			display(child);
		}	
	}
	public int size() {
		return size(root);
	}
	private int size(Node node) {
		int ts = 0;
		for(Node child : node.children) {
			int cs = size(child);
			ts += cs ;
		}
		return ts + 1;
	}
	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int tm = node.data;
		for(Node child : node.children) {
			int cm = max(child);
			if (cm > tm) {
				tm = cm ;
			}
		}
		return tm;
	}
	public boolean find(int item) {
		return find(root,item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) 
			return true;
		for(Node child : node.children) {
			boolean cf = find(child,item);
			if (cf) 
				return true;
		}
		return false;
	}
	public int hight() {
		return hight(root);
	}

	private int hight(Node node) {
		int th = 0 ;
		for(Node child : node.children) {
			int ch = hight(child);
			if (ch > th) {
				th = ch ;
			}
		}
		return th + 1 ;
	}
	
	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		Collections.reverse(node.children);

		// array list reverse
//		int i = 0; // 0
//		int j = node.children.size() - 1; // 2
//
//		while (i <= j) {
//
//			Node in = node.children.get(i); // 2k
//			Node jn = node.children.get(j); // 4k
//
//			node.children.set(i, jn);
//			node.children.set(j, in);
//
//			i++;
//			j--;
//
//		}

	}
	
	public void printAtLevel(int level) {
		printAtLevel(root, level, 0);
	}

	private void printAtLevel(Node node, int level, int count) {

		if (level == count) {
			System.out.println(node.data);
			return;
		}

		for (Node child : node.children) {
			printAtLevel(child, level, count + 1);
		}

	}

	public void linearize() {
		linearize(root);
	}

	private void linearize(Node node) {

		for (Node child : node.children) {
			linearize(child);
		}

		while (node.children.size() > 1) {

			Node temp = node.children.remove(1);
			Node tail = getTail(node.children.get(0));
			tail.children.add(temp);

		}

	}

	private Node getTail(Node node) {
		if (node.children.size() == 0) {
			return node;
		}

		return getTail(node.children.get(0));
	}
	
	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node node) {

		System.out.print(node.data + " ");

		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(root);
		System.out.println();
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}

		System.out.print(node.data + " ");

	}

	public void levelOrder() {

		Queue<Node> q = new LinkedList<>();

		// initial setup : add root node in queue
		q.add(root);

		// work till q is not empty
		while (!q.isEmpty()) {

			// remove the node
			Node rn = q.remove();

			// print the data of removed node
			System.out.print(rn.data + " ");

			// removed node children enqueue
			for (Node child : rn.children) {
				q.add(child);
			}


		}

		System.out.println();

	}

	
	
}
