package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class SequenceIsPop {

	public static boolean sequenceIsPop(int[] data1, int[] data2) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0, j = 0; i < data1.length; i++) {
			stack.add(data1[i]);
			while (stack.size() > 0 && stack.peek() == data2[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.size() == 0;

	}

	/**
	 * 检验两个出入栈的数组是不是同一个栈
	 */
	public static void main(String[] args) {
		int[] data1 = { 1, 2, 3, 4, 5 };
		int[] data2 = { 4, 5, 3, 1, 2 };
		System.out.println(sequenceIsPop(data1, data2));
	}

}
