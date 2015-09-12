package algorithm.nzs.string;


public class DigitUtils {

	static class Result {
		int start;
		boolean flag = true;
	}

	public static void digit(char[] data, int start, int end, Result result) {
		while (start <= end) {
			if (data[start] >= '0' && data[start] <= '9') {
				start++;
			} else {
				result.start = start;
				return;
			}
		}
		result.start = start - 1;

	}

	public static boolean isExponent(char[] data, int start, int end,
			Result result) {
		if (data[start] != 'e' && data[start] != 'E') {
			return false;
		}
		start++;
		if (data[start] == '+' || data[start] == '-') {
			start++;
		}
		if (start == end) {
			if (data[start] >= '0' && data[start] <= '9') {
				result.start = start;
				return true;
			} else {
				return false;
			}
		}
		digit(data, start, end, result);
		return result.start == end;
	}

	public static boolean isNum(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}
		char[] data = str.toCharArray();
		int end = data.length - 1;
		Result result = new Result();
		int start = 0;
		if (data[0] == '+' || data[0] == '-') {
			result.start = start + 1;
		}
		digit(data, result.start, end, result);
		if (result.start == end) {
			if (data[result.start] >= '0' && data[result.start] <= '9') {
				return true;
			} else {
				return false;
			}
		}
		if (data[result.start] == '.') {
			result.start++;
			digit(data, result.start, end, result);
			if (data[result.start] == 'e' || data[result.start] == 'E') {
				result.flag = isExponent(data, result.start, end, result);
			}

		} else if (data[result.start] == 'E' || data[result.start] == 'e') {
			result.flag = isExponent(data, result.start, end, result);
		} else {
			return false;
		}
		return result.start == end && result.flag;

	}

	public static void main(String args[]) {
		System.out.println(isNum("12e"));
		System.out.println(isNum("22ssa"));
		System.out.println(isNum("1.1.2"));
		System.out.println(isNum("+-5"));
		System.out.println(isNum("12e+5.1"));
	}

}
