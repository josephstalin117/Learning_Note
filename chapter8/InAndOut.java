import java.io.*;

public class InAndOut
{
		public static void main(String args[])
		{
			try
			{
				BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
				System.out.print("������һ��������");
				int i = Integer.parseInt(br.readLine());
				System.out.print("�������������"+i);
			}
			catch(IOException e)
			{
				System.err.println(e.toString());
			}
		}
}
