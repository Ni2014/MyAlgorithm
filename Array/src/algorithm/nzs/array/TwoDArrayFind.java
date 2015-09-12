package algorithm.nzs.array;

public class TwoDArrayFind {

	private static int[][] DATA = new int[][] { { 1, 2, 8, 9 },
			{ 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };

	/**
	 * 二维数组的查找
	 */
	public static boolean arraysFind(int[][] data, int rows, int colums, int key) {
		if (data != null && rows > 0 && colums > 0) {
			int row = 0;
			int colum = colums - 1;
			while (row < rows && colum >= 0) {
				int tmp = data[row][colum];
				if (tmp == key) {
					return true;
				} else if (tmp > key) {
					colum--;
				} else {
					row++;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(arraysFind(DATA, 4, 4, 7));
		System.out.println(arraysFind(DATA, 4, 4, 0));
		System.out.println(arraysFind(DATA, 4, 4, 19));
		System.out.println(arraysFind(DATA, 4, 4, 1));
	}

}
