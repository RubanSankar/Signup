

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Helper")
public class Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int i; 
	HttpSession session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Userbean obj=new Userbean();
		//System.out.println((String)request.getParameter("fname"));
		
		//DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		obj.setMobilenumber((String)request.getParameter("pnum"));
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		
		
		if(obj.getMobilenumber()!=null)
		{
			obj.setFirstname((String)request.getParameter("fname"));
			obj.setLastName((String)request.getParameter("lname"));
			obj.setMailid((String)request.getParameter("mailid"));
			obj.setMobilenumber((String)request.getParameter("pnum"));
			obj.setAddress((String)request.getParameter("addr"));
			obj.setPassword((String)request.getParameter("pass"));
			//System.out.println(obj.getFirstName());

		if(UserDAO.signup(obj) )
		{

			String name=obj.getFirstName()+" "+obj.getLastname();
//			out.println("Sucessfully added you can log in");
			session=request.getSession();
		    session.setAttribute("name",name);
//			RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp"); 
//		 	rd.forward(request,response);
		    response.sendRedirect("/Welcome.jsp");
		}
		else
		{
			out.println("Account already Exists");
			RequestDispatcher rd=request.getRequestDispatcher("/"); 
		 	rd.include(request,response);
		 	//response.sendRedirect("/");
		}
		}
		else
		{
			response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
			  response.setHeader("Pragma","no-cache");
			  response.setHeader("Expires","0");
			  obj.setMailid((String)request.getParameter("user3"));
				//System.out.println(obj.getMailid());
				obj.setPassword((String)request.getParameter("pass3"));
			//System.out.println(obj.getMailid());
			if(UserDAO.login(obj))
				{
				//Userbean obj= new Userbean();
					//System.out.println(obj.getFirstName());
					String name=obj.getFirstName()+" "+obj.getLastname();
					
					session=request.getSession();
				    session.setAttribute("name",name);
				    response.setContentType("text/html");
				    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
				    //out.print("welcome" +name);
//				    RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp");
//				    rd.forward(request, response);
				    response.sendRedirect("/Welcome.jsp");
					
				}
				else
				{
					out.print("Invalid user id or password");
//					RequestDispatcher rd=request.getRequestDispatcher("/");
//				    rd.forward(request, response);
				    response.sendRedirect("/");
					
				}
		}
		
	}

}
