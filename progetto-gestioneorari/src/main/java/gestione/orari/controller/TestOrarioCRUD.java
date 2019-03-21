package gestione.orari.controller;

import java.time.LocalDateTime;

public class TestOrarioCRUD {

	public static void main(String[] args) {
		
		OrarioDidatticoController c1 = new OrarioDidatticoController();
		
		LocalDateTime giornoOraInizio = LocalDateTime.of(2019,6,8,00,00,00);
		LocalDateTime giornoOraFine = LocalDateTime.of(2019,7,8,00,00,00);
		c1.createSchedule(0, giornoOraInizio, giornoOraFine, 5);
	}

}
