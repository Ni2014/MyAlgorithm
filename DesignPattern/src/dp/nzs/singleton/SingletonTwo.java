package dp.nzs.singleton;

public class SingletonTwo {

	/**
	 * ����ʽ�ı��� instance�ھ�̬�������new �ܷ������õ�������ʼ����
	 */
	private static SingletonTwo instance;
	static {
		instance = new SingletonTwo();
	}

	private SingletonTwo() {

	}

	public static SingletonTwo getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
