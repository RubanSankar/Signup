

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HttpSession session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		
		
		request.getSession(false);  
		if(session!=null)
		{	
			out.print("Welcome again "+session.getAttribute("name"));
			
//		    RequestDispatcher rd=request.getRequestDispatcher("/Welcome.html");
//		    rd.include(request, response);
		    response.sendRedirect("/Welcome.html");
		}
		
		else
		{
//			out.print("Log in first");
//			RequestDispatcher rd=request.getRequestDispatcher("/");
//		    rd.forward(request, response);
		    response.sendRedirect("/");
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		Userbean obj= new Userbean();
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		
		//System.out.println((String)request.getParameter("user3"));
		//System.out.println((String)request.getParameter("pass3"));
		
		//request.getParameter("userid1");
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/Helper");
		 rd.forward(request, response);
//		if(UserDAO.login(obj))
//		{
//			String name=obj.getFirstName()+" "+obj.getLastname();
//			out.print("Welcome, "+name); 
//			session=request.getSession();
//		    session.setAttribute("name",name);
//		    response.setContentType("text/html");
//		    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
//		   
//		    RequestDispatcher rd=request.getRequestDispatcher("/Welcome.html");
//		    rd.include(request, response);
//			
//		}
//		else
//		{
//			out.print("Invalid user id or password");
//			RequestDispatcher rd=request.getRequestDispatcher("/");
//		    rd.forward(request, response);
//			
//		}
		
		
		
		
	}

}
