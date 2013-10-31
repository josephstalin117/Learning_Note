import java.io.*;

public class TestThread
{
	public static void main(String args[])
	{
		// ���߳������½�״̬
		PrimeThread subthread=new PrimeThread(10);
		// ���߳����ھ���״̬
		subthread.start();
		while(subthread.isAlive() && subthread.readyToGoOn())
		{
			System.out.println("���߳�������...\n"); 		
			try
			{
				// ���߳���������״̬
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
		
		System.out.println("���߳����н���...");
	}
}

class PrimeThread extends Thread
{
	boolean bContinue=true;
	int CircleNum;

	PrimeThread(int Num)
	{
		CircleNum=Num;
	}

	boolean readyToGoOn()
	{
		return bContinue;
	}

	public void run()
	{
		int number=3;
		boolean flag=true;

		while(true)
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println(number+"������\n");
			}
			else
			{
				System.out.println(number+"��������\n");
			}
			
			number++;
			flag=true;
			
			try
			{
				sleep(10);
			}
			catch(InterruptedException e)
			{
				return;
			}
			
			if(number>CircleNum)
			{
				bContinue=false;
				return;
			}
		}
	}
}