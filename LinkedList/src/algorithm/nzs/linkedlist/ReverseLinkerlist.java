package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class ReverseLinkerlist {

	/**
	 * ��Ŀ����ת������
	 */

	public static Node reverse(Node node) {
		if (node == null) {
			return null;
		}
		// ���嵱ǰ������һ��������
		Node next;
		Node currend = node;
		// ���嵱ǰ����ǰ������ʲô
		Node pre = null;
		while (currend != null) {
			// 1 ȡ����ǰ������һ�����
			next = currend.next;
			// ���������ת��
			currend.next = pre;
			// �ѵ�ǰ�����λ�ü�¼����
			pre = currend;
			// �õ�ǰ�����������
			currend = next;
		}
		return pre;
	}

	public static void main(String[] args) {
		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 9; i++) {
			list.add(i);
		}

		list.print(reverse(list.head));
	}

}
