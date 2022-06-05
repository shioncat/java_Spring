package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porderDao;
import Model.Porder;

@WebServlet("/b_addOrderController")
public class b_addOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public b_addOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		Porder p=(Porder) session.getAttribute("P");
		
		new porderDao().add(p);
		
		
		response.sendRedirect("b_OrderFinish.jsp");
	}

}