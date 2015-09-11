package algorithm.nzs.linkedlist;

public class LinkedListBase {

	Node head;
	 Node current;

	/**
	 * ����Node����������
	 */
	class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		// �ж�����Ϊ�յ����
		if (head == null) {
			head = new Node(data, null);
			current = head;
		} else {
			// �����µĽڵ�
			Node node = new Node(data, null);
			// ���´����Ľڵ��������й���
			current.next = node;
			// �ƶ���ǰ�����λ��
			current = node;
		}
	}

	public void add(Node node) {
		if (head == null) {
			head = node;
			current = head;
		} else {
			current.next = node;
			current = node;
		}
	}

	/**
	 * ����������
	 * 
	 * @param node
	 */
	public void print(Node node) {
		if (node == null) {
			return;
		}
		Node current = node;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	/**
	 * ȡ����ĳ���
	 */
	public static int getLength(Node node){
		if(node==null){
			return -1;
		}
		int length = 0;
		Node current = node;
		while(current!=null){
			current=current.next;
			length++;
		}
		return length;
	}
	/**
	 * ����������� Ҫ������Ķ���ʹ����Լ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 8; i++) {
			list.add(i);
		}
		list.print(list.head);
	}

}
