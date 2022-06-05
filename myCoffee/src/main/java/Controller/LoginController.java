package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;

//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*1.����
		 *2.query(�b��,�K�X)
		 *3.true--->loginSuccess.jsp
		 *4.false--->loginEror.jsp 
		 * 
		 */
		
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		if(new memberDao().query(Username, Password))
		{
			response.sendRedirect("a_loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("a_loginError.jsp");
		}
	}

}