package L_34_Stack;

public class SClint {

	public static void main(String[] args) throws Exception {
		Stack s = new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		//s.push(40);
		s.pop();
		s.pop();
		s.pop();
		s.display();
	}

}
