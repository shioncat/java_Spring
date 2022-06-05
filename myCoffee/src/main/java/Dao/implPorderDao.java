package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface implPorderDao {

	//連線方法
	static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/gjun?useUnicode=true&characterEncoding=utf-8";
		String user="root";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no connection");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//新增物件
	void add(Object o);
	
	//查詢物件
	List<Object> queryAll();//全部
	List<Object> querySum(int start,int end);//金額條件
	List<Object> queryId(int id);
	
	//修改物件
	void update(Object o);
	
	//刪除物件
	void delete(int id);
}