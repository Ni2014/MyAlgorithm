package algorithm.nzs.array;

public class HalfNum {

	/**
	 * 求数组中出现次数超过一般的数
	 */
	public static int halfNum(int[] data) {
		if (data == null || data.length == 0) {
			return -1000;
		}
		int count = 1;
		int tmp = data[0];
		for (int i = 1; i < data.length; i++) {
			if (tmp == data[i]) {
				count++;
			} else {
				if (count == 0) {
					tmp = data[i];
					count++;
				} else {
					count--;
				}
			}
		}
		if (checkHalfArray(data, tmp)) {
			return tmp;
		} else {
			return -1000;
		}
	}

	public static boolean checkHalfArray(int[] data, int key) {
		int count = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == key) {
				count++;
			}
		}

		if (count * 2 > data.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 4, 4, 4 };
		System.out.println(halfNum(data));
	}

}
