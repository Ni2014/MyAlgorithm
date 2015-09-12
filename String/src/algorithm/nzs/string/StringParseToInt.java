package algorithm.nzs.string;

public class StringParseToInt {

	public static int parseInt(String str) {
		if (str == null) {
			throw new RuntimeException("str is null");
		}
		char[] data = str.toCharArray();
		boolean isPositive = true;

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int index = 0;
		if (data[0] == '+') {
			isPositive = true;
			index++;
		} else if (data[0] == '-') {
			isPositive = false;
			index++;
		}
		long result = 0;
		for (int i = index; i < data.length; i++) {
			if (data[i] >= '0' && data[i] <= 9) {
				result = result * 10 + (data[i] - '0');
				// 最大值最小值进行判断
				if (isPositive && (result > max)) {
					throw new RuntimeException("str > Integer maxValue " + str);
				} else if (!isPositive && (-result < min)) {
					throw new RuntimeException("str < Integer minValue " + str);
				}
			} else {
				throw new RuntimeException("str can't parse integer " + str);
			}
		}
		return (int) (isPositive ? result : -result);
	}

	/**
	 * 字符串转换为整型
	 */
	public static void main(String[] args) {
		String str = "+";
		System.out.println(parseInt(str));
//		 System.out.println(Integer.MAX_VALUE);
//		 System.out.println(Integer.MIN_VALUE);

	}

}
