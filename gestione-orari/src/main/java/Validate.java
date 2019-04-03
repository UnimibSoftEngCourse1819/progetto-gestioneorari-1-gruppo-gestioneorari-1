import java.io.*;
import java.time.LocalDateTime;

import javax.servlet.*;
import javax.servlet.http.*;

import controller.CalendarController;

public class Validate extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			
			String year = request.getParameter("year");
			out.println("year");
			// LocalDateTime begin = LocalDateTime.parse(request.getParameter("begin"));
			// LocalDateTime end = LocalDateTime.parse(request.getParameter("end"));

			LocalDateTime begin = LocalDateTime.of(2080, 2, 9, 01, 00, 00);
			LocalDateTime end = LocalDateTime.of(2090, 3, 12, 01, 00, 00);

			CalendarController c1 = new CalendarController();
			c1.createCalendar(0, year, begin, end);
			out.println("year");
		} finally {
			out.close();
		}

	}
}