import java.applet.*;
import java.awt.*;

public class TestRunnable extends Applet implements Runnable
{
	Label prompt1 = new Label("��һ�����߳�");
	Label prompt2 = new Label("�ڶ������߳�");
	TextField text1 = new TextField(14);
	TextField text2 = new TextField(14);
	Thread thread1,thread2;
	int count1=0,count2=0;
	
	public void init()
	{
		add(prompt1);
		add(text1);
		add(prompt2);
		add(text2);
	}
	
	public void start()
	{
		thread1=new Thread(this,"thread1");
		thread2=new Thread(this,"thread2");
		thread1.start();
		thread2.start();
	}
	
	public void run()
	{
		String currentRunning;
		
		while(true)
		{
			try
			{
				Thread.sleep((int)(Math.random()*3000));
			}
			catch(InterruptedException e)
			{
				
			}
			currentRunning = Thread.currentThread().getName();
			
			if(currentRunning.equals("thread1"))
			{
				count1++;
				text1.setText("�߳�1��"+count1+"�α�����");
			}
			if(currentRunning.equals("thread2"))
			{
				count2++;
				text2.setText("�߳�2��"+count1+"�α�����");
			}
		}
	}
}