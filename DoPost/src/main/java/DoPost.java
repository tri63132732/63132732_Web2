

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DoPost
 */
public class DoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoPost() {
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
		TraVe.append("Ban vua gui yeu cau dang GET, day la dap ung cua toi");
		String NoiDungHTML=" <form method = POST action=\"/DoPost/DoPost\">"
				+ "<label>Họ: </label>"
				+ "<input type=\"text\" name=\"fname\"><br>"
				+ "<label>Tên: </label>"
				+ "<input type=\"text\" name=\"lname\"><br>"
				+ "<input type=\"submit\" value=\"Gửi di\">"
				+ "</form>";
		TraVe.append(NoiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String value1= request.getParameter("fname");
		String value2= request.getParameter("lname");
		PrintWriter TraVe = response.getWriter();
		TraVe.append("Ban vua gui yeu cau dang POST, day la dap ung cua toi \n");
		TraVe.append("\n Gia tri tham so fname:");
		TraVe.append(value1);
		TraVe.append("\n Gia tri tham so lname:");
		TraVe.append(value2);
	}

}
