import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Book> table=new HashMap<String,Book>();
		
		//����Ԫ��
//		table.put("110", new Book("110","C++"));
		Book b1=new Book("110","C++");
		Book b2=new Book("120","JAVA");
		Book b3=new Book("130","JSP");
		table.put(b1.ISBN, b1);
		table.put(b2.ISBN, b2);
		table.put(b3.ISBN, b3);
		
		//�ж�Ԫ���Ƿ����
		if(table.containsKey("110"))
		{
			//System.out.println(table.get("110"));
			System.out.println(table.get("110").name);
		}
		
		//Ԫ��ɾ��
		table.remove("120");
		
		//����Ԫ�ر���
		Collection<Book> c=table.values();
		Iterator<Book> i=c.iterator();
		while(i.hasNext())
		{
			Book b=i.next();
			System.out.println(b.ISBN+":"+b.name);
		}

	}

}

class Book
{
	String ISBN;
	String name;
	Book(String ISBN, String name)
	{
		this.ISBN=ISBN;
		this.name=name;		
	}
}
