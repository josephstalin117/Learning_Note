import java.util.ArrayList;
import java.util.Iterator;


public class TestListObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		//����Ԫ��
		al.add("nlq");
		al.add(1);
		al.add(new Point(0,1));
		
		//����Ԫ��
		Point p=(Point)al.get(2);
		System.out.println(p.p());
		al.set(2, new Point(2,3));
		p=(Point)al.get(2);
		System.out.println(p.p());
		
		//����Ԫ�أ���ѯ
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//ɾ��Ԫ��
		al.remove(0);
		
		//����Ԫ�أ���ѯ
		Iterator iter=al.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}	
}

class Point
{
	int x;
	int y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	String p()
	{
		return x+":"+y;
	}
}
