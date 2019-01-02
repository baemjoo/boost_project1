package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime date = LocalDateTime.now();
		String text = date.format(timeFormatter);
		
		
		response.setContentType("text/html;charset=UTF-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>presenttime</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/aboutmecss.css\">");
		out.println("</head>");
		out.println("<body id=\"today\">");
		out.println("<p>");
		out.println("<a href=\""+request.getContextPath()+"/index.html\">메인화면</a>");
		out.println("</p>");
		out.println("<div class=\"content\">");
		out.println("<span>");
		out.println("<strong>");
		out.println(String.format("현재 시간 : %s", text));
		out.println("</strong>");
		out.println("</span>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
