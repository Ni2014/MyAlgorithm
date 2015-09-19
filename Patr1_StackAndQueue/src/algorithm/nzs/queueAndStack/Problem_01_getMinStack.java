package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class Problem_01_getMinStack {

	/**
	 * 1.设计一个有getMin功能的栈<br>
	 * 题目：实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
	 * 要求：①pop，push，getMin操作的时间复杂度都是0(1);②设计的栈类型可以使用现成的栈结构；
	 * 思路：加多一个辅助栈，保存每一步的最小值，记为stackMin。
	 */
	public static class MyStack1 {
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;

		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum <= this.getMin()) {
				this.stackMin.push(newNum);
			}
			this.stackData.push(newNum);
		}

		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty!!!");
			}
			int value = this.stackData.pop();
			if (value == this.getMin()) {
				this.stackMin.pop();
			}
			return value;
		}

		public int getMin() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty!!!");
			}
			return this.stackMin.peek();
		}
	}
	
	public static class MyStack2 {
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;

		public MyStack2() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum < this.getMin()) {
				this.stackMin.push(newNum);
			} else {
				int newMin = this.stackMin.peek();
				this.stackMin.push(newMin);
			}
			this.stackData.push(newNum);
		}

		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}

		public int getMin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}


	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println(stack1.getMin());
		stack1.push(4);
		System.out.println(stack1.getMin());
		stack1.push(1);
		System.out.println(stack1.getMin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getMin());
		
		System.out.println("=============");

		MyStack1 stack2 = new MyStack1();
		stack2.push(3);
		System.out.println(stack2.getMin());
		stack2.push(4);
		System.out.println(stack2.getMin());
		stack2.push(1);
		System.out.println(stack2.getMin());
		System.out.println(stack2.pop());
		System.out.println(stack2.getMin());
	}

}
