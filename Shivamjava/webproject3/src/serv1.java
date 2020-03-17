

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv1
 */
@WebServlet("/serv1")
public class serv1 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());

	/*  String name=request.getParameter("name");
String dept=request.getParameter("dept");
String desg=request.getParameter("desg"); */
	
	//no use to this this it is implicitly storing it
	
// from html we are getting values here using this mehtod

ServletContext cxt=getServletContext();
// bcoz rst dispather is in this class
RequestDispatcher rd=cxt.getRequestDispatcher("/serv2");
// toservlet chainingwe are creatting  rqst dispacther
/*
String mobile="9067";
String email="hari@gmail.com";
String comp="tcs";

request.setAttribute("comp",comp);
request.setAttribute("mobile",mobile);
request.setAttribute("email",email);
*/

/* request.setAttribute("name",name);
request.setAttribute("desg",desg);
request.setAttribute("dept",dept);*/

request.setAttribute("comp","cognizant");
request.setAttribute("mobile","497389473");
request.setAttribute("email","arvinf@fhj");

rd.forward(request, response);
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}
