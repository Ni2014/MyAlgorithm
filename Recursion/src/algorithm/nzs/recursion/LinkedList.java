package algorithm.nzs.recursion;


public class LinkedList {

	private Node head;

	/**
	 * 递归实现链表的添加
	 * @param data
	 */
	public void add(int data) {
		if (head != null) {
			head.add(data);
		} else {
			head = new Node(data);
		}
	}

	public void print(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

		public void add(int data) {
			if (this.next != null) {
				this.next.add(data);
			} else {
				Node node = new Node(data);
				this.next = node;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		list.print(list.head);

	}
}
