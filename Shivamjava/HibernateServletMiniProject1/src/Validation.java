
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String UserId=request.getParameter("UserId");
		String Password=request.getParameter("Password");
		
		String Type = null,Username;
		int flag=0;
		
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
		
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapping","root","root");
			String querry="Select * from Login where UserId=?";
			
			PreparedStatement pst=connection.prepareStatement(querry);
			pst.setString(1,UserId);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{
				//out.println("venkattttaaa");
				if(rs.getString(3).equals(Password))
				{
					flag=1;
					Username=rs.getString(2);
					Type=rs.getString(4);
				}
			}
			else out.print("invalid creds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e);
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
