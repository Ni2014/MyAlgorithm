package algorithm.nzs.linkedlist;

public class LinkedListBase {

	Node head;
	 Node current;

	/**
	 * 定义Node的数据类型
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
		// 判断链表为空的情况
		if (head == null) {
			head = new Node(data, null);
			current = head;
		} else {
			// 创建新的节点
			Node node = new Node(data, null);
			// 把新创建的节点跟链表进行关联
			current.next = node;
			// 移动当前链表的位置
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
	 * 遍历单链表
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
	 * 取链表的长度
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
	 * 链表基础部分 要求：链表的定义和创建以及遍历
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
