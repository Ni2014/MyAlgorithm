package test.algorithm.linkedlist;

public class LinkedList {

	 Node header;
	private Node current;

	public void add(int data) {
		if (header == null) {
			header = new Node(data, null);
			current = header;
		} else {
			Node node = new Node(data, null);
			current.next = node;
			current = node;
		}
	}

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
	 * 对应Node的数据结构
	 * @author hadoop
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

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 9; i++) {
			list.add(i);
		}
		list.print(list.header);
	}

}
