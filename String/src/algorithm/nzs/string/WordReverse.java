package algorithm.nzs.string;

public class WordReverse {

	public static String wordReverse(String str) {
		if (str == null) {
			throw new RuntimeException("str is null");
		}
		char[] data = str.toCharArray();
		reverse(data, 0, str.length()-1);
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (data[i] == ' ') {
				reverse(data, begin, i - 1);
				begin = i + 1;
			}
		}
		return new String(data);

	}

	public static void reverse(char[] data, int begin, int end) {
		if (data.length == 0) {
			return;
		}
		while (begin < end) {
			char tmp = data[begin];
			data[begin] = data[end];
			data[end] = tmp;
			begin++;
			end--;
		}
	}

	/**
	 * 句子中的单词翻转 实例：I am boy! ==> boy! am I
	 */
	public static void main(String[] args) {
		String str = new String("I am boy!");
		System.out.println(wordReverse(str));
	}

}
