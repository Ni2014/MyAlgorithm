package test.algorithm.linkedlist;

public class LinkedListUtils {

	 Node header;
	private Node current;

	/**
	 * ����Node�����ݽṹ
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
	 * ���Ԫ�ص�������
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
	 * ����������
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
