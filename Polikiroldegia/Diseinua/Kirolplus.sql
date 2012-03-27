-- phpMyAdmin SQL Dump
-- version 3.3.2deb1ubuntu1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 27-03-2012 a las 11:35:00
-- Versión del servidor: 5.1.61
-- Versión de PHP: 5.3.2-1ubuntu4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Kirolplus`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Alokairua`
--

CREATE TABLE IF NOT EXISTS `Alokairua` (
  `bezeroID` varchar(9) NOT NULL,
  `dataOrdua` datetime NOT NULL,
  `instalazioID` int(11) NOT NULL,
  `oharra` varchar(250) DEFAULT 'Ez dago oharrik.',
  PRIMARY KEY (`bezeroID`),
  UNIQUE KEY `instalazioID` (`instalazioID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `Alokairua`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Bezeroa`
--

CREATE TABLE IF NOT EXISTS `Bezeroa` (
  `ID` varchar(9) NOT NULL,
  `izena` varchar(20) NOT NULL,
  `abizena` varchar(50) DEFAULT NULL,
  `emaila` varchar(50) NOT NULL,
  `pasahitza` varchar(250) NOT NULL,
  `jaioData` date NOT NULL,
  `aktibo` tinyint(1) NOT NULL,
  `tarifa` int(11) NOT NULL,
  `iraungitzeData` date NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `tarifa` (`tarifa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `Bezeroa`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eginDezake`
--

CREATE TABLE IF NOT EXISTS `eginDezake` (
  `monitoreID` varchar(9) NOT NULL,
  `espezialitateID` int(11) NOT NULL,
  PRIMARY KEY (`monitoreID`,`espezialitateID`),
  KEY `espezialitateID` (`espezialitateID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `eginDezake`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Espezialitatea`
--

CREATE TABLE IF NOT EXISTS `Espezialitatea` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `espezialitatea` varchar(200) DEFAULT 'Ez du deskribapenik.',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `Espezialitatea`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Instalazioa`
--

CREATE TABLE IF NOT EXISTS `Instalazioa` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `deskribapena` varchar(200) DEFAULT 'Ez dago.',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `Instalazioa`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Klasea`
--

CREATE TABLE IF NOT EXISTS `Klasea` (
  `kurtsoID` int(11) NOT NULL,
  `monitoreID` varchar(9) NOT NULL,
  `espezialitatea` int(11) NOT NULL,
  `bezeroID` varchar(9) NOT NULL,
  PRIMARY KEY (`kurtsoID`,`monitoreID`,`espezialitatea`,`bezeroID`),
  KEY `monitoreID` (`monitoreID`),
  KEY `espezialitatea` (`espezialitatea`),
  KEY `bezeroID` (`bezeroID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `Klasea`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Kurtsoa`
--

CREATE TABLE IF NOT EXISTS `Kurtsoa` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `izena` varchar(15) NOT NULL DEFAULT 'Ez du izenik',
  `deskribapena` varchar(200) NOT NULL DEFAULT 'Ez dago.',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `Kurtsoa`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Kurtso_Ordutegia`
--

CREATE TABLE IF NOT EXISTS `Kurtso_Ordutegia` (
  `kurtsoID` int(11) NOT NULL,
  `orduID` int(11) NOT NULL,
  PRIMARY KEY (`kurtsoID`,`orduID`),
  KEY `orduID` (`orduID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `Kurtso_Ordutegia`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Monitorea`
--

CREATE TABLE IF NOT EXISTS `Monitorea` (
  `ID` varchar(9) NOT NULL,
  `izena` varchar(30) NOT NULL,
  `abizena` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `Monitorea`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ordutegia`
--

CREATE TABLE IF NOT EXISTS `Ordutegia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `egunak` varchar(20) DEFAULT NULL,
  `orduTartea` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `Ordutegia`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Tarifa`
--

CREATE TABLE IF NOT EXISTS `Tarifa` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `mota` varchar(30) NOT NULL,
  `prezioa` float NOT NULL DEFAULT '0',
  `iraupena` int(11) NOT NULL,
  `alokairuMax` int(11) NOT NULL,
  `kurtsoMax` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `Tarifa`
--


--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `Alokairua`
--
ALTER TABLE `Alokairua`
  ADD CONSTRAINT `Alokairua_ibfk_2` FOREIGN KEY (`bezeroID`) REFERENCES `Bezeroa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Alokairua_ibfk_1` FOREIGN KEY (`instalazioID`) REFERENCES `Instalazioa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Bezeroa`
--
ALTER TABLE `Bezeroa`
  ADD CONSTRAINT `Bezeroa_ibfk_1` FOREIGN KEY (`tarifa`) REFERENCES `Tarifa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `eginDezake`
--
ALTER TABLE `eginDezake`
  ADD CONSTRAINT `eginDezake_ibfk_2` FOREIGN KEY (`espezialitateID`) REFERENCES `Espezialitatea` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `eginDezake_ibfk_1` FOREIGN KEY (`monitoreID`) REFERENCES `Monitorea` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Klasea`
--
ALTER TABLE `Klasea`
  ADD CONSTRAINT `Klasea_ibfk_4` FOREIGN KEY (`bezeroID`) REFERENCES `Bezeroa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Klasea_ibfk_1` FOREIGN KEY (`kurtsoID`) REFERENCES `Kurtsoa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Klasea_ibfk_2` FOREIGN KEY (`monitoreID`) REFERENCES `Monitorea` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Klasea_ibfk_3` FOREIGN KEY (`espezialitatea`) REFERENCES `Espezialitatea` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Kurtso_Ordutegia`
--
ALTER TABLE `Kurtso_Ordutegia`
  ADD CONSTRAINT `Kurtso_Ordutegia_ibfk_2` FOREIGN KEY (`orduID`) REFERENCES `Ordutegia` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Kurtso_Ordutegia_ibfk_1` FOREIGN KEY (`kurtsoID`) REFERENCES `Kurtsoa` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
