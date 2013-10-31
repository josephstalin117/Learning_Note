class Bank implements Runnable {
	private int money = 0;
	Thread zhang, cheng;

	Bank() {
		// ������bank������zhang��Ŀ�����,Bank�����ʵ��Runnable�ӿڡ�
		zhang = new Thread(this);
		zhang.setName("���");
		cheng = new Thread(this); // cheng ��zhang��ͬһĿ�����
		cheng.setName("����");
	}

	public void setMoney(int mount) {
		money = mount;
	}

	public void run() // �ӿ��еķ�����
	{
		while (true) {			
			if (Thread.currentThread() == zhang) {
				money = money - 10;
				if (money <= 100){
					System.out.println("����߳̽��˳�");
				}
				System.out.printf("����%s,������%dԪ\n", zhang.getName(), money);
				if (money <= 100){
					return; // ���money����50,zhang��run����������
				}
			} else if (Thread.currentThread() == cheng) {
				money = money + 10;
				if (money >= 200){
					System.out.println("�����߳̽��˳�");
				}
				System.out.printf("����%s,������%dԪ\n", cheng.getName(), money);
				if (money >= 200){
					return; // ���money����0,cheng��run����������
				}
			}
			try {
				Thread.sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class TestRunnable {
	public static void main(String args[]) {
		Bank bank = new Bank();
		bank.setMoney(110); // �̵߳�Ŀ��������ñ��̹߳����money��
		bank.zhang.start();
		bank.cheng.start();
	}
}
