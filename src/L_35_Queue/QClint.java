package L_35_Queue;

public class QClint {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(3);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println(q.dequeue());
		q.display();
		q.enqueue(40);
		q.display();
	}

}
