public class TestMultiException
{
  public static void main(String[] args)
  {
    TestArray a = new TestArray();
    try{
       a.te();
       }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("�����±�Խ��");
    }
    catch(ArithmeticException e)
    {
      System.out.println("��ĸΪ0���������");
      e.printStackTrace();    
    }
  }
}
class TestArray
{
  private int i;
  private int[] array={1,2,3,4,5};
  void te()
  {
    while(true)
    {
      i = (int) (Math.random()*10);
      System.out.println("�������Ϊ��ĸ�ĳ����Ľ���ǣ�"+100/i);
      System.out.println("����array["+i+"]��ֵΪ"+array[i]);
    }
  }
}