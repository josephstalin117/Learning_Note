class Banker implements Runnable {
	int money = 300;
	int time1, time2;
	Thread accountant, cashier;

	public Banker() {
		accountant = new Thread(this);
		accountant.setName("���");
		cashier = new Thread(this);
		cashier.setName("����");
	}

	public void run() {
		for (int i = 1; i <= 3; i++) // ����һ��������ƺͳ��ɶ�Ҫʹ��saveOrTake������
		{
			if (Thread.currentThread() == accountant) {
				time1 = i;
				saveOrTake(30); // accountant�߳�ռ��CPU��Դ�ڼ������ͬ��������
			} else if (Thread.currentThread() == cashier) {
				time2 = i;
				saveOrTake(30); // cashier�߳�ռ��CPU��Դ�ڼ������ͬ��������
			}
		}
	}

	public synchronized void saveOrTake(int number) // ͬ�����������������Դ��
	{
		if (Thread.currentThread() == accountant) // �����accountantռ��CPU��Դ��
		{
			System.out.printf("%s%d\n", "����������", time1);
			for (int i = 1; i <= 3; i++) // accountantʹ�ø÷�������90�򣬴���30����Ъһ�£�
			{ // ��ʱcashier�Բ���ʹ�ø÷�����
				money = money + number; // ��Ϊaccountant��ûʹ�ø÷�����
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.printf("%s��Ŀǰ������%d��Բ\n",
						"����" + accountant.getName(), money);
			}
		} else if (Thread.currentThread() == cashier) // �����cashierռ��CPU��Դ��
		{
			System.out.printf("%35s%d\n", "����������", time2);
			for (int i = 1; i <= 2; i++) // cashierʹ�ø÷���ȡ��30Ԫ��ȡ��15Ԫ����Ъһ�£�
			{ // ��ʱaccountant�Բ���ʹ�ø÷�����
				money = money - number / 2; // ��Ϊcashier��ûʹ����÷�����
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.printf("%35s��Ŀǰ������%d��Բ\n", "����" + cashier.getName(),
						money);
			}
		}
	}
}

public class TestSynchronized {
	public static void main(String args[]) {
		Banker a = new Banker();
		a.accountant.start();
		a.cashier.start();
	}
}