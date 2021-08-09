package L_35_Queue;

public class Queue {

	protected int[] data ;
	protected int front ;
	protected int size ;
	
	public Queue() {
		data = new int[5] ;
		front = 0 ;
		size = 0 ;
	}
	
	public Queue(int cap) {
		data = new int[cap] ;
		front = 0 ;
		size = 0 ;
	}
	
	public void enqueue(int item) throws Exception {
		if(isFull())
			throw new Exception("Queue is full");
		
		int idx = (front + size) % data.length ;
		data[idx] = item ;
		size++;
	}
	
	public int dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is Empty");
		
		int temp = data[front];
		data[front] = 0 ;
		front = (front + 1 ) % data.length;
		size--;
		return temp;
	}
	
	public int getfront() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is Empty");
		
		return data[front];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size() == data.length ;	
	}
	
	public boolean isEmpty() {
		return size() == 0 ;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
