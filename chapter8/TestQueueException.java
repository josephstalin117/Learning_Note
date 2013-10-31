//��������������Ķ��塣Ϊ���׳����⣬�����д�������һ���޸�
public class TestQueueException
{
  public static void main(String args[])
  {
	Queue queue = new Queue();

	for(int i=1;i<8;i++)
	{
          queue.enqueue(i);
	  System.out.println(queue.visitAllNode());
	}
	System.out.println("\n");//�������лس�
	try{
	  while(true)
	  {
	    System.out.print(queue.dequeue()+"���ӣ�");
	    System.out.println("�����л��У�"+queue.visitAllNode());
	  }
	}
	catch(EmptyQueueException e)
	{
	   System.out.println(e.toString());
	}
  }
}
//-----------------------------------------------------------------
class Queue extends LinkList		//���������
{
	boolean isEmpty()			//�ж϶����Ƿ�Ϊ��
	{
		if(m_FirstNode==null)
			return true;
		else
			return false;
	}
	void enqueue(int newdata)	//�ӶӲ������ڶ���β������һ������
	{
		Node next = m_FirstNode;
		if(next==null)
			m_FirstNode = new Node(newdata);
		else
		{
			while(next.getNext()!=null)
				next = next.getNext();
			next.setNext(new Node(newdata));
		}
	}
	int dequeue()	throws EmptyQueueException 
	{	//���Ӳ����������в��գ���Ӷ���ͷ��ȡ��һ������	
		int data;
		if(isEmpty())
                    throw (new EmptyQueueException("���ѿ�"));
                else
		{
			data = m_FirstNode.getData();
			m_FirstNode = m_FirstNode.getNext();
			return data;
		}
	}
}
//----------------------------------------------------------------
class EmptyQueueException extends Exception {  //�����쳣��
     public EmptyQueueException(String msg){
         super(msg);
     }
}

//-----------------------------------------------------------------
 class LinkList				//����������
{
	Node m_FirstNode;		//�����еĵ�һ���ڵ�
	LinkList()			//���캯��1������������
	{
		m_FirstNode = null;
	}
	LinkList(int data)		//���캯��2������ֻ��һ���ڵ������
	{
		m_FirstNode = new Node(data);
	}
	String visitAllNode()	//��������ÿ���ڵ㣬���������ݴ���һ���ַ���
	{
		Node next = m_FirstNode;	//�ӵ�һ���ڵ㿪ʼ
		String s = "";
		while(next!=null)			//ֱ�����һ���ڵ�
		{
			s = s + next.getData() + ";  ";
			next = next.getNext();	//nextָ����һ���ڵ�
		}
		return s;
	}
	void insertAtBegin(int data)  //������data�Ľڵ���������������ǰ��
	{
		if(m_FirstNode == null) 	//���ڿ�����ֱ�Ӳ���
			m_FirstNode = new Node(data);
		else	//���½ڵ���ڵ�һ���ڵ�ǰ�棬��ָ��ԭ���ĵ�һ�ڵ�
			m_FirstNode = new Node(data,m_FirstNode);
	}

	void insertAfterId(int data,int id)
	{          //������data���ڰ�������id�Ľڵ������������û��id,�������������������
		Node next = m_FirstNode;
		if(next == null)	//���ڿ�����ֱ�Ӳ���
			m_FirstNode = new Node(data);
		else
		{
			while(next.getNext()!=null && next.getData()!=id)
				next = next.getNext();				//�ҵ����ʵĲ���λ��
			next.setNext( new Node(data,next.m_Next) );
		}
	}
	boolean removeAtId(int id)		//ɾ�������е�һ������Ϊid�Ľڵ�
	{
		Node ahead = m_FirstNode;	//ǰ��Ľڵ�
		Node follow = ahead;		//ָ��ahead�Ľڵ�

		if(ahead == null)		//����Ϊ�գ�ɾ��ʧ��
			return false;
		else if(ahead.getData()==id)	//��һ���ڵ������ɾ���ڵ�
		{
			m_FirstNode = m_FirstNode.getNext();	//ɾ���ɹ�
			return true;
		}
		else
		{
			ahead = ahead.getNext();	//�ڶ����ڵ�
			if(ahead==null)	  //��ֻ��һ���ڵ��Ҳ�����ɾ���ڵ�
				return false;		//ɾ��ʧ��
			else
			{
			  while(ahead!=null)
			  {
			    if(ahead.getData()==id)	//�ҵ�ƥ��Ľڵ�
			    {
				follow.setNext(ahead.getNext());
				return true;	//ɾ���ɹ�
			    }
	  		    follow = ahead;	//����һ���������һ���ڵ�
			    ahead = ahead.getNext();//follow����ahead����
			  }
			  return false;
			}
		}
	}
	void removeAll()		//ɾ�����еĽڵ㣬������Ϊ��
	{
		m_FirstNode = null;
	}
}
//------------------------------------------------------
class Node                //����ڵ���
{
 int m_Data;		//�ڵ��б��������
 Node m_Next;	//�ڵ��е�ָ�����ԣ�ָ����һ��Node����Ķ�������

 Node(int data)			//���캯��1
 {
	m_Data = data;
	m_Next = null;
 }
 Node(int data,Node next)	//���캯��2
 {
	m_Data = data;
	m_Next = next;
 }
 void setData(int data)	//�޸Ľڵ��е�����
 {
	m_Data = data;
 }
 int getData()		//��ýڵ��е�����
 {
	return m_Data;
 }
 void setNext(Node next)//ָ��ָ��ָ���Node��������
 {
	m_Next = next;
 }
 Node getNext()		//��ýڵ��е�ָ��ָ��Ķ�������
 {
	return m_Next;
 }
}