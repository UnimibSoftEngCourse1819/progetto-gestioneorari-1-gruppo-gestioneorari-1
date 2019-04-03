

import java.io.IOException;

import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CalendarController;

/**
 * Servlet implementation class firstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

		String year = request.getParameter("year");
		// LocalDateTime begin = LocalDateTime.parse(request.getParameter("begin"));
		// LocalDateTime end = LocalDateTime.parse(request.getParameter("end"));

		LocalDateTime begin = LocalDateTime.of(2080, 2, 9, 01, 00, 00);
		LocalDateTime end = LocalDateTime.of(2090, 3, 12, 01, 00, 00);

		CalendarController c1 = new CalendarController();
		c1.createCalendar(0, year, begin, end);
	}

}
