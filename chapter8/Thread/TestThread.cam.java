class Left extends Thread {
	int n = 0;

	public void run() {
		while (true) {
			n++;
			System.out.printf("\n%s", "��������д��");
			try {
				sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Right extends Thread {
	int n = 0;

	public void run() {
		while (true) {
			n++;
			System.out.printf("\n%40s", "��������д��");
			try {
				sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class TestThread{
	public static void main(String args[]) {
		Left left = new Left();
		Right right = new Right();
		left.start();
		right.start();
		while (true) {
			System.out.printf("\n%20s", "����main�߳�");
			try {
				Thread.sleep((int) (Math.random() * 100) + 100);
			} catch (InterruptedException e) {
			}

			if (left.n == 8 || right.n == 8)
				System.exit(0);
		}
	}
}
