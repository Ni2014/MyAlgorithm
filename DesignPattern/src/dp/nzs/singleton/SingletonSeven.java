package dp.nzs.singleton;
/**
 * ����ģʽ��ö��ʵ��
 * �ô��ǿ��Է�ֹ�����л����ɶ���(��Effective Java����java1.5�ᳫ)����Դ���볣��
 */
public enum SingletonSeven {
	INSTANCE;
	public void doSomething() {
		System.out.println("do something");
	}

	public static void main(String[] args) {
		SingletonSeven.INSTANCE.doSomething();
	}
}
