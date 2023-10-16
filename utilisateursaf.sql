-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 16 Octobre 2023 à 16:37
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `utilisateursaf`
--

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `identifiant` varchar(255) NOT NULL,
  `date_naissance` datetime DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `nationalite` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`identifiant`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`identifiant`, `date_naissance`, `gender`, `nationalite`, `nom`, `prenom`, `telephone`) VALUES
('AFKLM123', '1989-06-16 00:00:00', 'none', 'french', 'MARTIN', 'MARTIN', ''),
('AFKLM586', '1994-07-04 00:00:00', 'masculin', 'french', 'TAKOUI', 'Salah-Eddine', '0655555555');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
