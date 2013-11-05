package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//Create: insert
//Read:   select
//Update: update
//Delete: delete

public class CRUD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	write("insert into personal(ID,name,birthday,degree,salary,log) values('0011','ningluqiao','2013-01-01',10,10.11,'2013-01-01 01:01:01')");
		read("select * from personal");
		write("update personal set salary=salary+100");
		read("select * from personal");
		write("delete from personal where ID='0011'");
		read("select * from personal");
	}
	
	// ��ѯ��÷���һ�������List
	static void read(String sql)
	{
		Connection con=null;
		Statement sm=null;
		ResultSet rs=null;

		try {
			con=Jdbc.getCon();
			sm=con.createStatement();
			System.out.println(sql);//for test
			rs=sm.executeQuery(sql);
			while(rs.next())
			{
				// ����ҵ����Ҫȡ����Ӧ���ݲ����д���
				System.out.println(rs.getObject("ID")+"\t"+rs.getObject("name")+"\t"+rs.getObject("salary"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			Jdbc.free(rs, sm, con);
		}		
	}
	
	// �������д�����(���룬���º�ɾ��)
	static int write(String sql)
	{
		Connection con=null;
		Statement sm=null;
		ResultSet rs=null;
		int rows=0;

		try {
			con=Jdbc.getCon();
			sm=con.createStatement();
			System.out.println(sql);//for test
			rows=sm.executeUpdate(sql);
			System.out.println(rows+" rows effect.");//for test
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			Jdbc.free(rs, sm, con);
		}
		return rows;
	}


}
