import java.util.HashMap;
import java.util.Scanner;

//�����û��������룬�ж��Ƿ������û���¼��
//Ҫ���û�����������map��ʽ���д洢��

public class TestHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Login> table = new HashMap<String, Login>();
		Login l1 = new Login("wyl", "123");
		Login l2 = new Login("tj", "123");
		Login l3 = new Login("ljy", "123");
		table.put(l1.username, l1);
		table.put(l2.username, l2);
		table.put(l3.username, l3);

		System.out.println("�������û���");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.next();

		if (table.containsKey(s1)) {//�ж��û���
			System.out.println("����������");
			Scanner sc2 = new Scanner(System.in);
			String s2 = sc2.next();
			if (table.get(s1).password.equals(s2))
				System.out.println("��½�ɹ�");
			else
				System.out.println("��½ʧ��");
		} else
			System.out.println("�޴��û���");
	}

}

class Login {
	String username;
	String password;

	Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
}