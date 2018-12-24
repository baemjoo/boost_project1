package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>presenttime</title></head>");
		out.println("<body>");
		out.println("<a href=\""+getServletContext().getContextPath()+"/index.html\">메인화면</a>");
		
		
		//현재 시간
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년M월d일ah시m분");
//		String pretime = now.format(dateTimeFormatter);
//		
//		int year = Integer.parseInt(pretime.substring(0, 4));
//		int month = Integer.parseInt(pretime.substring(5,6));
//		int mon_of_day = Integer.parseInt(pretime.substring(7,8));
//		String pa = pretime.substring(9,10);
//		
//		int hour = Integer.parseInt(pretime.substring(10,11));
//		int minute = Integer.parseInt(pretime.substring(13,14));
//		
//		out.println("현재 시간 : "+ year + month + pa + hour + minute);
		
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue();
		int day = currentDate.getDayOfMonth();
		
		LocalTime currentTime = LocalTime.now();
		int hour = currentTime.getHour();
		int minute = currentTime.getMinute();
		
		out.println("현재시간 : " +year+"/"+month+"/"+day+" "+hour+":"+minute);
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
