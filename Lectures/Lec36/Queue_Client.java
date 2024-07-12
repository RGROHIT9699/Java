package Lec36;

public class Queue_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue qt = new Queue();
		qt.enQueue(10);
		qt.enQueue(20);
		qt.enQueue(30);
		qt.enQueue(40);
		qt.enQueue(50);
		System.out.println(qt.deQueue());
		System.out.println(qt.deQueue());
		qt.enQueue(60);
		qt.display();

	}

}
