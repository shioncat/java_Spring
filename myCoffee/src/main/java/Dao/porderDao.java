package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Porder;

public class porderDao implements implPorderDao{

		public static void main(String[] args) {
			new porderDao().delete(2);

		}

	@Override
	public void add(Object o) {
		Connection conn=implPorderDao.getDb();
		String sql="insert into porder(desk,A,B,C,Sum) values(?,?,?,?,?)";
		Porder p=(Porder)o;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Object> queryAll() {
		Connection conn=implPorderDao.getDb();
		String sql="select * from porder";
		List l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Porder p=new Porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
				
				l.add(p);				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Object> querySum(int start, int end) {
		Connection conn=implPorderDao.getDb();
		String sql="select * from porder where sum>=? and sum<=?";
		List l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Porder p=new Porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
				
				l.add(p);				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Object> queryId(int id) {
		Connection conn=implPorderDao.getDb();
		String SQL="select * from porder where id=?";
		PreparedStatement ps;
		List l=new ArrayList();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Porder p=new Porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
				
				l.add(p);				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public void update(Object o) {
		Connection conn=implPorderDao.getDb();
		String sql="update porder set desk=?,A=?,B=?,C=?,sum=? where id=?";
		Porder p=(Porder)o;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			ps.setInt(6, p.getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		Connection conn=implPorderDao.getDb();
		String sql="delete from porder where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}