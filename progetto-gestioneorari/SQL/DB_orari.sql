CREATE DATABASE  IF NOT EXISTS `DB_orari`;
USE `DB_orari`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `Studente`;

CREATE TABLE `Studente` (
  `matricola` int(11) NOT NULL,
  `telefono` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `cognome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`matricola`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


