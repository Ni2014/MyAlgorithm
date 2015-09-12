package algorithm.nzs.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private Node root;

	public void add(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			root.add(data);
		}

	}

	public void midPrint() {
		if (root != null) {
			root.midPrint();
		}
	}

	public void prePrint() {
		if (root != null) {
			root.prePrint();
		}
	}

	public void postPrint() {
		if (root != null) {
			root.postPrint();
		}
	}

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public void add(int data) {
			Node node = new Node(data);
			if (data > this.data) {
				if (this.right != null) {
					this.right.add(data);
				} else {
					this.right = node;
				}
			} else {
				if (this.left != null) {
					this.left.add(data);
				} else {
					this.left = node;
				}
			}
		}

		/**
		 * �������(�������������������պÿ��Եõ�����õ�����)
		 */
		public void midPrint() {
			if (this.left != null) {
				this.left.midPrint();
			}
			System.out.println(this.data);
			if (this.right != null) {
				this.right.midPrint();
			}
		}

		/**
		 * ǰ�����
		 */
		public void prePrint() {
			System.out.println(this.data);
			if (this.left != null) {
				this.left.prePrint();
			}
			if (this.right != null) {
				this.right.prePrint();
			}
		}

		/**
		 * �������
		 */
		public void postPrint() {
			if (this.left != null) {
				this.left.postPrint();
			}
			if (this.right != null) {
				this.right.postPrint();
			}
			System.out.println(this.data);
		}
	}

	/**
	 * �������(����α���)
	 */
	public void breadthFirst() {
		Queue<Node> queue = new ArrayDeque<Node>();
		if (this.root != null) {
			queue.add(root);
		}
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.data);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

	}

	/**
	 * ��������ľ��� ˼·����ǰ������㷨�ĸı�(���������ӽ��)
	 */
	public void mirrorTree(Node node) {
		if (node == null) {
			return;
		}
		Node temp;
		temp = node.left;
		node.left = node.right;
		node.right = temp;
		if (node.left != null) {
			mirrorTree(node.left);
		}
		if (node.right != null) {
			mirrorTree(node.right);
		}

	}

	/**
	 * ������������
	 * 
	 * @param args
	 */
	public int getBinanryTreeDeepth(Node node) {
		if (node == null) {
			return 0;
		}
		int left = 1;
		int right = 1;
		left += getBinanryTreeDeepth(node.left);
		right += getBinanryTreeDeepth(node.right);
		return left > right ? left : right;
	}

	/**
	 * ���Ϊĳһֵ������·��
	 * 
	 * @param args
	 */
	public void printPath(Node node, Stack<Node> stack, int sum, int target) {
		if (node == null) {
			return;
		}
		stack.add(node);
		if (sum + node.data == target) {
			if (node.left == null && node.left == null) {
				for (int i = 0; i < stack.size(); i++) {
					System.out.print(stack.get(i).data + ",");
				}
				System.out.println();
			}
		}
		if (node.left != null) {
			printPath(node.left, stack, sum + node.data, target);
		}
		if (node.right != null) {
			printPath(node.right, stack, sum + node.data, target);
		}
		// ������
		stack.pop();
	}

	/**
	 * �ж�һ�������ǲ���һ�������������ĺ�������Ľ��
	 * 
	 * @param data
	 * @param length
	 * @return
	 */
	public boolean verifyBinaryTreeSet(int[] data, int length) {
		if (data == null || length == 0) {
			return false;
		}
		// ȡ�������
		int root = data[length - 1];
		int i = 0;
		// �ҵ�һ���ȸ��������
		for (; i < length - 1; i++) {
			if (data[i] > root)
				break;
		}
		// �ж��а벿���Ƿ�Ϊ����������
		int j = i;
		for (; j < length - 1; j++) {
			// ����ұߵĻ��бȸ����С�ľͷ���false
			if (data[j] < root) {
				return false;
			}
		}
		// �ж��󲿷��Ƿ�Ϊ����������
		boolean left = true;
		if (i > 0) {
			left = verifyBinaryTreeSet(data, i);
		}
		// �ж��Ҳ����Ƿ�Ϊ����������
		boolean right = true;
		if (i < length-1) {
			right = verifyBinaryTreeSet(data, length - i - 1);
		}
		return left && right;

	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		// bt.add(5);
		// bt.add(7);
		// bt.add(3);
		// bt.add(2);
		// bt.add(1);
		// bt.add(6);
		// bt.add(4);
		// bt.prePrint();
		// bt.breadthFirst();
		// bt.mirrorTree(bt.root);
		// System.out.println(bt.getBinanryTreeDeepth(bt.root));

//		bt.add(10);
//		bt.add(5);
//		bt.add(12);
//		bt.add(4);
//		bt.add(7);
//		bt.printPath(bt.root, new Stack<Node>(), 0, 22);
		int[] data = {5,7,6,9,11,10,8};
		System.out.println(bt.verifyBinaryTreeSet(data, data.length));

	}

}
