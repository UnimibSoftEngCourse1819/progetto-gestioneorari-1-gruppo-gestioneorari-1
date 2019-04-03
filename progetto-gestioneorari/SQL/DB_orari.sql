-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema DB_orari
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `DB_orari` ;
-- -----------------------------------------------------
-- Schema DB_orari
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_orari` DEFAULT CHARACTER SET utf8 ;
USE `DB_orari` ;

-- -----------------------------------------------------
-- Table `DB_orari`.`Avviso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Avviso` (
  `idAvviso` INT NOT NULL AUTO_INCREMENT,
  `descrizione` VARCHAR(1000) NOT NULL,
  `idCorso` VARCHAR(14) NULL,
  PRIMARY KEY (`idAvviso`))
ENGINE = InnoDB;
insert into Avviso(idAvviso, descrizione, idCorso) VALUES (1,  'Funziona tutto', 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`Lezione`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Lezione` (
  `idLezione` INT NOT NULL AUTO_INCREMENT,
  `idCorso` INT(11) NOT NULL,
  `argomento` VARCHAR(140) NULL,
  PRIMARY KEY (`idLezione`))
ENGINE = InnoDB;
insert into Lezione(idLezione, idCorso, argomento) VALUES (1, 1, 'Ingegneria del sw');
-- -----------------------------------------------------
-- Table `DB_orari`.`Aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Aula` (
  `idAula` INT(11) NOT NULL,
  `nomeAula` VARCHAR(45) NOT NULL,
  `edificio` VARCHAR(45) NOT NULL,
  `capienza` INT NOT NULL,
  PRIMARY KEY (`idAula`))
ENGINE = InnoDB;
insert into Aula(idAula, nomeAula, edificio, capienza) VALUES (1, '02', 'U2', 180);
-- -----------------------------------------------------
-- Table `DB_orari`.`CorsoDiLaurea`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`CorsoDiLaurea` (
  `idCorsoDiLaurea` INT(11) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(400) NOT NULL,
  `durata` INT(11) NOT NULL,
  `tipologia` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCorsoDiLaurea`))
ENGINE = InnoDB;
insert into CorsoDiLaurea(idCorsoDiLaurea, nome, descrizione, durata, tipologia) VALUES (1, 'informatica', 'Bello', 3, 'tipologia');
-- -----------------------------------------------------
-- Table `DB_orari`.`Corso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Corso` (
  `idCorso` VARCHAR(14) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(45) NOT NULL,
  `idCorsoDiLaurea` INT(11) NULL,
  `annoDiCorso` INT(11) NOT NULL,
  INDEX `idCorsoDiLaurea_idx` (`idCorsoDiLaurea` ASC),
  PRIMARY KEY (`idCorso`),
  CONSTRAINT `idCorsoDiLaurea`
    FOREIGN KEY (`idCorsoDiLaurea`)
    REFERENCES `DB_orari`.`CorsoDiLaurea` (`idCorsoDiLaurea`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into Corso(idCorso, nome, descrizione, idCorsoDiLaurea, annoDiCorso) VALUES (1, 'ingegneria del SW', 'Bello', 1, 2);
-- -----------------------------------------------------
-- Table `DB_orari`.`Gruppo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Gruppo` (
  `idGruppo` INT NOT NULL,
  `Descrizione` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGruppo`))
ENGINE = InnoDB;
insert into Gruppo(idGruppo, descrizione) VALUES (1,'studente');
insert into Gruppo(idGruppo, descrizione) VALUES (2,'professore');
insert into Gruppo(idGruppo, descrizione) VALUES (3,'segretario');
insert into Gruppo(idGruppo, descrizione) VALUES (4,'bibliotecario');
insert into Gruppo(idGruppo, descrizione) VALUES (5,'collaboratoreEsterno');
-- -----------------------------------------------------
-- Table `DB_orari`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Persona` (
  `idPersona` INT(11) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `telefono` BIGINT(14) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `idGruppo` INT NOT NULL,
  INDEX `fk_ruolo_idx` (`idGruppo` ASC),
  PRIMARY KEY (`idPersona`),
  CONSTRAINT `fk_gruppo`
    FOREIGN KEY (`idGruppo`)
    REFERENCES `DB_orari`.`Gruppo` (`idGruppo`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into Persona(idPersona,nome,cognome, telefono, email, idGruppo) VALUES (124535,'ludovico','genoveffo', 3381234354, 'ludovico.genoveffo@gmail.com',1);
insert into Persona(idPersona,nome,cognome, telefono, email, idGruppo) VALUES (120035,'mauro','fibra', 3352378354,'ludovico.genoveffo@gmail.com',2);
insert into Persona(idPersona,nome,cognome, telefono, email, idGruppo) VALUES (124123,'tina','tatangelo', 3381967954,'ludovico.genoveffo@gmail.com', 3);
-- -----------------------------------------------------
-- Table `DB_orari`.`Esame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Esame` (
  `idEsame` INT(11) NOT NULL,
  `nomeEsame` VARCHAR(45) NOT NULL,
  `dataOraInizio` DATETIME NOT NULL,
  `dataOraFine` DATETIME NOT NULL,
  `numeroIscritti` INT(5) NULL,
  `idCorso` VARCHAR(14) NOT NULL,
  `idProfessore` INT(11) NOT NULL,
  PRIMARY KEY (`idEsame`),
  INDEX `idProfessoreFk_idx` (`idProfessore` ASC),
  INDEX `idCorso_FK_corso_idx` (`idCorso` ASC),
  CONSTRAINT `idCorso_FK_corso`
    FOREIGN KEY (`idCorso`)
    REFERENCES `DB_orari`.`Corso` (`idCorso`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idProfessore_fk_Persona`
    FOREIGN KEY (`idProfessore`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into Esame(idEsame, nomeEsame, dataOraInizio, dataOraFine, numeroIscritti, idCorso, idProfessore) VALUES (1,'Ingegneria del SW', '2019-06-08-00.00', '2019-06-08-01.00', 12, 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`IscrizioneEsame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`IscrizioneEsame` (
  `idIscrizioneEsame` INT NOT NULL AUTO_INCREMENT,
  `idEsame` INT(11) NOT NULL,
  `giornoOra` DATETIME NOT NULL,
  `idStudente` INT(11) NOT NULL,
  `scadenzaLimiteIscrizione` DATETIME NOT NULL,
  `note` VARCHAR(45) NULL,
  PRIMARY KEY (`idIscrizioneEsame`),
  INDEX `idEsame_idx` (`idEsame` ASC),
  INDEX `idStudenteFk_idx` (`idStudente` ASC),
  CONSTRAINT `idStudenteFkPersona`
    FOREIGN KEY (`idStudente`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idEsameFkEsame`
    FOREIGN KEY (`idEsame`)
    REFERENCES `DB_orari`.`Esame` (`idEsame`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into IscrizioneEsame(idIscrizioneEsame, idEsame, giornoOra, idStudente, scadenzaLimiteIscrizione, note) VALUES (1, 1, '2019-06-08-00.00', 785154, '2019-06-08-01.00', 'ciao');
-- -----------------------------------------------------
-- Table `DB_orari`.`PrenotazioneAula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`PrenotazioneAula` (
  `idPrenotazioneAula` INT NOT NULL AUTO_INCREMENT,
  `giornoOraInizio` DATETIME NOT NULL,
  `giornoOraFine` DATETIME NOT NULL,
  `idAula` INT(11) NOT NULL,
  `idProfessore` INT(11) NOT NULL,
  PRIMARY KEY (`idPrenotazioneAula`),
  INDEX `idAula_idx` (`idAula` ASC),
  INDEX `idProfessoreFk3_idx` (`idProfessore` ASC),
  CONSTRAINT `idProfessore_FkPersona`
    FOREIGN KEY (`idProfessore`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idAula_FkAula`
    FOREIGN KEY (`idAula`)
    REFERENCES `DB_orari`.`Aula` (`idAula`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into PrenotazioneAula(idPrenotazioneAula, giornoOraInizio, giornoOraFine, idAula,idProfessore) VALUES (1, '2019-06-08-00.00', '2019-06-08-01.00', 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`AulaLezione`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`AulaLezione` (
  `idAulaLezione` INT(11) NOT NULL,
  `idAula` INT(11) NOT NULL,
  `idLezione` INT(11) NOT NULL,
  INDEX `fkIdLezione_idx` (`idLezione` ASC),
  PRIMARY KEY (`idAulaLezione`),
  CONSTRAINT `fkIdAula`
    FOREIGN KEY (`idAula`)
    REFERENCES `DB_orari`.`Aula` (`idAula`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fkIdLezione`
    FOREIGN KEY (`idLezione`)
    REFERENCES `DB_orari`.`Lezione` (`idLezione`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into AulaLezione(idAulaLezione, idAula, idLezione) VALUES (1, 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`AulaEsame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`AulaEsame` (
  `idAulaEsame` INT NOT NULL AUTO_INCREMENT,
  `idAula` INT(11) NOT NULL,
  `idEsame` INT(11) NOT NULL,
  INDEX `fkIdAula_idx` (`idAula` ASC),
  INDEX `fkIdEsame_idx` (`idEsame` ASC),
  PRIMARY KEY (`idAulaEsame`),
  CONSTRAINT `idAulaFk4`
    FOREIGN KEY (`idAula`)
    REFERENCES `DB_orari`.`Aula` (`idAula`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idEsameFk4`
    FOREIGN KEY (`idEsame`)
    REFERENCES `DB_orari`.`Esame` (`idEsame`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into AulaEsame(idAulaEsame, idAula, idEsame) VALUES (1, 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`ProfessoreCorso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`ProfessoreCorso` (
  `idProfessoreCorso` INT(11) NOT NULL,
  `idProfessore` INT(11) NOT NULL,
  `idCorso` VARCHAR(14) NOT NULL,
  INDEX `idCorso_idx` (`idCorso` ASC),
  PRIMARY KEY (`idProfessoreCorso`),
  INDEX `idProfessoreFk5_idx` (`idProfessore` ASC),
  CONSTRAINT `idProfessoreFk5`
    FOREIGN KEY (`idProfessore`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idCorsoFk5`
    FOREIGN KEY (`idCorso`)
    REFERENCES `DB_orari`.`Corso` (`idCorso`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into ProfessoreCorso(idProfessoreCorso, idProfessore, idCorso) VALUES (1, 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`TipologiaRisorsa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`TipologiaRisorsa` (
  `idTipologiaRisorsa` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipologiaRisorsa`))
ENGINE = InnoDB;
insert into TipologiaRisorsa(idTipologiaRisorsa, nome, descrizione) VALUES (1, 'proiettore', 'proiettore');
-- -----------------------------------------------------
-- Table `DB_orari`.`Risorsa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Risorsa` (
  `idRisorsa` VARCHAR(40) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(45) NOT NULL,
  `idTipologiaRisorsa` INT NOT NULL,
  `commento` VARCHAR(300) NULL,
  PRIMARY KEY (`idRisorsa`),
  INDEX `fr_idTipologiaRisorsa_idx` (`idTipologiaRisorsa` ASC),
  CONSTRAINT `fr_idTipologiaRisorsa`
    FOREIGN KEY (`idTipologiaRisorsa`)
    REFERENCES `DB_orari`.`TipologiaRisorsa` (`idTipologiaRisorsa`)
    ON DELETE CASCADE
    ON UPDATE RESTRICT)
ENGINE = InnoDB;
insert into Risorsa(idRisorsa, nome, descrizione, idTipologiaRisorsa, commento) VALUES (1, 'proiettore', 'proiettore', 1, 'bello');
-- -----------------------------------------------------
-- Table `DB_orari`.`PrenotazioneRisorsa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`PrenotazioneRisorsa` (
  `idPrenotazioneRisorsa` INT NOT NULL AUTO_INCREMENT,
  `giornoOraInizio` DATETIME NOT NULL,
  `giornoOraFine` DATETIME NOT NULL,
  `idRisorsa` VARCHAR(40) NOT NULL,
  `idProfessore` INT(11) NOT NULL,
  INDEX `idProiettore_idx` (`idRisorsa` ASC),
  INDEX `idProfessore0_idx` (`idProfessore` ASC),
  PRIMARY KEY (`idPrenotazioneRisorsa`),
  CONSTRAINT `idProfessore0`
    FOREIGN KEY (`idProfessore`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idRisorsa`
    FOREIGN KEY (`idRisorsa`)
    REFERENCES `DB_orari`.`Risorsa` (`idRisorsa`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into PrenotazioneRisorsa(idPrenotazioneRisorsa, giornoOraInizio, giornoOraFine, idRisorsa, idProfessore) VALUES (1, '2019-06-08-00.00', '2019-06-08-01.00', 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`CalendarioDidattico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`CalendarioDidattico` (
  `idCalendarioDidattico` INT NOT NULL AUTO_INCREMENT,
  `nomeAnno` VARCHAR(45) NOT NULL,
  `inizioPeriodo` DATE NOT NULL,
  `finePeriodo` DATE NOT NULL,
  PRIMARY KEY (`idCalendarioDidattico`))
ENGINE = InnoDB;
insert into CalendarioDidattico(nomeAnno, inizioPeriodo, finePeriodo) VALUES ('secondo', '2020-06-08-01.00', '2021-06-08-01.00');
insert into CalendarioDidattico(nomeAnno, inizioPeriodo, finePeriodo) VALUES ('terzo', '2022-06-08-01.00', '2023-06-08-01.00');
-- -----------------------------------------------------
-- Table `DB_orari`.`OrarioDidattico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`OrarioDidattico` (
  `idOrarioDidattico` INT NOT NULL AUTO_INCREMENT,
  `giornoOraInizio` DATETIME NOT NULL,
  `giornoOraFine` DATETIME NOT NULL,
  `idLezione` INT(11) NOT NULL,
  PRIMARY KEY (`idOrarioDidattico`),
  INDEX `fkidLezione_idx` (`idLezione` ASC),
  CONSTRAINT `fkidLezione6`
    FOREIGN KEY (`idLezione`)
    REFERENCES `DB_orari`.`Lezione` (`idLezione`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into OrarioDidattico(idOrarioDidattico, giornoOraInizio, giornoOraFine, idLezione) VALUES (1, '2020-06-08-00.00', '2021-06-08-01.00', 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`LezioneCorso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`LezioneCorso` (
  `idCorso` VARCHAR(14) NOT NULL,
  `idLezione` INT(11) NOT NULL,
  `idLezioneCorso` INT(11) NOT NULL,
  INDEX `fk_idLezione_idx` (`idLezione` ASC),
  PRIMARY KEY (`idLezioneCorso`),
  CONSTRAINT `fk_idLezione`
    FOREIGN KEY (`idLezione`)
    REFERENCES `DB_orari`.`Lezione` (`idLezione`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `kf_idCorso`
    FOREIGN KEY (`idCorso`)
    REFERENCES `DB_orari`.`Corso` (`idCorso`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into LezioneCorso(idCorso, idLezione, idLezioneCorso) VALUES (1, 1, 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`Autenticazione`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`Autenticazione` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `idPersona` INT(11) NOT NULL,
  PRIMARY KEY (`username`),
  INDEX `fk_id_idx` (`idPersona` ASC),
  CONSTRAINT `fk_id`
    FOREIGN KEY (`idPersona`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into Autenticazione(username, password, idPersona) VALUES ('DB_orari', 'DB_orari', 1);
-- -----------------------------------------------------
-- Table `DB_orari`.`GestioneAvviso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`GestioneAvviso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idGestioneAvviso` INT NOT NULL,
  `idPersona` INT(11) NOT NULL,
  INDEX `fk_idPersona_idx` (`idPersona` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_idPersona`
    FOREIGN KEY (`idPersona`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
   ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `kf_idAvviso`
    FOREIGN KEY (`idGestioneAvviso`)
    REFERENCES `DB_orari`.`Avviso` (`idAvviso`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into Avviso(descrizione,idCorso) VALUES ('le lezioni sono sospese', 'E10104');
insert into Avviso(descrizione) VALUES ('domani autogestione');
-- -----------------------------------------------------
-- Table `DB_orari`.`GestioneCalendario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`GestioneCalendario` (
  `intGestioneCalendario` INT NOT NULL AUTO_INCREMENT,
  `idGestioneCalendario` INT NOT NULL,
  `idPersona` INT NOT NULL,
  INDEX `idPersona_fk_idx` (`idPersona` ASC),
  PRIMARY KEY (`intGestioneCalendario`),
  CONSTRAINT `idPersona_fk`
    FOREIGN KEY (`idPersona`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idCalendario_fk`
    FOREIGN KEY (`idGestioneCalendario`)
    REFERENCES `DB_orari`.`CalendarioDidattico` (`idCalendarioDidattico`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into GestioneCalendario(intGestioneCalendario, idGestioneCalendario, idPersona) VALUES (1, 1, 1);


-- -----------------------------------------------------
-- Table `DB_orari`.`GestioneOrario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_orari`.`GestioneOrario` (
  `idGstioneOrario` INT NOT NULL AUTO_INCREMENT,
  `idGestioneOrario` INT NOT NULL,
  `idSegretario` INT NOT NULL,
  INDEX `idOrario_fk_idx` (`idGestioneOrario` ASC),
  INDEX `idSegretario_fk_idx` (`idSegretario` ASC),
  PRIMARY KEY (`idGstioneOrario`),
  CONSTRAINT `idSegretario_fk`
    FOREIGN KEY (`idSegretario`)
    REFERENCES `DB_orari`.`Persona` (`idPersona`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `idOrario_fk`
    FOREIGN KEY (`idGestioneOrario`)
    REFERENCES `DB_orari`.`OrarioDidattico` (`idOrarioDidattico`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
insert into GestioneOrario(idGstioneOrario, idGestioneOrario, idSegretario) VALUES (1, 1, 1);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
