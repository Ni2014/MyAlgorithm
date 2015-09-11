package algorithm.nzs.recursion;

public class Sum {

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int age(int n) {
		if (n == 1) {
			return 10;
		}
		return age(n - 1) + 2;
	}

	/**
	 * 阶乘的非递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * 阶乘的递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial1(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial1(n - 1);
	}

	/**
	 * 斐波那契数列的递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int fibonaci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonaci(n - 1) + fibonaci(n - 2);

	}

	/**
	 * 斐波那契数列的非递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int fibonaci1(int n) {
		int result[] = { 0, 1 };
		if (n < 2) {
			return result[n];
		}
		int count = 0;
		int one = 0;
		int two = 1;
		for (int i = 2; i <= n; i++) {
			count = one + two;
			one = two;
			two = count;
		}
		return count;

	}

	public static int sum1(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum1(n - 1);

	}

	public static void main(String[] args) {
		System.out.println(fibonaci1(5));

	}

}
