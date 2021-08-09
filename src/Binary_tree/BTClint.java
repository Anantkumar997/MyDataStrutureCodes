package Binary_tree;

public class BTClint {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.display();
		// 10 true 20 true 40 false false true 50 false false true 30 false true 70 false false
		// 10 true 20 true 40 true 2 false false true 3 false false true -60 false false true -30 true 50 true 60 true 80 false false false true 70 false false true -100 false false
		// 10 true 20 true 40 true 170 false false true 80 false false true 50 false false true 30 true 60 true 90 false false true 100 false false true 70 false false

//		System.out.println(bt.size());
//		System.out.println(bt.max());
//		System.out.println(bt.find(80));
//		System.out.println(bt.ht());
//		System.out.println(bt.leafNodesCount());
//		System.out.println(bt.diameter1());
//		System.out.println(bt.diameter2());
//		System.out.println(bt.diameter3());
//		System.out.println(bt.isBalanced1());
//		System.out.println(bt.isBalanced2());
//		System.out.println(bt.isBalanced3());
		//System.out.println(bt.preorder());
		bt.preorder();
		bt.postorder();
		
	}

}
