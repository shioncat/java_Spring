package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;

@WebServlet("/b_deleteOrderController")
public class b_deleteOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public b_deleteOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID=Integer.parseInt(request.getParameter("id"));
		new porderDao().delete(ID);
		response.sendRedirect("b_OrderDelete.jsp");
	}

}