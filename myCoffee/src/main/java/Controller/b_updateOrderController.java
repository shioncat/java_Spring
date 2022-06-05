package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;
import Model.Porder;

@WebServlet("/b_updateOrderController")
public class b_updateOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public b_updateOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*1.接收-->id-->queryId-->p
		 *2.修改物件-->p.setDesk 
		 *3.修改資料庫-->update(p);
		 *4.返回-->update.jsp 
		 */
		request.setCharacterEncoding("utf-8");
		String Id=request.getParameter("id");
		String DESK=request.getParameter("desk");
		int ID=Integer.parseInt(Id);
		
		List<Object> l=new porderDao().queryId(ID);
		Porder[] p=l.toArray(new Porder[l.size()]);
		
		p[0].setDesk(DESK);
		
		new porderDao().update(p[0]);
		
		response.sendRedirect("b_OrderUpdate.jsp");
		
	}

}