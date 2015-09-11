package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class FindLastKNode {

	public static void findLastKNode(Node node, int k) {
		if (node == null) {
			return;
		}
		//��ָ��
		Node first = node;
		//��ָ��
		Node second = node;
		//���ÿ�ָ����k���ڵ�
		for (int i = 0; i < k; i++) {
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		if (first == null) {
			System.out.println(second.data);
		}
	}

	/**
	 * ��Ŀ�������������е�����k���ڵ� 
	 * һ���˼·�Ǿ������α�������һ�εõ�����length���ڶ��α���length-k�Σ����ǲ��ᳫ
	 * �Ľ���˼·����"��ָ�뷨"
	 */
	public static void main(String[] args) {
		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 8; i++) {
			list.add(i);
		}
		findLastKNode(list.head, 3);

	}

}
