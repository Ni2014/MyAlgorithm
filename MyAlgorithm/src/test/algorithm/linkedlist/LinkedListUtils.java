package test.algorithm.linkedlist;

public class LinkedListUtils {

	 Node header;
	private Node current;

	/**
	 * 定义Node的数据结构
	 */
	class Node {
		int data;
		Node next;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * 添加元素到单链表
	 */
	public void add(int data) {
		if (header == null) {
			header = new Node(data);
			current = header;
		} else {
			Node node = new Node(data);
			current.next = node;
			current = current.next;
		}
	}

	/**
	 * 遍历单链表
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

}
