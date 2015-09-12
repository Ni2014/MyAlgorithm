package algorithm.nzs.queueAndStack;


public class Queue {

	private Node header;
	private Node current;

	public void add(int data) {
		Node node = new Node(data, null);
		if (header == null) {
			header = node;
			current = header;
		} else {
			current.next = node;
			current = current.next;
		}

	}
	/**
	 * ���Ӳ���
	 * @return
	 */
	public int pop() throws Exception{
		if(header==null){
			throw new Exception("����Ϊ��");
		}
		Node node = header;
		header = header.next;
		return node.data;
		
	}

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;

		}
	}

	public static void main(String[] args) throws Exception {

		Queue queue = new Queue();
		queue.add(4);
		queue.add(15);
		queue.add(3);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
		
	}

}
