package orari;

import java.time.LocalDateTime;
import java.util.List;

import controller.CalendarController;
import model.Calendar;

public class CalendarControllerTEST {
//	private static final Logger logger = LogManager.getLogger(TestCalendarioCrud.class);

	public static void main(String[] args) {

		try {
			
			CalendarController c1 = new CalendarController();
			LocalDateTime giornoOraInizio = LocalDateTime.of(2050, 1, 8, 01, 00, 00);
			LocalDateTime giornoOraFine = LocalDateTime.of(2050, 2, 9, 01, 00, 00);
			
			c1.createCalendar(0, "primo", giornoOraInizio, giornoOraFine);
			
			Calendar a = c1.getCalendarByID(2);
//			logger.info("id: " + sq.getId());
			
			List <Calendar> lista = c1.getAllCalendar();
			
			if(lista.isEmpty())
				System.out.println("Lista vuota");
			else
				System.out.println("Lista piena");
			
			c1.updateCalendarYear(2, "dodicesimo");
	
			giornoOraFine = LocalDateTime.of(2030, 12, 10, 01, 00, 00);
			giornoOraInizio = LocalDateTime.of(2030, 10, 8, 02, 00, 00);
			c1.updateCalendar(2, giornoOraInizio, giornoOraFine);

		} finally {
			
		}
	}

}
