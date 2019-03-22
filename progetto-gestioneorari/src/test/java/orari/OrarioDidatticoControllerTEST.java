package orari;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import gestione.orari.entita.OrarioDidattico;
//
//public class OrarioDidatticoControllerTEST {
////	private static final Logger logger = LogManager.getLogger(TestCalendarioCrud.class);
//
//	public static void main(String[] args) {
//
//		try {
//			
//			OrarioDidatticoController c1 = new OrarioDidatticoController();
//						
//				LocalDateTime giornoOraInizio = LocalDateTime.of(2050, 1, 8, 01, 00, 00);
//				LocalDateTime giornoOraFine = LocalDateTime.of(2050, 2, 9, 01, 00, 00);
//				c1.createSchedule(0, giornoOraInizio, giornoOraFine, 1);
//					
//			OrarioDidattico a = c1.getScheduleByID(2);
////			logger.info("id: " + sq.getId());
//			
//			List <OrarioDidattico> lista = c1.getAllSchedule();
//			
//			if(lista.isEmpty())
//				System.out.println("Lista vuota");
//			else
//				System.out.println("Lista piena");
//	
//			giornoOraFine = LocalDateTime.of(2030, 12, 10, 01, 00, 00);
//			giornoOraInizio = LocalDateTime.of(2030, 10, 8, 02, 00, 00);
//			c1.updateSchedule(2, giornoOraInizio, giornoOraFine);
//			c1.DeleteSchedule(1);
//			
//			c1.DeleteAllSchedule();
//
//		} finally {
//			
//		}
//	}
//
//}