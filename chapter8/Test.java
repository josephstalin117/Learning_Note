import java.io.*;     
public class Test 
	{
  public static void main(String[] args) 
	  {
    try 
		{
        File dir1 = new File("subdir");

        if ( dir1.exists() && dir1.isDirectory()){
           System.out.println(dir1.getName()+"Ŀ¼����");

           String[] files = dir1.list() ;
           System.out.println("-----��Ŀ¼-----");
           for( int i=0; i< files.length; i++)    //��Ŀ¼
              System.out.println( files[i]);

        File dir2=new File("subdir\\d1");
        if(!dir2.exists())  dir2.mkdir();         //��Ŀ¼
        System.out.println(" -----����Ŀ¼���ٴ���Ŀ¼-----");
        files = dir1.list() ;	
        for( int i=0; i< files.length; i++)
             System.out.println( files[i]);

        //dir2.delete() ;   //ɾ��������Ŀ¼
        File f1 = new File("subdir\\a.java");    
        System.out.println("-----�г�a.java�ļ����й���Ϣ-----");
        System.out.println(f1.getName() + "   " +f1.getPath() + "   " + f1.length());
      }
	  else 
          System.out.println("subdir�����ڻ���Ŀ¼");
     }   // try ��
     catch(Exception e)  {
         System.out.println(e.toString());
     }
  }  // end of main()
} 


