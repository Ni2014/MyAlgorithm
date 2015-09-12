package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack =new Stack<Integer>();
	private Stack<Integer> minStack =new Stack<Integer>();
	public void add(int data){
		stack.add(data);
		if(minStack.size()==0||minStack.peek()>data){
			// 如果stack的栈顶元素比minStack的栈顶元素小，minStack要加上更新这个最小值
			minStack.add(data);
		}else{
			// 如果stack的栈顶元素比minStack的栈顶元素大，minStack加的是上一次的最小值
			minStack.add(minStack.peek());
		}
	}
	public int pop() throws Exception{
		if(stack.size()==0){
			throw new Exception("栈中空了");
		}
		int data = stack.pop();
		minStack.pop();
		return data;
	}

	public int min() throws Exception{
		if(minStack.size()==0){
			throw new Exception("栈中空了");
		}
		int data = minStack.peek();
		return data;
	}
	/**
	 * 题目:设计一个含有min函数的栈，要求min,pop和push函数的时间复杂度都是O(1)
	 * 思路：空间换时间，加一个辅助栈
	 * by Wechat
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		MinStack stack =new MinStack();
		stack.add(5);
		stack.add(3);
		stack.add(4);
		stack.add(2);
		stack.pop();
		System.out.println(stack.min());
	}

}
