import java.util.*; 
import java.text.*;

class CalendarPage
{ 
   public static void main(String args[ ])
   { 

     Calendar c=Calendar.getInstance();
	 // 
     c.set(2012,8,1); 
	 System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));

	 //0���������գ�1��������1��2��������2���Դ�����
     int week=c.get(Calendar.DAY_OF_WEEK)-1;
	System.out.println(week);

     int a[]=new int[week+31];            //��ź����һά���顣
     for(int i=0;i<week;i++)
       {
           a[i]=0;
       }
     for(int i=week,n=1;i<week+31;i++)
       {        
          a[i]=n ;
           n++;
       }
	   
	System.out.printf("%4c%4c%4c%4c%4c%4c%4c\n",'��','һ','��', '��','��','��','��');
    for(int i=0;i<a.length;i++)
       {  if(i%7==0&&i!=0)
                System.out.printf("\n");
          System.out.printf("%5d",a[i]);      
       } 
   } 
}
