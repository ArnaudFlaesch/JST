-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.7.9 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour jst
CREATE DATABASE IF NOT EXISTS `jst` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `jst`;


-- Export de la structure de table jst. action
CREATE TABLE IF NOT EXISTS `action` (
  `ActionID` int(11) NOT NULL AUTO_INCREMENT,
  `ActionDate` date DEFAULT NULL,
  `ActionHeure` time DEFAULT NULL,
  `ActionLibelle` varchar(1000) DEFAULT NULL,
  `ActionRedacteur` varchar(1000) DEFAULT NULL,
  `Evenement_EvenementID` int(11) NOT NULL,
  PRIMARY KEY (`ActionID`),
  KEY `fk_Actions_Evenement1_idx` (`Evenement_EvenementID`),
  CONSTRAINT `fk_Actions_Evenement1` FOREIGN KEY (`Evenement_EvenementID`) REFERENCES `evenement` (`EvenementID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. apparence
CREATE TABLE IF NOT EXISTS `apparence` (
  `ApparenceID` int(11) NOT NULL AUTO_INCREMENT,
  `ApparenceLogoChemin` varchar(1000) DEFAULT NULL,
  `ApparencePoliceNom` varchar(1000) DEFAULT NULL,
  `ApparenceBanniereChemin` varchar(1000) DEFAULT NULL,
  `ApparenceCouleurTexteBanniere` varchar(1000) DEFAULT NULL,
  `ApparenceCouleurFondListe` varchar(1000) DEFAULT NULL,
  `ApparenceCouleurTexteListe` varchar(1000) DEFAULT NULL,
  `ApparenceCouleurFondAjout` varchar(1000) DEFAULT NULL,
  `Hotel_HotelID` int(11) NOT NULL,
  PRIMARY KEY (`ApparenceID`),
  KEY `fk_Apparence_Hotel1_idx` (`Hotel_HotelID`),
  CONSTRAINT `fk_Apparence_Hotel1` FOREIGN KEY (`Hotel_HotelID`) REFERENCES `hotel` (`HotelID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. categorieevenement
CREATE TABLE IF NOT EXISTS `categorieevenement` (
  `CategorieEvenementID` int(11) NOT NULL AUTO_INCREMENT,
  `CategorieEvenementLibelle` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`CategorieEvenementID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. categorieoffert
CREATE TABLE IF NOT EXISTS `categorieoffert` (
  `CategorieOffertID` int(11) NOT NULL AUTO_INCREMENT,
  `CategorieOffertLibelle` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`CategorieOffertID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. cause
CREATE TABLE IF NOT EXISTS `cause` (
  `CauseID` int(11) NOT NULL AUTO_INCREMENT,
  `CauseLibelle` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`CauseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. chambre
CREATE TABLE IF NOT EXISTS `chambre` (
  `ChambreID` int(11) NOT NULL AUTO_INCREMENT,
  `ChambreNumero` int(11) DEFAULT NULL,
  `ChambreLibelle` varchar(1000) DEFAULT NULL,
  `Hotel_HotelID` int(11) NOT NULL,
  PRIMARY KEY (`ChambreID`),
  KEY `fk_Chambre_Hotel1_idx` (`Hotel_HotelID`),
  CONSTRAINT `fk_Chambre_Hotel1` FOREIGN KEY (`Hotel_HotelID`) REFERENCES `hotel` (`HotelID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. client
CREATE TABLE IF NOT EXISTS `client` (
  `ClientID` int(11) NOT NULL AUTO_INCREMENT,
  `ClientArrivee` date DEFAULT NULL,
  `ClientDepart` date DEFAULT NULL,
  `ClientNom` varchar(1000) DEFAULT NULL,
  `ClientPrenom` varchar(1000) DEFAULT NULL,
  `ClientAgence` varchar(1000) DEFAULT NULL,
  `ClientSociete` varchar(1000) DEFAULT NULL,
  `ClientPrix` int(11) DEFAULT NULL,
  `ClientCodeReservation` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ClientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. evenement
CREATE TABLE IF NOT EXISTS `evenement` (
  `EvenementID` int(11) NOT NULL AUTO_INCREMENT,
  `EvenementDate` date DEFAULT NULL,
  `EvenementHeure` time DEFAULT NULL,
  `EvenementIntitule` varchar(1000) DEFAULT NULL,
  `EvenementDescription` varchar(1000) DEFAULT NULL,
  `EvenementRedacteur` varchar(1000) DEFAULT NULL,
  `EvenementNotePMS` tinyint(1) DEFAULT NULL,
  `EvenementStatut` tinyint(1) DEFAULT '0',
  `CategorieEvenement_CategorieEvenementID` int(11) NOT NULL DEFAULT '1',
  `Cause_CauseID` int(11) NOT NULL,
  `Chambre_ChambreID` int(11) NOT NULL,
  `Client_ClientID` int(11) NOT NULL,
  `Hotel_HotelID` int(11) NOT NULL,
  `Humeur_HumeurID` int(11) NOT NULL,
  PRIMARY KEY (`EvenementID`),
  KEY `fk_Evenement_Hotel1_idx` (`Hotel_HotelID`),
  KEY `fk_Evenement_Cause1_idx` (`Cause_CauseID`),
  KEY `fk_Evenement_Chambre1_idx` (`Chambre_ChambreID`),
  KEY `fk_Evenement_Humeur1_idx` (`Humeur_HumeurID`),
  KEY `fk_Evenement_CategorieEvenement1_idx` (`CategorieEvenement_CategorieEvenementID`),
  KEY `fk_Evenement_Client1_idx` (`Client_ClientID`),
  CONSTRAINT `fk_Evenement_CategorieEvenement1` FOREIGN KEY (`CategorieEvenement_CategorieEvenementID`) REFERENCES `categorieevenement` (`CategorieEvenementID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Cause1` FOREIGN KEY (`Cause_CauseID`) REFERENCES `cause` (`CauseID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Chambre1` FOREIGN KEY (`Chambre_ChambreID`) REFERENCES `chambre` (`ChambreID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Client1` FOREIGN KEY (`Client_ClientID`) REFERENCES `client` (`ClientID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Hotel1` FOREIGN KEY (`Hotel_HotelID`) REFERENCES `hotel` (`HotelID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Humeur1` FOREIGN KEY (`Humeur_HumeurID`) REFERENCES `humeur` (`HumeurID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. hotel
CREATE TABLE IF NOT EXISTS `hotel` (
  `HotelID` int(11) NOT NULL AUTO_INCREMENT,
  `HotelName` varchar(1000) DEFAULT NULL,
  `HotelSMTP` varchar(1000) DEFAULT NULL,
  `HotelPort` int(11) DEFAULT NULL,
  `HotelMailSenderLogin` varchar(1000) DEFAULT NULL,
  `HotelMailSenderMotdePasse` varchar(1000) DEFAULT NULL,
  `HotelFrom` varchar(1000) DEFAULT NULL,
  `HotelOutilNom` varchar(1000) DEFAULT NULL,
  `HotelPMS_Nom` varchar(1000) DEFAULT NULL,
  `HotelPMS_Link` varchar(1000) DEFAULT NULL COMMENT 'Property Management System\nChemin d''accès au fichier d''import (si il existe)\nSi il est vide, il n''y a pas d''import.',
  PRIMARY KEY (`HotelID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. humeur
CREATE TABLE IF NOT EXISTS `humeur` (
  `HumeurID` int(11) NOT NULL AUTO_INCREMENT,
  `HumeurLibelle` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`HumeurID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. offert
CREATE TABLE IF NOT EXISTS `offert` (
  `OffertID` int(11) NOT NULL AUTO_INCREMENT,
  `OffertMontant` int(11) DEFAULT NULL,
  `OffertPar` varchar(1000) DEFAULT NULL,
  `OffertRedacteur` varchar(1000) DEFAULT NULL,
  `OffertDescription` varchar(1000) DEFAULT NULL,
  `CategorieOffert_CategorieOffertID` int(11) NOT NULL,
  `Evenement_EvenementID` int(11) NOT NULL,
  PRIMARY KEY (`OffertID`),
  KEY `fk_Offerts_CatégorieOffert1_idx` (`CategorieOffert_CategorieOffertID`),
  KEY `fk_Offerts_Evenement1_idx` (`Evenement_EvenementID`),
  CONSTRAINT `fk_Offerts_CatégorieOffert1` FOREIGN KEY (`CategorieOffert_CategorieOffertID`) REFERENCES `categorieoffert` (`CategorieOffertID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offerts_Evenement1` FOREIGN KEY (`Evenement_EvenementID`) REFERENCES `evenement` (`EvenementID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. reservation
CREATE TABLE IF NOT EXISTS `reservation` (
  `ClientID` int(11) NOT NULL AUTO_INCREMENT,
  `ARRIVAL` date DEFAULT NULL,
  `DEPARTURE` date DEFAULT NULL,
  `ROOM` int(11) DEFAULT NULL,
  `NAME` varchar(1000) DEFAULT NULL,
  `FIRST_GUEST_NAME` varchar(1000) DEFAULT NULL,
  `SHARED_YN` varchar(1000) DEFAULT NULL COMMENT 'N° de résa,clé pas forcément unique,Y = shared',
  `ADULTS` int(11) DEFAULT NULL,
  `ROOM_CATEGORY_LABEL` varchar(1000) DEFAULT NULL COMMENT 'Libellé de la catégorie de chambre (standard,suite...)',
  `RATE_CODE` varchar(1000) DEFAULT NULL COMMENT 'Code tarifaire',
  `PRODUCTS` varchar(1000) DEFAULT NULL,
  `EFFECTIVE_RATE_AMOUNT` int(11) DEFAULT NULL COMMENT 'Prix de la chambre (par nuits) TTC',
  `RESV_STATUS` varchar(1000) DEFAULT NULL COMMENT 'Statut de la réservation (checked in,out, due in,out,cancelled,no show,reserved.\n\nOn ne s''occupe pas de cancelled et no show.',
  `COMPANY_NAME` varchar(1000) DEFAULT NULL COMMENT 'Nom de la société ou de l''agence',
  `TRAVEL_AGENT_NAME` varchar(1000) DEFAULT NULL,
  `SPECIAL_REQUEST` varchar(1000) DEFAULT NULL,
  `BALANCE` int(11) DEFAULT NULL,
  `Hotel_HotelID` int(11) NOT NULL,
  PRIMARY KEY (`ClientID`),
  KEY `fk_Import_Hotel1_idx` (`Hotel_HotelID`),
  CONSTRAINT `fk_Import_Hotel1` FOREIGN KEY (`Hotel_HotelID`) REFERENCES `hotel` (`HotelID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. role
CREATE TABLE IF NOT EXISTS `role` (
  `RoleID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleLibelle` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.


-- Export de la structure de table jst. utilisateur
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `UtilisateurID` int(11) NOT NULL AUTO_INCREMENT,
  `UtilisateurNom` varchar(1000) DEFAULT NULL,
  `UtilisateurPrenom` varchar(1000) DEFAULT NULL,
  `UtilisateurLogin` varchar(1000) DEFAULT NULL,
  `UtilisateurMotdePasse` varchar(1000) DEFAULT NULL,
  `UtilisateurStatutValue` tinyint(1) DEFAULT '1',
  `UtilisateurEmail` varchar(1000) DEFAULT NULL,
  `Hotel_HotelID` int(11) NOT NULL,
  `Role_RoleID` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`UtilisateurID`),
  KEY `fk_Utilisateur_Hotel1_idx` (`Hotel_HotelID`),
  KEY `fk_Utilisateur_Roles1_idx` (`Role_RoleID`),
  CONSTRAINT `fk_Utilisateur_Hotel1` FOREIGN KEY (`Hotel_HotelID`) REFERENCES `hotel` (`HotelID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Utilisateur_Roles1` FOREIGN KEY (`Role_RoleID`) REFERENCES `role` (`RoleID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- L'exportation de données n'était pas sélectionnée.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
