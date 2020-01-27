

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		
		  response.setContentType("text/html");  
        //  PrintWriter out=response.getWriter();   
          HttpSession session=request.getSession(false);  
          session.invalidate();     
          //out.print("You are successfully logged out!");  
          RequestDispatcher rd=request.getRequestDispatcher("/Logout.jsp");
		  rd.forward(request, response);
	}

}
