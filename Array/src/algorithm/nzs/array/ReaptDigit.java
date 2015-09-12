package algorithm.nzs.array;

public class ReaptDigit {

	/**
	 * 找出重复的数字
	 */
	public static int repeatDigit(int[] data) {
		if (data == null || data.length == 0) {
			return -10000;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] == data[data[i]]) {
				return data[i];
			} else {
				int tmp = data[i];
				data[i] = data[tmp];
				data[tmp] = tmp;
			}
		}
		return -10000;

	}

	public static void main(String[] args) {
		int[] data = {2,3,1,0,2,5,3};
		System.out.println(repeatDigit(data));
	}

}
