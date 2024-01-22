

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMe
 */
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter TraVe = response.getWriter();
		String NoiDungHTML="<table border=\"3\">"
				+"<tr>"
				+"<td rowspan=\"4\"> <img src=\"images/63132732.jpg\" height=\"100px\"></td>"
				+"</tr>"
				+"<tr>"
				+"<td> <p>Tên: Nguyễn Trọng Trí</p> </td>"
				+"</tr>"
				+"<tr>"
				+"<td> <p>MSSV: 63132732 </p> </td>"
				+"</tr>"
				+"<tr>"
				+"<td> <p>Lớp: 63CNTT-CLC </p> </td>"
				+"</tr>";
		TraVe.append(NoiDungHTML);
	}

}
