package dp.nzs.singleton;

public class SingletonFive {

	/**
	 * ˫��У����(�����жϣ��Ե�����ͬ���ĸĽ�)
	 */
	private static SingletonFive instance;

	private SingletonFive() {

	}

	public static SingletonFive getInstance() {
		if (instance == null) {
			//�õ�������������ʱ�ż���
			synchronized (SingletonFive.class) {
				instance = new SingletonFive();
			}
		}
		return instance;
	}

	public static void main(String[] args) {

	}

}
