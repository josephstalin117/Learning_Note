import java.util.*;

public class testUtil{
	
	public static void main(String arg[]){
		
		System.out.print("������һ���ַ�����");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��������Ҫɾ�����ַ���");
		Scanner hehe = new Scanner(System.in);
		hehe.toString();
		scan.toString();
		
		
		StringBuffer MyStrBuff1 = new StringBuffer(scan);
		MyStrBuff1.setCharAt(0,hehe);
		
		MyStrBuff1.toString();
		
	}
}