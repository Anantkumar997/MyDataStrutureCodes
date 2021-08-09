package GenricTree;

public class GTClint {

	public static void main(String[] args) {
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		// 10 3 20 2 50 0 60 1 80 0 30 0 40 1 70 0
		GenricTree gt = new GenricTree();
		gt.display();
//		System.out.println(gt.size());
//		System.out.println(gt.max());
//		System.out.println(gt.find(80));
//		System.out.println(gt.hight());
//		gt.mirror();
//		gt.display();
//		gt.printAtLevel(1);
		gt.linearize();
		gt.display();
	}

}
