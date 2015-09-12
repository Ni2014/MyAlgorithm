package algorithm.nzs.queueAndStack;

public class Stack {

	private Node header;
	private Node current;

	/**
	 * 入栈操作
	 * 
	 * @param data
	 */
	public void add(int data) {
		if (header == null) {
			header = new Node(data, null);
			current = header;
		} else {
			Node node = new Node(data, current);
			current = node;
		}
	}

	/**
	 * 出栈操作
	 */
	public Node pop() {
		if (current == null) {
			return null;
		}
		Node node = current;
		current = current.pre;
		return node;
	}

	class Node {
		int data;
		Node pre;

		public Node(int data, Node pre) {
			this.data = data;
			this.pre = pre;
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add(18);
		stack.add(5);
		stack.add(29);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		

	}

}
