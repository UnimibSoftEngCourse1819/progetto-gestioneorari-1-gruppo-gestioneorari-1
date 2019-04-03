package orari;

import java.time.LocalDateTime;
import java.util.List;

import controller.TimetableController;
import model.Timetable;

public class TimetableControllerTEST {
//	private static final Logger logger = LogManager.getLogger(TestCalendarioCrud.class);

	public static void main(String[] args) {

		try {
			
			TimetableController c1 = new TimetableController();
						
				LocalDateTime giornoOraInizio = LocalDateTime.of(2050, 1, 8, 01, 00, 00);
				LocalDateTime giornoOraFine = LocalDateTime.of(2050, 2, 9, 01, 00, 00);
				c1.createTimetable(0, 1, giornoOraInizio, giornoOraFine);
					
				Timetable a = c1.getTimetableByID(2);
//			logger.info("id: " + sq.getId());
			
			List <Timetable> lista = c1.getAllTimetable();
			
			if(lista.isEmpty())
				System.out.println("Lista vuota");
			else
				System.out.println("Lista piena");
	
			giornoOraFine = LocalDateTime.of(2030, 12, 10, 01, 00, 00);
			giornoOraInizio = LocalDateTime.of(2030, 10, 8, 02, 00, 00);
			c1.updateTimetable(9, giornoOraInizio, giornoOraFine);
			c1.DeleteTimetable(12);
			
//			c1.DeleteAllSchedule();

		} finally {
			
		}
	}

}