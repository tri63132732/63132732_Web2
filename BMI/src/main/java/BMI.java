

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
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
		String NoiDungHTML=" <form method = POST action=\"/BMI/BMI\">"
				+ "<label>Chiều cao (cm): </label>"
				+ "<input type=\"text\" name=\"height\"><br>"
				+ "<label>Cân nặng (kg): </label>"
				+ "<input type=\"text\" name=\"weight\"><br>"
				+ "<input type=\"submit\" value=\"submit\">"
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
		String value1= request.getParameter("height");
		String value2= request.getParameter("weight");
		PrintWriter TraVe = response.getWriter();
		TraVe.append("BMI:");
		Float bmi = Float.parseFloat(value2)/((Float.parseFloat(value1)/100)*(Float.parseFloat(value1)/100));
		String BMI = String.valueOf(bmi);
		TraVe.append(BMI);
		if(bmi<18.5) TraVe.append("\nNhẹ cân");
		else if(bmi<24.9) TraVe.append("\nBình thường");
		else if(bmi<29.9) TraVe.append("\nThừa cân");
		else TraVe.append("\nBéo phì");
	}

}
