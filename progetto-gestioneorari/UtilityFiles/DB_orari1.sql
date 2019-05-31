-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema DB_orari1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DB_orari1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_orari1` DEFAULT CHARACTER SET utf8 ;
USE `DB_orari1` ;

-- -----------------------------------------------------
-- Table `DB_orari1`.`classroom`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_orari1`.`classroom` ;

CREATE TABLE IF NOT EXISTS `DB_orari1`.`classroom` (
  `classroom_id` VARCHAR(5) NOT NULL,
  `capacity` INT NULL DEFAULT 20,
  PRIMARY KEY (`classroom_id`))
ENGINE = InnoDB;
INSERT INTO `db_orari1`.`classroom`(`classroom_id`, `capacity`)VALUES("U201", 100);
INSERT INTO `db_orari1`.`classroom`(`classroom_id`, `capacity`)VALUES("U202", 100);
INSERT INTO `db_orari1`.`classroom`(`classroom_id`, `capacity`)VALUES("U203", 100);
INSERT INTO `db_orari1`.`classroom`(`classroom_id`, `capacity`)VALUES("U205", 100);
INSERT INTO `db_orari1`.`classroom`(`classroom_id`, `capacity`)VALUES("U206", 100);


-- -----------------------------------------------------
-- Table `DB_orari1`.`course`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_orari1`.`course` ;

CREATE TABLE IF NOT EXISTS `DB_orari1`.`course` (
  `course_id` VARCHAR(7) NOT NULL,
  `name` VARCHAR(45) NULL,
  `year` INT(1) NULL,
  `professor` VARCHAR(45) NULL,
  PRIMARY KEY (`course_id`))
ENGINE = InnoDB;
INSERT INTO `db_orari1`.`course`(`course_id`,`name`,`year`,`professor`)VALUES
("AR88", "statistica", 3, "Stella");
INSERT INTO `db_orari1`.`course`(`course_id`,`name`,`year`,`professor`)VALUES
("SB56", "architettura", 1, "Brondoni");
INSERT INTO `db_orari1`.`course`(`course_id`,`name`,`year`,`professor`)VALUES
("FR93", "cinese", 2, "Restelli");
INSERT INTO `db_orari1`.`course`(`course_id`,`name`,`year`,`professor`)VALUES
("NM97", "psicologia", 2, "Rossi");
INSERT INTO `db_orari1`.`course`(`course_id`,`name`,`year`,`professor`)VALUES
("DV96", "storia", 1, "Valmacco");

-- -----------------------------------------------------
-- Table `DB_orari1`.`timetable`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_orari1`.`timetable` ;

CREATE TABLE IF NOT EXISTS `DB_orari1`.`timetable` (
  `start` DATETIME NOT NULL,
  `end` DATETIME NOT NULL,
  `course_id` VARCHAR(45) NOT NULL,
  `classroom_id` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`start`, `end`, `classroom_id`, `course_id`),
  INDEX `classroom_id_idx` (`classroom_id` ASC),
  INDEX `course_id_idx` (`course_id` ASC),
  CONSTRAINT `classroom_id`
    FOREIGN KEY (`classroom_id`)
    REFERENCES `DB_orari1`.`classroom` (`classroom_id`)
    ON DELETE CASCADE
    ON UPDATE RESTRICT,
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `DB_orari1`.`course` (`course_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
INSERT INTO `db_orari1`.`timetable` (`start`,`end`,`course_id`,`classroom_id`)
VALUES ("2019-06-08 08:00:00", "2019-06-08 10:00:00", "AR88", "U206");
INSERT INTO `db_orari1`.`timetable` (`start`,`end`,`course_id`,`classroom_id`)
VALUES ("2019-06-08 08:00:00", "2019-06-08 10:00:00", "SB56", "U201");
INSERT INTO `db_orari1`.`timetable` (`start`,`end`,`course_id`,`classroom_id`)
VALUES ("2019-06-08 08:00:00", "2019-06-08 10:00:00", "FR93", "U202");
INSERT INTO `db_orari1`.`timetable` (`start`,`end`,`course_id`,`classroom_id`)
VALUES ("2019-06-08 00:00:00", "2019-06-08 10:00:00", "NM97", "U205");


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

