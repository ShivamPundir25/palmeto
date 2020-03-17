

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	try {
		response.setContentType("text/html");
		PrintWriter pwriter=response.getWriter();
		String name=request.getParameter("userid");
		String password=request.getParameter("userpassword");
		pwriter.print("hello " +name);
		pwriter.print("your password is :" +password);
		
		//creating cokies
		Cookie c1=new Cookie("userid",name);
		Cookie c2=new Cookie("userpassword",password);
		c1.setMaxAge(10);
		//c2.setMaxAge(15);
		response.addCookie(c1);
		response.addCookie(c2);
		pwriter.close();
	}

	catch(Exception e) {System.out.println(e);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
