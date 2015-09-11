package test.algorithm.linkedlist;

public class LinkedListDemo {

	private Node header;
	private Node current;

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

	public void add(int data) {
		if (header == null) {
			header = new Node(data);
			current = header;
		} else {
			Node node = new Node(data);
			current.next = node;
//			current = node;
			current=current.next;
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
	 * 查找倒数第k个节点
	 * 
	 * @param args
	 */

	public void findLastNode(Node node, int k) {
		if (node == null) {
			return;
		}
		Node first = node;
		Node second = node;
		for (int i = 0; i < k; i++) {
			second = second.next;
		}
		while (second != null) {
			first = first.next;
			second = second.next;
		}
		if (second == null) {
			System.out.println(first.data);
		}

	}

	/**
	 * 查找中间节点
	 */
	public void findMid(Node node) {
		if (node == null) {
			return;
		}
		Node first = node;
		Node second = node;
		while(first!=null&&first.next!=null){
			first=first.next.next;
			second=second.next;
		}
		System.out.println(second.data);
		
	}
	/**
	 * 反转单链表
	 */
//	public Node reverseList(Node node){
//		
//	}
	public static void main(String[] args) {
		LinkedListDemo list1 = new LinkedListDemo();
		for (int i = 0; i < 9; i++) {
			list1.add(i);
		}
		 list1.print(list1.header);
//		list1.findLastNode(list1.header, 3);
//		list1.findMid(list1.header);
		
		LinkedListDemo list2 = new LinkedListDemo();
		
		
		
	}

}
