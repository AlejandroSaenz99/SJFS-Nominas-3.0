-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 07-06-2022 a las 18:16:57
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `u524173526_isamar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL,
  `Usuario` varchar(100) NOT NULL,
  `Fecha` varchar(100) NOT NULL,
  `Hora` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`id`, `Usuario`, `Fecha`, `Hora`) VALUES
(2, 'Perla Ruby Saenz Saldivar', '29/05/2022', '17:32:20.369'),
(3, 'Perla Ruby Saenz Saldivar', '29/05/2022', '17:39:59.699'),
(4, 'Jesus Saenz', '31/05/2022', '11:19:01.452'),
(5, 'Jesus Saenz', '31/05/2022', '12:38:08.961');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camion`
--

DROP TABLE IF EXISTS `camion`;
CREATE TABLE IF NOT EXISTS `camion` (
  `Id` int(11) NOT NULL,
  `Brand` varchar(100) NOT NULL,
  `Model` varchar(100) NOT NULL,
  `Owner` varchar(100) NOT NULL,
  `Percentage` float NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `camion`
--

INSERT INTO `camion` (`Id`, `Brand`, `Model`, `Owner`, `Percentage`) VALUES
(1, 'International ProStar', '800-LF687', 'Santa Julia Freight Services LLC', 7),
(2, 'Kenworth ', '801-T2000', 'Santa Julia Freight Services LLC', 7),
(3, 'FREIGHTLINER   ', '804-FREIGHTLINER', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 7),
(4, 'INTERNATIONAL  ', '805', 'ADRIAN MONGE RODRIGUEZ', 4),
(5, 'FREIGHTLINER ', '806-CASCADIA', 'ADRIAN MONGE RODRIGUEZ', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
--

DROP TABLE IF EXISTS `chofer`;
CREATE TABLE IF NOT EXISTS `chofer` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Porcentage` int(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `chofer`
--

INSERT INTO `chofer` (`Id`, `First_Name`, `Last_Name`, `Porcentage`) VALUES
(1, 'Roman', 'Martinez', 32),
(2, 'Guadalupe', 'Quinones Pando', 27),
(3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 27),
(4, 'ADRIAN', 'MONJE RODRIGUEZ', 27),
(5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', 30),
(6, 'Jose', 'Avila', 30),
(7, 'Gabriel', 'Ponce Rodriguez', 27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deducciones_camion`
--

DROP TABLE IF EXISTS `deducciones_camion`;
CREATE TABLE IF NOT EXISTS `deducciones_camion` (
  `Id` int(11) NOT NULL,
  `Truck_Id` int(11) NOT NULL,
  `Period` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Owner` varchar(100) NOT NULL,
  `Truck` varchar(100) NOT NULL,
  `Amount` float NOT NULL,
  `Description` varchar(1000) NOT NULL,
  `Year` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `deducciones_camion`
--

INSERT INTO `deducciones_camion` (`Id`, `Truck_Id`, `Period`, `Date`, `Owner`, `Truck`, `Amount`, `Description`, `Year`) VALUES
(1, 1, 9, 'Sun Mar 13 17:51:47 MST 2022', 'Santa Julia Freight Services LLC', '800-LF687', 650.44, 'Diesel', 2022),
(2, 1, 9, 'Sun Mar 13 17:53:33 MST 2022', 'Santa Julia Freight Services LLC', '800-LF687', 97.3484, 'SJFS', 2022),
(4, 1, 9, 'Sun Mar 13 17:55:29 MST 2022', 'Santa Julia Freight Services LLC', '800-LF687', 685.719, 'truck maintenance', 2022),
(5, 5, 9, 'Sun Mar 13 18:28:29 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 375.53, 'Driver Pay', 2022),
(6, 5, 9, 'Sun Mar 13 18:29:41 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 97.3597, 'SJFS', 2022),
(7, 5, 9, 'Sun Mar 13 18:31:24 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 601.14, 'Diesel', 2022),
(8, 5, 10, 'Fri Mar 18 19:12:09 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 180, 'Trailer Fee', 2022),
(9, 5, 10, 'Fri Mar 18 11:13:35 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 1094.74, 'Driver pay', 2022),
(10, 5, 10, 'Fri Mar 18 11:15:27 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 109.474, 'SJFS', 2022),
(11, 3, 10, 'Fri Mar 18 11:17:44 MST 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 615.826, 'Driver Pay', 2022),
(17, 3, 10, 'Fri Mar 18 18:58:34 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 186.735, 'SJFS', 2022),
(16, 3, 10, 'Fri Mar 18 09:45:59 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 180, 'Trailer Fee', 2022),
(14, 1, 10, 'Fri Mar 18 11:21:23 MST 2022', 'Santa Julia Freight Services LLC', '800-LF687', 166.034, 'Driver Pay', 2022),
(15, 1, 10, 'Fri Mar 18 11:21:56 MST 2022', 'Santa Julia Freight Services LLC', '800-LF687', 36.32, 'SJFS', 2022),
(18, 2, 11, 'Fri Mar 25 19:07:18 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 474.307, 'Driver Pay', 2022),
(19, 2, 11, 'Fri Mar 25 19:09:31 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 143.823, 'SJFS', 2022),
(20, 2, 11, 'Fri Mar 25 19:09:55 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1000, 'Aseguranza', 2022),
(21, 2, 11, 'Fri Mar 25 19:10:34 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 140, 'Trailer Fee', 2022),
(22, 2, 11, 'Fri Mar 25 19:18:07 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 279.3, 'Diesel', 2022),
(23, 4, 11, 'Fri Mar 25 19:36:40 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 63.9543, 'SJFS', 2022),
(24, 4, 11, 'Fri Mar 25 19:37:12 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 140, 'Trailer Fee', 2022),
(25, 4, 11, 'Fri Mar 25 19:39:10 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 583.264, 'Driver Pay', 2022),
(26, 4, 11, 'Fri Mar 25 19:40:22 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 1000, 'Aseguranza', 2022),
(27, 4, 11, 'Fri Mar 25 19:41:06 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 100, 'truck inspection', 2022),
(28, 4, 11, 'Fri Mar 25 19:41:42 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 54.75, 'Permiso', 2022),
(29, 3, 11, 'Fri Mar 25 20:14:51 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 181.779, 'SJFS', 2022),
(30, 3, 11, 'Fri Mar 25 20:16:49 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 599.48, 'Driver Pay', 2022),
(31, 3, 11, 'Fri Mar 25 20:17:43 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 140, 'Trailer Fee', 2022),
(81, 3, 13, 'Wed Apr 13 09:16:51 MDT 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 300, 'Aseguranza', 2022),
(33, 3, 11, 'Fri Mar 25 20:36:41 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 165, 'Cambio de llanta', 2022),
(34, 3, 11, 'Fri Mar 25 20:37:12 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 10, 'Permiso de NM', 2022),
(35, 3, 11, 'Fri Mar 25 20:37:36 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 66.71, 'Refrigerador', 2022),
(36, 3, 11, 'Fri Mar 25 20:38:25 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 100, 'truck inspection', 2022),
(37, 3, 11, 'Fri Mar 25 20:38:47 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 54.75, 'Permiso', 2022),
(38, 3, 11, 'Fri Mar 25 20:43:53 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 82.34, 'Diesel', 2022),
(39, 5, 11, 'Fri Mar 25 21:10:21 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 1000, 'Aseguranza', 2022),
(50, 5, 11, 'Fri Mar 25 21:35:50 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 779.722, 'Driver Pay', 2022),
(41, 5, 11, 'Fri Mar 25 21:12:11 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 91.1955, 'SJFS', 2022),
(42, 5, 11, 'Fri Mar 25 21:13:46 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 100, 'truck inspection', 2022),
(43, 5, 11, 'Fri Mar 25 21:14:10 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 54.75, 'Permiso', 2022),
(44, 2, 11, 'Fri Mar 25 18:25:41 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1801.26, 'Diesel', 2022),
(45, 1, 11, 'Fri Mar 25 09:38:15 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 10, 'Permiso de NM', 2022),
(46, 1, 11, 'Fri Mar 25 09:38:56 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 346.7, 'Diesel', 2022),
(47, 1, 11, 'Fri Mar 25 09:56:08 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 570.786, 'Driver Pay', 2022),
(48, 1, 11, 'Fri Mar 25 09:57:23 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 146.035, 'SJFS', 2022),
(49, 1, 11, 'Fri Mar 25 11:00:02 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 1000, 'Aseguranza', 2022),
(51, 1, 13, 'Thu Mar 31 20:35:22 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 1555, 'Aseguranza', 2022),
(52, 1, 13, 'Thu Mar 31 20:36:25 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 640.24, 'Driver pay', 2022),
(53, 1, 13, 'Thu Mar 31 00:00:00 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 163.804, 'SJFS', 2022),
(54, 1, 13, 'Thu Mar 31 20:37:44 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 140, 'Trailer Fee', 2022),
(55, 1, 13, 'Thu Mar 31 20:44:42 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 47.43, 'Helflo', 2022),
(80, 3, 11, 'Wed Apr 13 09:15:44 MDT 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 300, 'Aseguranza', 2022),
(74, 4, 14, 'Fri Apr 08 14:13:29 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 118.51, 'SJFS', 2022),
(57, 4, 13, 'Thu Mar 31 21:01:17 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 1450.24, 'Driver Pay', 2022),
(58, 4, 13, 'Thu Mar 31 21:02:43 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 159.017, 'SJFS', 2022),
(59, 4, 13, 'Thu Mar 31 21:03:38 MST 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 140, 'Trailer Fee', 2022),
(61, 5, 13, 'Thu Mar 31 21:28:34 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 1327.32, 'Driver Pay', 2022),
(62, 5, 13, 'Thu Mar 31 21:29:08 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 155.242, 'SJFS', 2022),
(63, 5, 13, 'Thu Mar 31 21:29:34 GMT-06:00 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 280, 'Trailer Fee', 2022),
(82, 3, 10, 'Wed Apr 13 09:27:33 MDT 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 300, 'Aseguranza', 2022),
(65, 3, 13, 'Thu Mar 31 22:09:25 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 984.234, 'Driver Pay', 2022),
(66, 3, 13, 'Thu Mar 31 22:10:02 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 298.446, 'SJFS', 2022),
(67, 3, 13, 'Thu Mar 31 22:10:39 GMT-06:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 140, 'Trailer Fee', 2022),
(68, 2, 13, 'Thu Mar 31 22:19:12 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 900.2, 'Diesel', 2022),
(69, 2, 13, 'Thu Mar 31 22:20:56 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 857.321, 'Driver Pay', 2022),
(70, 2, 13, 'Thu Mar 31 22:21:31 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1555, 'Aseguranza', 2022),
(71, 2, 13, 'Thu Mar 31 22:22:03 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 259.963, 'SJFS', 2022),
(72, 2, 13, 'Thu Mar 31 22:22:24 GMT-06:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 140, 'Trailer Fee', 2022),
(73, 3, 13, 'Thu Mar 31 09:58:24 MST 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER   ', 805, 'Diesel', 2022),
(75, 4, 14, 'Fri Apr 08 14:20:44 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 280, 'Trailer Fee', 2022),
(76, 4, 14, 'Fri Apr 08 14:21:16 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 159.017, 'SJFS', 2022),
(77, 4, 14, 'Fri Apr 08 14:24:17 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 1080.82, 'Driver pay', 2022),
(78, 5, 14, 'Fri Apr 08 14:25:51 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 420, 'Trailer Fee', 2022),
(79, 5, 14, 'Fri Apr 08 14:28:06 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '806-CASCADIA ', 155.242, 'SJFS', 2022),
(89, 3, 18, 'Mon May 09 18:45:18 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 2191.8, 'Diesel', 2022),
(84, 3, 18, 'Tue May 10 08:59:47 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 325, 'Aseguranza', 2022),
(85, 3, 18, 'Tue May 10 09:00:10 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 75, 'Decals', 2022),
(86, 3, 18, 'Tue May 10 09:00:44 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 200, 'Portion Plates', 2022),
(87, 3, 18, 'Wed May 18 09:03:01 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Chassis', 2022),
(88, 3, 18, 'Tue May 10 09:03:42 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Trailer Fee', 2022),
(101, 3, 18, 'Tue May 10 20:02:22 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 721.47, 'Otro', 2022),
(91, 1, 18, 'Tue May 10 10:06:09 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 917.54, 'Diesel', 2022),
(139, 3, 19, 'Sat May 14 21:47:13 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 2979.09, 'Diesel', 2022),
(93, 1, 18, 'Tue May 10 10:08:07 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 325, 'Aseguranza', 2022),
(94, 1, 18, 'Tue May 10 10:08:29 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Chassis', 2022),
(95, 1, 18, 'Tue May 10 10:09:08 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 75, 'Decals', 2022),
(96, 1, 18, 'Tue May 10 10:09:36 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 200, 'Portion Plates', 2022),
(97, 1, 18, 'Tue May 10 10:10:24 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Trailer Fee', 2022),
(102, 1, 18, 'Wed May 11 09:04:38 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 1597.58, 'Driver Pay', 2022),
(99, 3, 18, 'Tue May 10 10:14:55 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 1997.73, 'Driver Pay', 2022),
(100, 1, 18, 'Tue May 10 18:19:34 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 459.95, 'Otro', 2022),
(104, 3, 19, 'Sat May 14 14:30:26 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 325, 'Aseguranza', 2022),
(105, 3, 19, 'Sat May 14 14:31:03 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Trailer Fee', 2022),
(106, 3, 19, 'Sat May 14 14:32:10 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 1573.2, 'Driver Pay', 2022),
(107, 3, 19, 'Sat May 14 14:50:51 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 200, 'Portion Plates', 2022),
(146, 2, 20, 'Sun May 22 10:08:32 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 3052.05, 'Diesel', 2022),
(140, 4, 19, 'Sat May 14 21:54:19 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 250, 'Trailer Fee', 2022),
(134, 1, 19, 'Sat May 14 21:22:08 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 3585.89, 'Diesel', 2022),
(111, 1, 19, 'Sat May 14 14:55:02 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 325, 'Aseguranza', 2022),
(112, 1, 19, 'Sat May 14 14:55:27 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 200, 'Portion Plates', 2022),
(133, 1, 19, 'Sat May 14 21:21:14 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 130, 'Otro', 2022),
(114, 1, 19, 'Sat May 14 14:58:25 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 2325.03, 'Driver Pay', 2022),
(115, 1, 19, 'Sat May 14 14:59:09 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Trailer Fee', 2022),
(148, 2, 20, 'Sun May 22 10:09:46 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 325, 'Aseguranza', 2022),
(144, 4, 19, 'Sat May 14 21:58:14 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 1000, 'Prestamo', 2022),
(118, 4, 19, 'Sat May 14 15:50:38 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 325, 'Aseguranza', 2022),
(119, 4, 19, 'Sat May 14 15:51:18 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 75, 'Decals', 2022),
(120, 4, 19, 'Sat May 14 15:51:55 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 200, 'Portion Plates', 2022),
(142, 4, 19, 'Sat May 14 21:56:50 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 210, 'Otro', 2022),
(145, 4, 19, 'Sat May 14 15:47:56 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 2757.71, 'Driver Pay', 2022),
(123, 4, 19, 'Sat May 14 16:03:50 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 500, 'Chassis', 2022),
(143, 4, 19, 'Sat May 14 21:57:33 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 4141.03, 'Diesel', 2022),
(137, 2, 19, 'Mon May 16 00:00:00 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 3900.53, 'Diesel', 2022),
(135, 2, 19, 'Sat May 14 21:28:27 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 130, 'Otro', 2022),
(127, 2, 19, 'Sat May 14 14:09:21 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 325, 'Aseguranza', 2022),
(128, 2, 19, 'Sat May 14 14:10:00 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 200, 'Portion Plates', 2022),
(129, 2, 19, 'Sat May 14 14:13:44 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 75, 'Decals', 2022),
(147, 2, 20, 'Sun May 22 10:09:10 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 65, 'Otro', 2022),
(131, 2, 19, 'Sat May 14 14:15:40 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Trailer Fee', 2022),
(132, 2, 19, 'Sat May 14 14:21:18 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1796.44, 'Driver Pay', 2022),
(138, 3, 19, 'Sat May 14 21:36:18 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 130, 'Otro', 2022),
(149, 2, 20, 'Sun May 22 10:10:19 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 200, 'Portion Plates', 2022),
(150, 2, 20, 'Sun May 22 10:11:40 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Chassis', 2022),
(151, 2, 20, 'Sun May 22 10:12:06 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Trailer Fee', 2022),
(152, 2, 20, 'Sun May 22 10:13:53 MDT 2022', 'Santa Julia Freight Services LLC', '801-T2000', 2498.8, 'Driver Pay', 2022),
(153, 4, 20, 'Sun May 22 10:42:20 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 2150.72, 'Diesel', 2022),
(154, 4, 20, 'Sun May 22 10:42:46 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 325, 'Aseguranza', 2022),
(155, 4, 20, 'Sun May 22 10:43:17 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 200, 'Portion Plates', 2022),
(156, 4, 20, 'Sun May 22 10:45:31 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 561.28, 'Otro', 2022),
(157, 4, 20, 'Sun May 22 10:46:59 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 1568.75, 'Driver Pay', 2022),
(158, 4, 20, 'Sun May 22 10:47:44 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 500, 'Chassis', 2022),
(167, 3, 21, 'Sun May 29 16:45:07 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 1812.08, 'Diesel', 2022),
(160, 1, 20, 'Sun May 22 11:22:39 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 3137.5, 'Diesel', 2022),
(161, 1, 20, 'Sun May 22 11:23:41 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 325, 'Aseguranza', 2022),
(162, 1, 20, 'Sun May 22 11:24:02 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 65, 'Otro', 2022),
(163, 1, 20, 'Sun May 22 11:25:24 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 1475.37, 'Driver Pay', 2022),
(164, 1, 20, 'Sun May 22 11:25:49 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Chassis', 2022),
(165, 1, 20, 'Sun May 22 11:26:08 MDT 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Trailer Fee', 2022),
(166, 4, 20, 'Sat May 21 19:13:13 GMT-07:00 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 250, 'Trailer Fee', 2022),
(171, 3, 21, 'Sun May 29 16:51:43 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 559.14, 'Driver Pay', 2022),
(169, 3, 21, 'Sun May 29 16:46:45 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 325, 'Aseguranza', 2022),
(170, 3, 21, 'Sun May 29 16:47:16 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 65, 'Otro', 2022),
(172, 3, 21, 'Sun May 29 16:53:48 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Trailer Fee', 2022),
(173, 3, 21, 'Sun May 29 17:00:00 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Chassis', 2022),
(174, 3, 21, 'Sun May 29 17:00:54 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 2340, 'truck maintenance', 2022),
(175, 2, 21, 'Sun May 29 17:38:54 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1896.14, 'Diesel', 2022),
(176, 2, 21, 'Sun May 29 17:39:38 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 325, 'Aseguranza', 2022),
(177, 2, 21, 'Sun May 29 17:40:25 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 65, 'Otro', 2022),
(178, 2, 21, 'Sun May 29 17:42:55 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1937.64, 'Driver Pay', 2022),
(179, 2, 21, 'Sun May 29 17:43:39 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Trailer Fee', 2022),
(180, 2, 21, 'Sun May 29 17:44:13 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Chassis', 2022),
(181, 4, 21, 'Sun May 29 18:22:26 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 2701.24, 'Diesel', 2022),
(182, 4, 21, 'Sun May 29 18:23:20 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 325, 'Aseguranza', 2022),
(183, 4, 21, 'Sun May 29 18:24:04 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 514, 'Otro', 2022),
(184, 4, 21, 'Sun May 29 18:26:00 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 280, 'Otro', 2022),
(185, 4, 21, 'Sun May 29 18:26:41 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 500, 'Chassis', 2022),
(186, 4, 21, 'Sun May 29 18:28:02 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 250, 'Trailer Fee', 2022),
(187, 4, 21, 'Sun May 29 18:30:09 MDT 2022', 'ADRIAN MONGE RODRIGUEZ', '805', 2276.88, 'Driver Pay', 2022),
(188, 1, 21, 'Wed Jun 01 21:17:35 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 3106.26, 'Diesel', 2022),
(189, 1, 21, 'Wed Jun 01 21:22:05 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 325, 'Aseguranza', 2022),
(190, 1, 21, 'Wed Jun 01 21:22:31 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 65, 'Otro', 2022),
(191, 1, 21, 'Wed Jun 01 21:24:04 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 2087.51, 'Driver Pay', 2022),
(192, 1, 21, 'Wed Jun 01 21:24:34 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Chassis', 2022),
(193, 1, 21, 'Wed Jun 01 21:25:11 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Trailer Fee', 2022),
(194, 1, 22, 'Fri Jun 03 23:21:30 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 986.25, 'Diesel', 2022),
(195, 1, 22, 'Fri Jun 03 23:22:08 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 325, 'Aseguranza', 2022),
(196, 1, 22, 'Fri Jun 03 23:22:39 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 65, 'Otro', 2022),
(197, 1, 22, 'Fri Jun 03 23:23:48 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 1994.37, 'Driver Pay', 2022),
(198, 1, 22, 'Fri Jun 03 23:24:08 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Trailer Fee', 2022),
(199, 1, 22, 'Fri Jun 03 23:24:30 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '800-LF687', 500, 'Chassis', 2022),
(200, 2, 22, 'Fri Jun 03 23:26:52 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1670.07, 'Driver Pay', 2022),
(201, 2, 22, 'Fri Jun 03 23:27:14 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 1998, 'Diesel', 2022),
(203, 2, 22, 'Fri Jun 03 23:31:57 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 65, 'Otro', 2022),
(204, 2, 22, 'Fri Jun 03 23:32:41 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 325, 'Aseguranza', 2022),
(205, 2, 22, 'Fri Jun 03 23:33:08 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Trailer Fee', 2022),
(206, 2, 22, 'Fri Jun 03 23:33:39 GMT-07:00 2022', 'Santa Julia Freight Services LLC', '801-T2000', 500, 'Chassis', 2022),
(207, 3, 22, 'Fri Jun 03 23:34:57 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 1542.66, 'Driver Pay', 2022),
(208, 3, 22, 'Fri Jun 03 23:35:24 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 1455.71, 'Diesel', 2022),
(209, 3, 22, 'Fri Jun 03 23:37:42 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 650, 'Aseguranza', 2022),
(210, 3, 22, 'Fri Jun 03 23:38:15 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 65, 'Otro', 2022),
(211, 3, 22, 'Fri Jun 03 23:38:43 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Chassis', 2022),
(212, 3, 22, 'Fri Jun 03 23:39:09 GMT-07:00 2022', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', '804-FREIGHTLINER', 500, 'Trailer Fee', 2022);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deducciones_chofer`
--

DROP TABLE IF EXISTS `deducciones_chofer`;
CREATE TABLE IF NOT EXISTS `deducciones_chofer` (
  `Id` int(11) NOT NULL,
  `Driver_Id` int(11) NOT NULL,
  `Period` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Amount` float NOT NULL,
  `Description` varchar(1000) NOT NULL,
  `Year` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `deducciones_chofer`
--

INSERT INTO `deducciones_chofer` (`Id`, `Driver_Id`, `Period`, `Date`, `First_Name`, `Last_Name`, `Amount`, `Description`, `Year`) VALUES
(3, 3, 11, 'Fri Mar 25 20:11:15 GMT-06:00 2022', ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 100, '160 Celular\n27.05 MontaCell\n30.75 cel\n100 Monitor\n***317.8 Total***\n-100\n217.8 PENDIENTES', 2022),
(2, 2, 11, 'Fri Mar 25 19:32:57 GMT-06:00 2022', 'Guadalupe', 'Quinones Pando', 100, '160 celular \n27.05 montacel\n 30.75cel \nl 100 monitor \n75 overall\n ***392.8 Total**** \n-100 \n292.8 PENDIENTES', 2022),
(5, 3, 13, 'Thu Mar 31 21:48:15 GMT-06:00 2022', ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 100, '160 Celular 27.05 MontaCell 30.75 cel 100 Monitor ***317.8 Total*** -100= 217.8 \n-100=117.8 PENDIENTES', 2022),
(4, 4, 13, 'Thu Mar 31 20:40:42 MST 2022', 'ADRIAN', 'MONJE RODRIGUEZ', 50, 'CELULAR', 2022),
(6, 2, 13, 'Thu Mar 31 22:02:20 MST 2022', 'Guadalupe', 'Quinones Pando', 100, '160 celular\n27.05 Montacel  \n30.75 Cel   \n100 monitor  \n75 overall  \n**392.8 Total* \n-100 (semana pasada) = 292.8 \n-100 = 192.8 PENDIENTES\n ', 2022),
(7, 3, 18, 'Tue May 10 08:56:02 GMT-07:00 2022', ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 117.8, '160 Celular \n27.05 MontaCell\n 30.75 cel \n100 Monitor \n***317.8 Total***\n -100(Semana 12)= 217.8 \n-100(semana 13)=117.8\n-117.8(Semana 18)=Cuenta Saldada', 2022),
(10, 2, 19, 'Tue May 17 18:15:40 GMT-07:00 2022', 'Guadalupe', 'Quinones Pando', 30.16, 'Mandado', 2022),
(9, 3, 18, 'Mon May 09 18:56:06 GMT-07:00 2022', ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 47.56, 'Mascara', 2022),
(11, 2, 19, 'Sat May 14 16:06:47 GMT-07:00 2022', 'Guadalupe', 'Quinones Pando', 192.8, '160 celular\n27.05 Montacel \n30.75 Cel\n100 monitor \n75 overall\n **392.8 Total* \n-100 (Semana 11) = 292.8\n -100(Semana 13) = 192.8\n-192.8=0 Cuenta saldada', 2022),
(12, 3, 19, 'Sat May 14 22:14:53 GMT-07:00 2022', ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 57.84, 'Faltante Diesel 27/Abril/2022\n***Mandar recibo para reembolsar***', 2022),
(13, 6, 20, 'Sun May 22 11:30:05 MDT 2022', 'Jose', 'Avila', 400, 'Efectivo', 2022),
(14, 6, 21, 'Tue May 31 00:00:00 GMT-07:00 2022', 'Jose', 'Avila', 80.42, 'Tapon Diesel', 2022);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deducciones_mecanico`
--

DROP TABLE IF EXISTS `deducciones_mecanico`;
CREATE TABLE IF NOT EXISTS `deducciones_mecanico` (
  `id` int(11) NOT NULL,
  `Mechanic_Id` int(11) NOT NULL,
  `Period` int(11) NOT NULL,
  `Date` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `First_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Last_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Amount` float NOT NULL,
  `Details` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Year` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deduccionsjfs`
--

DROP TABLE IF EXISTS `deduccionsjfs`;
CREATE TABLE IF NOT EXISTS `deduccionsjfs` (
  `id` int(11) NOT NULL,
  `Year` int(11) NOT NULL,
  `Period` int(11) NOT NULL,
  `Amount` float NOT NULL,
  `Details` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `deduccionsjfs`
--

INSERT INTO `deduccionsjfs` (`id`, `Year`, `Period`, `Amount`, `Details`) VALUES
(3, 2022, 20, 150, 'Pago Alex');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE IF NOT EXISTS `mecanico` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`Id`, `First_Name`, `Last_Name`) VALUES
(1, 'Victor Daniel', 'Navarrete');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

DROP TABLE IF EXISTS `notas`;
CREATE TABLE IF NOT EXISTS `notas` (
  `Owner` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Truck` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Period` int(10) NOT NULL,
  `Nota` varchar(1000) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Year` int(100) NOT NULL,
  PRIMARY KEY (`Owner`,`Truck`,`Period`,`Year`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

DROP TABLE IF EXISTS `pagos`;
CREATE TABLE IF NOT EXISTS `pagos` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Period` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Year` int(11) NOT NULL,
  `Amount` float NOT NULL,
  `Bonus` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`Id`, `First_Name`, `Last_Name`, `Period`, `Date`, `Year`, `Amount`, `Bonus`) VALUES
(2, 'Jesus Alejandro', 'Saenz Saldivar', 12, 'Sun Mar 13 13:02:59 GMT-07:00 2022', 2022, 50, 0),
(1, 'Jesus Alejandro', 'Saenz Saldivar', 10, 'Tue Mar 01 13:02:59 GMT-07:00 2022', 2022, 50, 0),
(3, 'Jesus Alejandro', 'Saenz Saldivar', 12, 'Sat Mar 19 17:57:29 GMT-06:00 2022', 2022, 75, 0),
(4, 'Jesus Alejandro', 'Saenz Saldivar', 13, 'Sun Apr 03 11:23:57 GMT-06:00 2022', 2022, 125, 0),
(5, 'Jesus Alejandro', 'Saenz Saldivar', 14, 'Sat Apr 09 09:23:08 MDT 2022', 2022, 75, 0),
(6, 'Jesus Alejandro', 'Saenz Saldivar', 17, '2022-04-29', 2022, 50, 0),
(7, 'Jesus Alejandro', 'Saenz Saldivar', 18, '2022-05-07', 2022, 100, 0),
(8, 'Jesus Alejandro', 'Saenz Saldivar', 19, '2022-05-14', 2022, 100, 0),
(9, 'Jesus Alejandro', 'Saenz Saldivar', 20, '2022-05-21', 2022, 150, 0),
(10, 'Jesus Alejandro', 'Saenz Saldivar', 21, '2022-05-29', 2022, 200, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagosmecnico`
--

DROP TABLE IF EXISTS `pagosmecnico`;
CREATE TABLE IF NOT EXISTS `pagosmecnico` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Period` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Year` int(11) NOT NULL,
  `Amount` float NOT NULL,
  `Bonus` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pagosmecnico`
--

INSERT INTO `pagosmecnico` (`Id`, `First_Name`, `Last_Name`, `Period`, `Date`, `Year`, `Amount`, `Bonus`) VALUES
(1, 'Victor Daniel', 'Navarrete', 18, '10/05/2022', 2022, 1000, 0),
(2, 'Victor Daniel', 'Navarrete', 19, '2022-05-14', 2022, 1500, 0),
(3, 'Victor Daniel', 'Navarrete', 20, '2022-05-24', 2022, 1500, 0),
(4, 'Victor Daniel', 'Navarrete', 21, '2022-05-31', 2022, 1500, 0),
(5, 'Victor Daniel', 'Navarrete', 22, '2022-06-03', 2022, 1500, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

DROP TABLE IF EXISTS `personal`;
CREATE TABLE IF NOT EXISTS `personal` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`Id`, `First_Name`, `Last_Name`) VALUES
(1, 'Jesus Alejandro', 'Saenz Saldivar'),
(2, 'Alan', 'Alarcon'),
(3, 'Karla', 'Cuevas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajoextra`
--

DROP TABLE IF EXISTS `trabajoextra`;
CREATE TABLE IF NOT EXISTS `trabajoextra` (
  `id` int(11) NOT NULL,
  `First_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Last_Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Period` int(11) NOT NULL,
  `Year` int(11) NOT NULL,
  `Date` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Details` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `trabajoextra`
--

INSERT INTO `trabajoextra` (`id`, `First_Name`, `Last_Name`, `Period`, `Year`, `Date`, `Details`, `Amount`) VALUES
(1, 'Guadalupe', 'Quinones Pando', 18, 2022, '2022-05-09', 'Devolver Chasis', 200),
(2, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 18, 2022, '2022-05-09', 'Transferencia', 100),
(3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 18, 2022, '2022-05-09', 'Espejo', 100),
(1, 'Guadalupe', 'Quinones Pando', 18, 2022, '2022-05-09', 'Devolver Chasis', 200),
(2, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 18, 2022, '2022-05-09', 'Transferencia', 100),
(3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 18, 2022, '2022-05-09', 'Espejo', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trailer`
--

DROP TABLE IF EXISTS `trailer`;
CREATE TABLE IF NOT EXISTS `trailer` (
  `Id` int(11) NOT NULL,
  `Brand` varchar(100) NOT NULL,
  `Model` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trailer`
--

INSERT INTO `trailer` (`Id`, `Brand`, `Model`) VALUES
(1, '337 ', '337 '),
(2, '334 ', '334 '),
(3, 'Caja', 'Caja'),
(4, 'Heil 2008', 'T-0800'),
(5, 'Vantage 2012', 'T-0801'),
(6, 'FRUE 1977', 'T-0804'),
(7, 'SN', 'T-805');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `Id` int(11) NOT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `User_Name` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id`, `First_Name`, `Last_Name`, `User_Name`, `Password`) VALUES
(1, 'Jesus Alejandro', 'Saenz Saldivar', 'alex', '7112'),
(2, 'Alan', 'Alarcon', 'AAR', 'wildcat85'),
(3, 'Karla', 'Luchsinger', 'Luchka', 'Jkmi$6jkmi$6'),
(4, 'Perla Ruby', 'Saenz Saldivar', 'Perla Saenz', 'victor13011996'),
(5, 'Jesus', 'Saenz', 'Jesus', '7112');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaje`
--

DROP TABLE IF EXISTS `viaje`;
CREATE TABLE IF NOT EXISTS `viaje` (
  `Id` int(11) NOT NULL,
  `Period` int(11) NOT NULL,
  `No_Trip` int(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Id_Driver` int(11) NOT NULL,
  `First_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Ticket` varchar(20) NOT NULL,
  `BOL` varchar(100) NOT NULL,
  `Truck` varchar(100) NOT NULL,
  `Trailer` varchar(100) NOT NULL,
  `Weight` float NOT NULL,
  `Cost_of_the_trip` float NOT NULL,
  `Description_of_the_cost` varchar(1000) NOT NULL,
  `Amount` float NOT NULL,
  `Driver_Pay` float NOT NULL,
  `Year` int(11) NOT NULL,
  `Type` varchar(11) NOT NULL,
  `Added_By` varchar(100) NOT NULL,
  `Miles` varchar(11) NOT NULL,
  `Owner` varchar(100) NOT NULL,
  `Bonus` float NOT NULL,
  `Bonus_Details` varchar(100) NOT NULL,
  `Ticket_Percentage` varchar(100) NOT NULL,
  `SJFS_Percentage` float NOT NULL,
  `S_J_F_S` float NOT NULL,
  `Bonus_Driver` float NOT NULL,
  `Details_Bonus_Driver` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `viaje`
--

INSERT INTO `viaje` (`Id`, `Period`, `No_Trip`, `Date`, `Id_Driver`, `First_Name`, `Last_Name`, `Ticket`, `BOL`, `Truck`, `Trailer`, `Weight`, `Cost_of_the_trip`, `Description_of_the_cost`, `Amount`, `Driver_Pay`, `Year`, `Type`, `Added_By`, `Miles`, `Owner`, `Bonus`, `Bonus_Details`, `Ticket_Percentage`, `SJFS_Percentage`, `S_J_F_S`, `Bonus_Driver`, `Details_Bonus_Driver`) VALUES
(1, 9, 1, 'Sun Mar 06 00:00:00 MST 2022', 1, 'Roman', 'Martinez', '1125822', '1125822', '800-LF687', '337 ', 25.67, 536.503, 'sand rev', 458.71, 146.787, 2022, 'Ton', 'Alan Alarcon', '97', 'Santa Julia Freight Services LLC', 0, 'Empty', 'Empty', 7, 32.1097, 0, ''),
(4, 9, 1, 'Sat Mar 05 17:08:16 GMT-06:00 2022', 2, 'Guadalupe', 'Quinones Pando', '18754 ', '18754 ', '800-LF687', '337 ', 25.73, 495.045, 'sand rev.', 423.264, 114.281, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '65', 'Santa Julia Freight Services LLC', 0, 'Empty', 'Empty', 7, 29.6285, 685.719, 'Mantenimiento'),
(3, 9, 2, 'Sat Mar 05 16:27:34 GMT-06:00 2022', 1, 'Roman', 'Martinez', '1425585', '1425585', '800-LF687', '337 ', 25.58, 594.991, 'san rev.', 508.717, 162.789, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '127', 'Santa Julia Freight Services LLC', 0, 'Empty', 'Empty', 7, 35.6102, 0, ''),
(5, 9, 1, 'Sun Mar 06 18:15:24 GMT-06:00 2022', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '1125780', '1125780', '806-CASCADIA ', '334 ', 25.62, 535.458, 'sand rev', 457.817, 123.61, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '97', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', 'Empty', 7, 32.0472, 0, 'Empty'),
(6, 9, 2, 'Sun Mar 06 18:15:24 GMT-06:00 2022', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', 'K3-2065-2341', 'K3-2065-2341', '806-CASCADIA ', '334 ', 25.77, 495.815, 'sand rev', 423.922, 114.459, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '63', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', 'Empty', 7, 29.6745, 0, 'Empty'),
(7, 9, 3, 'Sun Mar 06 18:15:24 GMT-06:00 2022', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '1425595', '1425595', '806-CASCADIA ', '334 ', 25.6, 595.456, 'sand rev', 509.115, 137.461, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '127', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', 'Empty', 7, 35.638, 0, 'Empty'),
(9, 10, 1, '2022-03-09', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '1428670', '1428670', '806-CASCADIA ', '334 ', 25.51, 593.36, 'Sand Rev', 507.323, 152.197, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '127', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.2197, 0, 'Empty'),
(10, 10, 2, '2022-03-10', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20260220', '20260220', '806-CASCADIA ', '334 ', 25.74, 495.238, 'Sand rev', 423.428, 127.028, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '68', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 12.7028, 0, 'Empty'),
(11, 10, 3, '2022-03-11', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', 'k4-2070-1737', 'k4-2070-1737', '806-CASCADIA ', '334 ', 26.28, 538.477, 'Sand Rev.', 460.398, 138.119, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '82', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.8119, 0, 'Empty'),
(12, 10, 4, '2022-03-11', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20095', '20095', '806-CASCADIA ', '334 ', 25.98, 499.855, 'sand Rev.', 427.376, 128.213, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '65', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 12.8213, 0, 'Empty'),
(13, 10, 5, '2022-03-11', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', 'WT-220311344', 'WT-220311344', '806-CASCADIA ', '334 ', 26.01, 532.945, 'Sand Rev.', 455.668, 136.7, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '85', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.67, 0, 'Empty'),
(14, 10, 6, '2022-03-12', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', 'K5-2071-1841', 'K5-2071-1841', '806-CASCADIA ', '334 ', 26.27, 520.146, 'Sand Rev.', 444.725, 133.417, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '75', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.3417, 0, 'Empty'),
(15, 10, 7, '2022-03-12', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20437', '20437', '806-CASCADIA ', '334 ', 25.95, 499.278, 'Sand Rev', 426.883, 128.065, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '65', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 12.8065, 0, 'Empty'),
(16, 10, 8, '2022-03-07', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '1426364', '1426364', '806-CASCADIA ', '334 ', 25.31, 588.711, 'Sand Rev', 503.348, 151.004, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '127', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.1004, 0, 'Empty'),
(17, 10, 1, '2022-03-07', 1, 'Roman', 'Martinez', '1426357', '1426357 ', '800-LF687', '337 ', 26.09, 606.85, 'unico viaje', 518.857, 166.034, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '127', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.32, 0, 'Empty'),
(18, 10, 1, '2022-03-10', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 'K4-2069-1735', 'K4-2069-1735', '804-FREIGHTLINER   ', '337 ', 26.36, 521.928, 'Sand rev.', 446.248, 120.487, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '75', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 36.535, 0, 'Empty'),
(19, 10, 2, '2022-03-11', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', 'K5-2070-1751', 'K5-2070-1751', '804-FREIGHTLINER   ', '337 ', 26.24, 537.66, 'Sand Rev', 459.699, 124.119, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '82', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 37.6362, 0, 'Empty'),
(20, 10, 3, '2022-03-12', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '297845', '297845', '804-FREIGHTLINER   ', '337 ', 25.99, 543.19, 'sand rev', 464.427, 125.395, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '93', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 38.0233, 0, 'Empty'),
(21, 10, 4, '2022-03-12', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '1430597', '1430597', '804-FREIGHTLINER   ', '337 ', 26, 532.74, 'sand rev', 455.493, 122.983, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '81', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 37.2918, 0, 'Empty'),
(22, 10, 5, '2022-03-12', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '142946', '142946', '804-FREIGHTLINER   ', '337 ', 25.97, 532.13, 'sand rev', 454.971, 122.842, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '81', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 37.2491, 0, 'Empty'),
(23, 11, 1, '2022-03-17', 2, 'Guadalupe', 'Quinones Pando', '20263403', '20263403', '801-T2000', 'Caja', 21.72, 515.85, 'Fila mar', 441.052, 119.084, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.1095, 0, 'Empty'),
(24, 11, 2, '2022-03-17', 2, 'Guadalupe', 'Quinones Pando', '20263677', '20263677', '801-T2000', 'Caja', 21.51, 510.86, 'Fila Mar', 436.785, 117.932, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 35.7602, 0, 'Empty'),
(25, 11, 3, '2022-03-18', 2, 'Guadalupe', 'Quinones Pando', '20263827', '20263827', '801-T2000', 'Caja', 21.4, 508.25, 'Fila Mar', 434.554, 117.33, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 35.5775, 0, 'Empty'),
(26, 11, 4, '2022-03-18', 2, 'Guadalupe', 'Quinones Pando', '20264054', '20264054', '801-T2000', 'Caja', 21.88, 519.65, 'Fila Mar', 444.301, 119.961, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.3755, 0, 'Empty'),
(27, 11, 1, '2022-03-17', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20263502', '20263502', '805', 'Caja', 22.42, 532.48, 'Fila Mar', 455.27, 145.687, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.9744, 0, 'Empty'),
(28, 11, 2, '2022-03-17', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20263685', '20263685', '805', 'Caja', 22.44, 532.95, 'Fila Mar', 455.672, 145.815, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.9885, 0, 'Empty'),
(29, 11, 3, '2022-03-18', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20263791', '20263791', '805', 'Caja', 22.52, 534.85, 'Fila Mar', 457.297, 146.335, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 16.0455, 0, 'Empty'),
(30, 11, 4, '2022-03-18', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20264080', '20264080', '805', 'Caja', 22.38, 531.53, 'Fila Mar', 454.458, 145.427, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.9459, 0, 'Empty'),
(31, 11, 1, '2022-03-17', 1, 'Roman', 'Martinez', '20263501', '20263501', '800-LF687', 'Caja', 21.81, 517.99, 'Fila Mar', 442.881, 141.722, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.2593, 0, 'Empty'),
(32, 11, 2, '2022-03-17', 1, 'Roman', 'Martinez', '20263675', '20263675', '800-LF687', 'Caja', 21.91, 520.36, 'Fila Mar', 444.908, 142.37, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.4252, 0, 'Empty'),
(33, 11, 3, '2022-03-17', 1, 'Roman', 'Martinez', '20263812', '20263812', '800-LF687', 'Caja', 22.03, 523.93, 'Fila Mar', 447.96, 143.347, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.6751, 0, 'Empty'),
(34, 11, 4, '2022-03-18', 1, 'Roman', 'Martinez', '20264032', '20264032', '800-LF687', 'Caja', 22.06, 523.93, 'Fila Mar', 447.96, 143.347, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 36.6751, 0, 'Empty'),
(35, 11, 1, '2022-03-17', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '20263504', '20263504', '804-FREIGHTLINER   ', 'Caja', 22.21, 527.49, 'Fila Mar', 451.004, 121.771, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 36.9243, 0, 'Empty'),
(36, 11, 2, '2022-03-17', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '20263678', '20263678', '804-FREIGHTLINER   ', 'Caja', 22.34, 530.58, 'Fila Mar', 453.646, 122.484, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 37.1406, 0, 'Empty'),
(37, 11, 3, '2022-03-18', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '20263829', '20263829', '804-FREIGHTLINER   ', 'Caja', 22.54, 535.33, 'Fila Mar', 457.707, 123.581, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 37.4731, 0, 'Empty'),
(38, 11, 4, '2022-03-18', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '20264053', '20264053', '804-FREIGHTLINER   ', 'Caja', 21.94, 521.08, 'Fila Mar', 445.523, 120.291, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 36.4756, 0, 'Empty'),
(39, 11, 5, '2022-03-20', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '371852', '371852', '804-FREIGHTLINER   ', 'Caja', 22.54, 482.36, 'Fila Mar', 412.418, 111.353, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.7652, 0, 'Empty'),
(40, 11, 1, '2022-03-17', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20263497', '20263497', '806-CASCADIA ', 'Caja', 21.55, 511.81, 'Fila Mar', 437.598, 131.279, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.3543, 0, 'Empty'),
(41, 11, 2, '2022-03-17', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20263672', '20263672', '806-CASCADIA ', 'Caja', 21.54, 511.82, 'Fila Mar', 437.606, 131.282, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.3546, 0, 'Empty'),
(42, 11, 3, '2022-03-17', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20263787', '20263787', '806-CASCADIA ', 'Caja', 21.34, 506.83, 'Fila Mar', 433.34, 130.002, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.2049, 0, 'Empty'),
(43, 11, 4, '2022-03-18', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20263899', '20263899', '806-CASCADIA ', 'Caja', 21.8, 517.75, 'Fila Mar', 442.676, 132.803, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.5325, 0, 'Empty'),
(44, 11, 5, '2022-03-18', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20264077', '20264077', '806-CASCADIA ', 'Caja', 21.75, 516.56, 'Fila Mar', 441.659, 132.498, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '76', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 15.4968, 0, 'Empty'),
(45, 11, 6, '2022-03-18', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '371846', '371846', '806-CASCADIA ', 'Caja', 22.2, 475.08, 'Fila Mar', 406.193, 121.858, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.2524, 0, 'Empty'),
(46, 13, 1, '2022-03-23', 1, 'Roman', 'Martinez', '372540', '372540', '800-LF687', 'Caja', 21.86, 467.8, 'Fila Mar\n', 399.969, 127.99, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.746, 0, 'Empty'),
(47, 13, 1, '2022-03-23', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '372563', '372563', '805', 'Caja', 22.53, 482.14, 'FILA-MAR ', 412.23, 131.914, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4642, 0, 'Empty'),
(47, 13, 2, '2022-03-23', 1, 'Roman', 'Martinez', '372968', '372968', '800-LF687', 'Caja', 21.8, 466.52, 'Fila Mar', 398.875, 127.64, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.6564, 0, 'Empty'),
(48, 13, 3, '2022-03-23', 1, 'Roman', 'Martinez', '373266', '373266', '800-LF687', 'Caja', 21.74, 465.24, 'Fila Mar', 397.78, 127.29, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.5668, 0, 'Empty'),
(48, 13, 2, '2022-03-24', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '372836', '372836', '805', 'Caja', 22.54, 482.36, 'FILA-MAR', 412.418, 131.974, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4708, 0, 'Empty'),
(49, 13, 3, '2022-03-24', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '373020', '373020', '805', 'Caja', 22.53, 482.14, 'FILA-MAR', 412.23, 131.914, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4642, 0, 'Empty'),
(49, 13, 4, '2022-03-25', 1, 'Roman', 'Martinez', '373811', '373811', '800-LF687', 'Caja', 21.93, 469.3, 'Fila Mar', 401.251, 128.4, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.851, 0, 'Empty'),
(50, 13, 4, '2022-03-24', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '373286', '373286', '805', 'Caja', 22.62, 484.07, 'FILA-MAR', 413.88, 132.442, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.5221, 0, 'Empty'),
(51, 13, 5, '2022-03-25', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '373548', '373548', '805', 'Caja', 22.49, 481.29, 'FILA-MAR', 411.503, 131.681, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4387, 0, 'Empty'),
(52, 13, 6, '2022-03-26', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '373873', '373873', '805', 'Caja', 22.5, 481.5, 'FILA-MAR\n\n\n\n\n', 411.682, 131.738, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.445, 0, 'Empty'),
(50, 13, 5, '2022-03-17', 1, 'Roman', 'Martinez', '371855', '371855', '800-LF687', 'Caja', 21.08, 471.2, 'Viaje pendiente', 402.876, 128.92, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.984, 0, 'Empty'),
(53, 13, 7, '2022-03-27', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374096', '374096', '805', 'Caja', 22.43, 480, 'FILA-MAR', 410.4, 131.328, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4, 0, 'Empty'),
(54, 13, 8, '2022-03-27', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20268600', '20268600', '805', 'Caja', 22.67, 485.14, 'FILA-MAR', 414.795, 132.734, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.5542, 0, 'Empty'),
(55, 13, 9, '2022-03-27', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20268910', '20268910', '805', 'Caja', 22.35, 478.29, 'FILA-MAR', 408.938, 130.86, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.3487, 0, 'Empty'),
(56, 13, 10, '2022-03-22', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '372298', '372298', '805', 'Caja', 22.51, 481.71, 'FILA-MAR', 411.862, 131.796, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4513, 0, 'Empty'),
(57, 13, 11, '2022-03-28', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374653', '374653', '805', 'Caja', 22.52, 481.93, 'FILA-MAR', 412.05, 131.856, 2022, 'Ton', 'Alan Alarcon', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4579, 0, 'Empty'),
(58, 13, 1, '2022-03-22', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '372292', '372292', '806-CASCADIA ', 'Caja', 21.72, 464.81, 'Fila Mar', 397.413, 119.224, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.9443, 0, 'Empty'),
(59, 13, 2, '2022-03-23', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '372534', '372534', '806-CASCADIA ', 'Caja', 21.85, 467.59, 'Fila Mar', 399.789, 119.937, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.0277, 0, 'Empty'),
(60, 13, 3, '2022-03-23', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '372786', '372786', '806-CASCADIA ', 'Caja', 21.88, 468.23, 'Fila Mar', 400.337, 120.101, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.0469, 0, 'Empty'),
(61, 13, 4, '2022-03-23', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '372918', '372918', '806-CASCADIA ', 'Caja', 22.27, 476.58, 'Fila Mar', 407.476, 122.243, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.2974, 0, 'Empty'),
(62, 13, 5, '2022-03-24', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '373128', '373128', '806-CASCADIA ', 'Caja', 22.28, 476.79, 'Fila Mar', 407.655, 122.297, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.3037, 0, 'Empty'),
(63, 13, 6, '2022-03-25', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '373567', '373567', '806-CASCADIA ', 'Caja', 22.03, 471.44, 'Fila Mar', 403.081, 120.924, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.1432, 0, 'Empty'),
(64, 13, 7, '2022-03-25', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '373883', '373883', '806-CASCADIA ', 'Caja', 21.78, 466.09, 'Fila Mar', 398.507, 119.552, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.9827, 0, 'Empty'),
(65, 13, 8, '2022-03-25', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '374091', '374091', '806-CASCADIA ', 'Caja', 21.72, 464.81, 'Fila Mar', 397.413, 119.224, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 13.9443, 0, 'Empty'),
(66, 13, 9, '2022-03-27', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '374242', '374242', '806-CASCADIA ', 'Caja', 21.97, 470.16, 'Fila Mar', 401.987, 120.596, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.1048, 0, 'Empty'),
(67, 13, 10, '2022-03-27', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '20268671', '20268671', '806-CASCADIA ', 'Caja', 22.14, 473.8, 'Fila Mar', 405.099, 121.53, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.214, 0, 'Empty'),
(68, 13, 11, '2022-03-27', 5, 'JULIO CESAR', 'HOLGUIN ESPARZA ', '374391', '374391', '806-CASCADIA ', 'Caja', 22.17, 474.44, 'Fila Mar', 405.646, 121.694, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.2332, 0, 'Empty'),
(69, 13, 1, '2022-03-22', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '372313', '372313', '804-FREIGHTLINER   ', 'Caja', 22.08, 472.51, 'FILA-MAR\n', 403.996, 109.079, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.0757, 0, 'Empty'),
(70, 13, 2, '2022-03-23', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '372572', '372572', '804-FREIGHTLINER   ', 'Caja', 21.92, 469.09, 'FILA-MAR', 401.072, 108.289, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 32.8363, 0, 'Empty'),
(71, 13, 3, '2022-03-24', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '372912', '372912', '804-FREIGHTLINER   ', 'Caja', 22.09, 472.73, 'FILA-MAR', 404.184, 109.13, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.0911, 0, 'Empty'),
(72, 13, 4, '2022-03-24', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '373252', '373252', '804-FREIGHTLINER   ', 'Caja', 22.13, 473.58, 'FILA-MAR', 404.911, 109.326, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.1506, 0, 'Empty'),
(73, 13, 5, '2022-03-25', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '373485', '373485', '804-FREIGHTLINER   ', 'Caja', 476.79, 476.79, 'FILA-MAR', 407.655, 110.067, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.3753, 0, 'Empty'),
(74, 13, 6, '2022-03-26', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '373776', '373776', '804-FREIGHTLINER   ', 'Caja', 22.17, 474.44, 'FILA-MAR', 405.646, 109.524, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.2108, 0, 'Empty'),
(75, 13, 7, '2022-03-26', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '374041', '374041', '804-FREIGHTLINER   ', 'Caja', 377.65, 477.65, 'FILA-MAR', 408.391, 110.266, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.4355, 0, 'Empty'),
(76, 13, 8, '2022-03-27', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '374234', '374234', '804-FREIGHTLINER   ', 'Caja', 22.06, 472.08, 'FILA-MAR', 403.628, 108.98, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.0456, 0, 'Empty'),
(77, 13, 9, '2022-03-27', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '374347', '374347', '804-FREIGHTLINER   ', 'Caja', 22.18, 474.65, 'FILA-MAR', 405.826, 109.573, 2022, 'Ton', 'Alan Alarcon', '77', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '14.5', 7, 33.2255, 0, 'Empty'),
(78, 13, 1, '2022-03-21', 2, 'Guadalupe', 'Quinones Pando', '371848', '371848', '801-T2000', 'Caja', 22.1, 472.94, 'FILA-MAR', 404.364, 109.178, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 33.1058, 0, 'Empty'),
(79, 13, 2, '2022-03-22', 2, 'Guadalupe', 'Quinones Pando', '372299', '372299', '801-T2000', 'Caja', 21.92, 469.09, 'FILA-MAR', 401.072, 108.289, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.8363, 0, 'Empty'),
(80, 13, 3, '2022-03-23', 2, 'Guadalupe', 'Quinones Pando', '372571', '372571', '801-T2000', 'Caja', 22.04, 471.66, 'FILA-MAR.', 403.269, 108.883, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 33.0162, 0, 'Empty'),
(81, 13, 4, '2022-03-24', 2, 'Guadalupe', 'Quinones Pando', '373019', '373019', '801-T2000', 'Caja', 21.2, 453.68, 'FILA-MAR', 387.896, 104.732, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 31.7576, 0, 'Empty'),
(82, 13, 5, '2022-03-25', 2, 'Guadalupe', 'Quinones Pando', '373508', '373508', '801-T2000', 'Caja', 21.3, 455.82, 'FILA-MAR', 389.726, 105.226, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 31.9074, 0, 'Empty'),
(83, 13, 6, '2022-03-23', 2, 'Guadalupe', 'Quinones Pando', '372840', '372840', '801-T2000', 'Caja', 21.58, 461.81, 'FILA-MAR', 394.848, 106.609, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.3267, 0, 'Empty'),
(84, 13, 7, '2022-03-24', 2, 'Guadalupe', 'Quinones Pando', '373270', '373270', '801-T2000', 'Caja', 21.72, 464.81, 'FILA-MAR', 397.413, 107.301, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.5367, 0, 'Empty'),
(85, 13, 8, '2022-03-26', 2, 'Guadalupe', 'Quinones Pando', '373775', '373775', '801-T2000', 'Caja', 21.68, 463.95, 'FILA-MAR', 396.677, 107.103, 2022, 'Ton', 'Alan Alarcon', '77', 'Santa Julia Freight Services LLC', 0, 'Empty', '14.5', 7, 32.4765, 0, 'Empty'),
(86, 14, 1, '2022-03-28', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374478', '374478', '805', 'Caja', 22.48, 481.07, 'Fila mar', 411.315, 131.621, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4321, 0, 'Empty'),
(87, 14, 2, '2022-03-28', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374758', '374758', '805', 'Caja', 22.6, 483.64, 'Fila mar', 413.512, 132.324, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.5092, 0, 'Empty'),
(88, 14, 3, '2022-03-29', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374860', '374860', '805', 'Caja', 22.39, 479.15, 'Fila mar', 409.673, 131.095, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.3745, 0, 'Empty'),
(89, 14, 4, '2022-03-29', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '374949', '374949', '805', 'Caja', 22.54, 482.36, 'Fila Mar', 412.418, 131.974, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4708, 0, 'Empty'),
(90, 14, 5, '2022-03-30', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '375546', '375546', '805', 'Caja', 22.62, 484.07, 'Fila mar', 413.88, 132.442, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.5221, 0, 'Empty'),
(91, 14, 6, '2022-03-31', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '20270700', '20270700', '805', 'Caja', 22.61, 574.29, 'Fila mar', 491.018, 157.126, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '110', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 17.2287, 0, 'Empty'),
(92, 14, 7, '2022-03-31', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '375813', '375813', '805', 'Caja', 22.65, 484.71, 'Fila mar', 414.427, 132.617, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.5413, 0, 'Empty'),
(93, 14, 8, '2022-04-01', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '375979', '375979', '805', 'Caja', 22.48, 481.07, 'Fila mar', 411.315, 131.621, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '77', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '14.5', 3, 14.4321, 0, 'Empty'),
(94, 18, 1, '2022-04-23', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2153', 'K7-21130513', '804-FREIGHTLINER', 'T-0804', 24.33, 855, 'Colgate', 666.9, 180.06, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '107', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(95, 18, 2, '2022-04-23', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2154', 'K4-21131948', '804-FREIGHTLINER', 'T-0804', 23.83, 825, 'Ameredev B', 643.5, 173.75, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '91', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(96, 18, 3, '2022-04-24', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2155', 'K7-21141421', '804-FREIGHTLINER', 'T-0804', 23.96, 855, 'Colgate', 666.9, 180.06, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '107', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(97, 18, 4, '2022-04-25', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2156', 'K6-21152306', '804-FREIGHTLINER', 'T-0804', 24.19, 855, 'Colgate', 666.9, 180.06, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '107', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(98, 18, 5, '2022-04-26', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2157', '20281654', '804-FREIGHTLINER', 'T-0804', 24.79, 875, 'Colgate', 682.5, 184.28, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '110', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.25, 0, 'Empty'),
(99, 18, 6, '2022-04-26', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2158', 'K2-21171532', '804-FREIGHTLINER', 'T-0804', 24.52, 855, 'Colgate', 666.9, 180.06, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '107', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(100, 18, 7, '2022-04-27', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2159', '1147405', '804-FREIGHTLINER', 'T-0804', 24.16, 797.71, 'Frac 5', 622.21, 168, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '90', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 55.8397, 0, 'Empty'),
(101, 18, 8, '2022-04-28', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2160', '20282744', '804-FREIGHTLINER', 'T-0804', 24.76, 1024, 'Frac5', 798.72, 215.65, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '110', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 71.68, 0, 'Empty'),
(102, 18, 9, '2022-04-29', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2161', 'K3-21191857', '804-FREIGHTLINER', 'T-0804', 21.25, 825, 'Anderson B', 643.5, 173.75, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '91', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(103, 18, 10, '2022-04-21', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2151', '1144633', '804-FREIGHTLINER', 'T-0804', 23.88, 864.19, 'Frac 5', 674.07, 182, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '90', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 60.4933, 0, 'Empty'),
(104, 18, 11, '2022-04-22', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2152', 'K6-2112-2009', '804-FREIGHTLINER', 'T-0804', 24.01, 855, 'Colgate', 666.9, 180.06, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '107', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(105, 18, 1, '2022-04-21', 1, 'Roman', 'Martinez', '2352', '1144632', '800-LF687', 'T-0800', 47960, 867.23, 'Frac 5', 676.44, 216.46, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '90', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 60.7061, 0, 'Empty'),
(106, 18, 2, '2022-04-22', 1, 'Roman', 'Martinez', '2353', 'K6-21121758', '800-LF687', 'T-0800', 49500, 855, 'Colgate', 666.9, 213.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '107', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(107, 18, 3, '2022-04-23', 1, 'Roman', 'Martinez', '2354', 'K7-21130518', '800-LF687', 'T-0800', 50140, 855, 'Colgate', 666.9, 213.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '107', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(108, 18, 4, '2022-04-23', 1, 'Roman', 'Martinez', '2355', 'K5-21131993', '800-LF687', 'T-0800', 49740, 825, 'Ameredev B\n', 643.5, 205.92, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '91', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(109, 18, 5, '2022-04-24', 1, 'Roman', 'Martinez', '2356', 'K7-2114-0839', '800-LF687', 'T-0800', 49520, 855, 'colgate', 666.9, 213.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '107', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(110, 18, 6, '2022-04-24', 1, 'Roman', 'Martinez', '2357', '1457117', '800-LF687', 'T-0800', 50200, 520, 'Colgate', 405.6, 129.79, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '30', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 36.4, 0, 'Empty'),
(111, 18, 7, '2022-04-24', 1, 'Roman', 'Martinez', '2358', '1147419', '800-LF687', 'T-0800', 0, 927.19, 'Frac 5', 723.21, 231.43, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '90', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 64.9033, 0, 'Empty'),
(112, 18, 8, '2022-04-29', 1, 'Gabriel', 'Ponce Rodriguez', '2359', 'K2-21200050', '800-LF687', 'T-0800', 49380, 825, 'Anderson B', 643.5, 173.75, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '91', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(113, 19, 1, '2022-04-30', 1, 'Roman', 'Martinez', '2360', 'K3-2120-1615', '800-LF687', 'T-0800', 49640, 825, 'Anderson B', 643.5, 205.92, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '91', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(114, 19, 1, '2022-04-30', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2162', 'K5-21201409', '804-FREIGHTLINER', 'T-0804', 24.46, 825, 'Anderson B', 643.5, 173.75, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '91', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(114, 19, 2, '2022-04-30', 1, 'Roman', 'Martinez', '2361', 'K5-21210021', '800-LF687', 'T-0800', 50000, 825, 'Anderson B\n', 643.5, 205.92, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '91', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(115, 19, 3, '2022-04-30', 1, 'Roman', 'Martinez', '2362', 'K5-21220411', '800-LF687', 'T-0800', 49060, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(115, 19, 2, '2022-04-30', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2163', 'K3-21202325', '804-FREIGHTLINER', 'T-0804', 2.91, 825, 'Anderson B', 643.5, 173.75, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '91', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(116, 19, 3, '2022-05-01', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2164', 'K4-21211758', '804-FREIGHTLINER', 'T-0804', 23.83, 795, 'Anderson B', 620.1, 167.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '88', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(117, 19, 4, '2022-05-02', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2165', 'K1-21221439', '804-FREIGHTLINER', 'T-0804', 24.09, 795, 'Anderson B', 620.1, 167.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '88', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(116, 19, 4, '2022-05-02', 1, 'Roman', 'Martinez', '2363', 'K6-21221714', '800-LF687', 'T-0800', 49460, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(118, 19, 5, '2022-05-02', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2166', 'K3-21222258', '804-FREIGHTLINER', 'T-0804', 24.3, 795, 'Anderson B', 620.1, 167.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '88', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(119, 19, 6, '2022-05-03', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2167', 'K4-21231850', '804-FREIGHTLINER', 'T-0804', 24.33, 795, 'Anderson B', 620.1, 167.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '88', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(120, 19, 7, '2022-05-03', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2168', 'K4-21240355', '804-FREIGHTLINER', 'T-0804', 23.87, 880, 'Big Burro', 686.4, 185.33, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(121, 19, 8, '2022-05-04', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2169', 'K6-2124-2107', '804-FREIGHTLINER', 'T-0804', 23.94, 880, 'Big burro', 686.4, 185.33, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(118, 19, 5, '2022-05-03', 1, 'Roman', 'Martinez', '2364', 'K2-21232245', '800-LF687', 'T-0800', 49940, 795, 'Anderson B\n', 620.1, 198.43, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(122, 19, 9, '2022-05-05', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2170', 'K7-2125-1800', '804-FREIGHTLINER', 'T-0804', 24.23, 880, 'Big burro', 686.4, 185.33, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(122, 19, 6, '2022-05-04', 1, 'Roman', 'Martinez', '2365', 'K4-21241307', '800-LF687', 'T-0800', 48960, 795, 'Anderson B', 620.1, 198.43, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(123, 19, 7, '2022-05-04', 1, 'Roman', 'Martinez', '2366', 'K4-21241941', '800-LF687', 'T-0800', 49280, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(124, 19, 8, '2022-05-05', 1, 'Roman', 'Martinez', '2367', 'K1-21250533', '800-LF687', 'T-0800', 49420, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(125, 19, 9, '2022-05-05', 1, 'Roman', 'Martinez', '2368', 'K1-21260332', '800-LF687', 'T-0800', 49700, 795, 'Anderson B\n', 620.1, 198.43, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(126, 19, 10, '2022-05-06', 1, 'Roman', 'Martinez', '2369', 'K2-21261735', '800-LF687', 'T-0800', 49520, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(127, 19, 11, '2022-05-06', 1, 'Roman', 'Martinez', '2370', 'K1-21270203', '800-LF687', 'T-0800', 49580, 880, 'Big Burro\n', 686.4, 219.65, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(128, 19, 1, '2022-04-29', 2, 'Guadalupe', 'Quinones Pando', '2398', 'K3-21200054', '801-T2000', 'T-0801', 45720, 825, 'Anderson B\n', 643.5, 173.75, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '91', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 57.75, 0, 'Empty'),
(129, 19, 1, '2022-04-29', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2101', 'K2-21200123', '805', 'T-805', 47800, 825, 'Anderson B', 668.25, 180.42, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '81', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 33, 0, 'Empty'),
(129, 19, 2, '2022-04-30', 2, 'Guadalupe', 'Quinones Pando', '2051', 'K6-21201523', '801-T2000', 'T-0801', 45060, 835, 'Big Burro\n', 651.3, 175.85, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 58.45, 0, 'Empty'),
(130, 19, 2, '2022-04-30', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2102', 'K2-21201621', '805', 'T-805', 47920, 825, 'Anderson B', 668.25, 180.42, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '91', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 33, 0, 'Empty'),
(131, 19, 3, '2022-04-30', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2103', 'K4-21210021', '805', 'T-805', 47660, 825, 'Anderson B', 668.25, 180.42, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '91', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 33, 0, 'Empty'),
(132, 19, 4, '2022-05-01', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2104', 'K2-21211802', '805', 'T-805', 47240, 795, 'Anderson B', 643.95, 173.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.8, 0, 'Empty'),
(130, 19, 3, '2022-05-02', 2, 'Guadalupe', 'Quinones Pando', '2052', 'K4-2122-1731', '801-T2000', 'T-0801', 45640, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(133, 19, 5, '2022-05-01', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2105', 'K2-21220214', '805', 'T-805', 47760, 795, 'Anderson B', 643.95, 173.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.8, 0, 'Empty'),
(134, 19, 6, '2022-05-02', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2106', 'K2-21221518', '805', 'T-805', 48160, 795, 'Anderson B', 643.95, 173.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.8, 0, 'Empty'),
(133, 19, 4, '2022-05-03', 2, 'Guadalupe', 'Quinones Pando', '2053', 'K1-21231214', '801-T2000', 'T-0801', 45600, 795, 'Anderson B \n', 620.1, 167.43, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(135, 19, 7, '2022-05-02', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2107', 'K2-21230116', '805', 'T-805', 48300, 795, 'Anderson B', 643.95, 173.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.8, 0, 'Empty'),
(136, 19, 8, '2022-05-03', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2108', 'K2-21231635', '805', 'T-805', 48640, 795, 'Anderson B', 643.95, 173.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.8, 0, 'Empty'),
(137, 19, 9, '2022-05-03', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2109', 'K7-21240058', '805', 'T-805', 48780, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(135, 19, 5, '2022-05-03', 2, 'Guadalupe', 'Quinones Pando', '2054', 'K5-21232049', '801-T2000', 'T-0801', 46040, 795, 'Anderson B\n', 620.1, 167.43, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(138, 19, 10, '2022-05-04', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2110', 'K6-21241716', '805', 'T-805', 47960, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(139, 19, 11, '2022-05-04', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2111', 'K2-21250248', '805', 'T-805', 48260, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(140, 19, 12, '2022-05-05', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2112', 'K2-21251305', '805', 'T-805', 48560, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(138, 19, 6, '2022-05-04', 2, 'Guadalupe', 'Quinones Pando', '2055', 'K7-21241306', '801-T2000', 'T-0801', 46460, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(141, 19, 13, '2022-05-05', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2113', 'K4-21260119', '805', 'T-805', 47960, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(142, 19, 14, '2022-05-06', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2114', 'K2-21261726', '805', 'T-805', 48060, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(143, 19, 15, '2022-05-06', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2115', 'K4-21270242', '805', 'T-805', 44260, 880, 'Big Burro', 712.8, 192.45, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.2, 0, 'Empty'),
(141, 19, 7, '2022-05-05', 2, 'Guadalupe', 'Quinones Pando', '2056', 'K5-21242331', '801-T2000', 'T-0801', 45400, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(144, 19, 8, '2022-05-05', 2, 'Guadalupe', 'Quinones Pando', '2057', 'K7-21251031', '801-T2000', 'T-0801', 45880, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(145, 19, 9, '2022-05-06', 2, 'Guadalupe', 'Quinones Pando', '2058', 'K4-21261020', '801-T2000', 'T-0801', 47440, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(146, 19, 10, '2022-05-06', 2, 'Guadalupe', 'Quinones Pando', '2059', 'K421262113', '801-T2000', 'T-0801', 47540, 880, 'Big Burro\n', 686.4, 185.33, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(149, 20, 1, '2022-05-07', 2, 'Guadalupe', 'Quinones Pando', '2060', 'K3-21271840', '801-T2000', 'T-0801', 46520, 880, 'Big Burro', 686.4, 185.33, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.6, 0, 'Empty'),
(150, 20, 2, '2022-05-07', 2, 'Guadalupe', 'Quinones Pando', '2061', 'K4-21280444', '801-T2000', 'T-0801', 46920, 910, 'Big burro', 709.8, 191.65, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 63.7, 0, 'Empty'),
(151, 20, 3, '2022-05-08', 2, 'Guadalupe', 'Quinones Pando', '2062', 'K3-21281453', '801-T2000', 'T-0801', 47280, 910, 'Big burro', 709.8, 191.65, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 63.7, 0, 'Empty'),
(152, 20, 4, '2022-05-08', 2, 'Guadalupe', 'Quinones Pando', '2063', 'K4-21282225', '801-T2000', 'T-0801', 47680, 910, 'Big burro', 709.8, 191.65, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 63.7, 0, 'Empty'),
(153, 20, 5, '2022-05-09', 2, 'Guadalupe', 'Quinones Pando', '2064', 'K3-21291200', '801-T2000', 'T-0801', 46980, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(154, 20, 6, '2022-05-09', 2, 'Guadalupe', 'Quinones Pando', '2065', 'K2-21291859', '801-T2000', 'T-0801', 47700, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(155, 20, 7, '2022-05-09', 2, 'Guadalupe', 'Quinones Pando', '2066', 'K3-21300253', '801-T2000', 'T-0801', 47760, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(156, 20, 8, '2022-05-10', 2, 'Guadalupe', 'Quinones Pando', '2067', 'K4-21301747', '801-T2000', 'T-0801', 46840, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(157, 20, 9, '2022-05-10', 2, 'Guadalupe', 'Quinones Pando', '2068', 'K7-21310131', '801-T2000', 'T-0801', 47340, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(158, 20, 10, '2022-05-11', 2, 'Guadalupe', 'Quinones Pando', '2069', 'K6-21311409', '801-T2000', 'T-0801', 47600, 930, 'Big burro', 725.4, 195.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(159, 20, 11, '2022-05-12', 2, 'Guadalupe', 'Quinones Pando', '2070', 'K1-21312307', '801-T2000', 'T-0801', 47760, 885, 'Big Burro', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 59.85, 0, 'Empty'),
(160, 20, 12, '2022-05-13', 2, 'Guadalupe', 'Quinones Pando', '2071', 'K4-21330228', '801-T2000', 'T-0801', 47720, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 62.65, 0, 'Empty'),
(161, 20, 13, '2022-05-13', 2, 'Guadalupe', 'Quinones Pando', '2072', 'K2-21331440', '801-T2000', 'T-0801', 47860, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 62.65, 0, 'Empty'),
(162, 20, 1, '2022-05-07', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2116', 'K6-21280321', '805', 'T-805', 47340, 910, 'Big burro', 737.1, 199.02, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 36.4, 0, 'Empty'),
(163, 20, 2, '2022-05-08', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2117', 'K4-21281058', '805', 'T-805', 47580, 910, 'Big burro', 737.1, 199.02, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 36.4, 0, 'Empty'),
(164, 20, 3, '2022-05-08', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2118', 'K1-21281832', '805', 'T-805', 48160, 930, 'Big burro', 753.3, 203.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 36.4, 0, 'Empty'),
(165, 20, 4, '2022-05-08', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2119', 'K121290342', '805', 'T-805', 48400, 910, 'Big burro', 737.1, 199.02, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 36.4, 0, 'Empty'),
(166, 20, 5, '2022-05-09', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2120', 'K6-21291526', '805', 'T-805', 47920, 930, 'Big burro', 753.3, 203.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 37.2, 0, 'Empty'),
(167, 20, 6, '2022-05-12', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2121', 'M3-21321225', '805', 'T-805', 47440, 793, 'Lila', 642.33, 173.43, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '91', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 31.72, 0, 'Empty'),
(168, 20, 7, '2022-05-13', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2122', 'K6-21330612', '805', 'T-805', 47560, 895, 'Weaver', 724.95, 195.74, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.8, 0, 'Empty'),
(169, 20, 8, '2022-05-13', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2123', 'K5-21331444', '805', 'T-805', 47920, 895, 'Weaver', 724.95, 195.74, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.8, 0, 'Empty'),
(170, 20, 1, '2022-05-09', 6, 'Jose', 'Avila', '2371', 'K7-21291912', '800-LF687', 'T-0800', 0, 930, 'Big burro', 725.4, 217.62, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty');
INSERT INTO `viaje` (`Id`, `Period`, `No_Trip`, `Date`, `Id_Driver`, `First_Name`, `Last_Name`, `Ticket`, `BOL`, `Truck`, `Trailer`, `Weight`, `Cost_of_the_trip`, `Description_of_the_cost`, `Amount`, `Driver_Pay`, `Year`, `Type`, `Added_By`, `Miles`, `Owner`, `Bonus`, `Bonus_Details`, `Ticket_Percentage`, `SJFS_Percentage`, `S_J_F_S`, `Bonus_Driver`, `Details_Bonus_Driver`) VALUES
(171, 20, 2, '2022-05-10', 6, 'Jose', 'Avila', '2372', 'K7-21301337', '800-LF687', 'T-0800', 0, 930, 'Big burro', 725.4, 217.62, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(172, 20, 3, '2022-05-11', 6, 'Jose', 'Avila', '2373', 'K3-21302142', '800-LF687', 'T-0800', 0, 930, 'Big burro', 725.4, 217.62, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(173, 20, 4, '2022-05-12', 6, 'Jose', 'Avila', '2374', 'K7-21311322', '800-LF687', 'T-0800', 0, 930, 'Big burro', 725.4, 217.62, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 65.1, 0, 'Empty'),
(174, 20, 5, '2022-05-12', 6, 'Jose', 'Avila', 'S/N', 'K1-21312227', '800-LF687', 'T-0800', 0, 795, 'Anderson b', 620.1, 186.03, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '88', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 55.65, 0, 'Empty'),
(175, 20, 6, '2022-05-13', 6, 'Jose', 'Avila', 'S/N', 'K5-21331302', '800-LF687', 'T-0800', 0, 895, 'Weaver', 698.1, 209.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 62.65, 0, 'Empty'),
(176, 20, 7, '2022-05-13', 6, 'Jose', 'Avila', 'S/N', 'S0057183033', '800-LF687', 'T-0800', 0, 895, 'Weaver', 698.1, 209.43, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 62.65, 0, 'Empty'),
(177, 21, 1, '2022-05-18', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3172', 'K2-21400321', '804-FREIGHTLINER', 'T-0804', 23.96, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(178, 21, 2, '2022-05-19', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3275', 'K1-21390415', '804-FREIGHTLINER', 'T-0804', 23.16, 885, 'weaver 1', 690.3, 186.38, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(179, 21, 3, '2022-05-20', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3169', 'K5-21401725', '804-FREIGHTLINER', 'T-0804', 24, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Ton', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(180, 21, 1, '2022-05-14', 2, 'Guadalupe', 'Quinones Pando', '2073', '1466789', '801-T2000', 'T-0801', 47060, 911, 'Alamo E', 710.58, 191.86, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '102', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 63.77, 0, 'Empty'),
(181, 21, 2, '2022-05-15', 2, 'Guadalupe', 'Quinones Pando', '2174', 'K6-21352219', '801-T2000', 'T-0801', 48180, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(182, 21, 3, '2022-05-16', 2, 'Guadalupe', 'Quinones Pando', '2075', 'K7-21360739', '801-T2000', 'T-0801', 45300, 885, 'Weaver 1', 690.3, 186.3, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(183, 21, 4, '2022-05-16', 2, 'Guadalupe', 'Quinones Pando', '2076', 'K2-21370020', '801-T2000', 'T-0801', 44960, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(184, 21, 5, '2022-05-17', 2, 'Guadalupe', 'Quinones Pando', '2077', '1469072', '801-T2000', 'T-0801', 45180, 605, 'Weaver 1', 471.9, 127.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '35', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 42.35, 0, 'Empty'),
(185, 21, 6, '2022-05-17', 2, 'Guadalupe', 'Quinones Pando', '2078', 'K7-21380240', '801-T2000', 'T-0801', 45620, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(186, 21, 7, '2022-05-18', 2, 'Guadalupe', 'Quinones Pando', '2079', 'K7-21390312', '801-T2000', 'T-0801', 46260, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(187, 21, 8, '2022-05-19', 2, 'Guadalupe', 'Quinones Pando', '2080', 'K7-21391026', '801-T2000', 'T-0801', 45380, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(188, 21, 9, '2022-05-19', 2, 'Guadalupe', 'Quinones Pando', '2082', '1471197', '801-T2000', 'T-0801', 46220, 605, 'Weaver 1', 471.9, 127.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '35', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 42.35, 0, 'Empty'),
(189, 21, 10, '2022-05-19', 2, 'Guadalupe', 'Quinones Pando', '2081', 'K7-21400158', '801-T2000', 'T-0801', 45720, 885, 'Weaver 1', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(190, 21, 11, '2022-05-20', 2, 'Guadalupe', 'Quinones Pando', '2083', 'K3-21402001', '801-T2000', 'T-0801', 46180, 885, 'Weaver', 690.3, 186.38, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15', 7, 61.95, 0, 'Empty'),
(191, 21, 1, '2022-05-14', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2124', '1466788', '805', 'T-805', 47880, 911, 'Alamo E\n', 737.91, 199.24, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '102', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 36.44, 0, 'Empty'),
(192, 21, 2, '2022-05-15', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2125', 'K1-21352215', '805', 'T-805', 47800, 885, 'Weaver 1 ', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(193, 21, 3, '2022-05-16', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2126', 'K2-21360741', '805', 'T-805', 47500, 885, 'Weaver 1 ', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(194, 21, 4, '2022-05-16', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2127', '14668503', '805', 'T-805', 46860, 605, 'Weaver 1\n', 490.05, 132.31, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '35', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 24.2, 0, 'Empty'),
(195, 21, 5, '2022-05-16', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2128', 'K4-21370059', '805', 'T-805', 47380, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(196, 21, 6, '2022-05-17', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2129', '1469070', '805', 'T-805', 46960, 605, 'Weaver 1\n', 490.05, 132.31, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '35', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 24.2, 0, 'Empty'),
(197, 21, 7, '2022-05-17', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2130', '1469672', '805', 'T-805', 47280, 605, 'Weaver 1\n', 490.05, 132.31, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '35', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 24.2, 0, 'Empty'),
(198, 21, 8, '2022-05-18', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2131', 'K2-21380855', '805', 'T-805', 47620, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(199, 21, 9, '2022-05-18', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2132', 'K2-21382202', '805', 'T-805', 47580, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(200, 21, 10, '2022-05-19', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2133', 'K6-21391406', '805', 'T-805', 47340, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(201, 21, 11, '2022-05-19', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2134', 'K6-21400231', '805', 'T-805', 47760, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(202, 21, 12, '2022-05-20', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2135', '1471246', '805', 'T-805', 46760, 605, 'Weaver 1\n', 490.05, 132.31, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '35', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 24.2, 0, 'Empty'),
(203, 21, 13, '2022-05-20', 4, 'ADRIAN', 'MONJE RODRIGUEZ', '2136', 'K1-21410146', '805', 'T-805', 47800, 885, 'Weaver 1\n', 716.85, 193.55, 2022, 'Pound', 'Perla Ruby Saenz Saldivar', '108', 'ADRIAN MONGE RODRIGUEZ', 0, 'Empty', '15', 4, 35.4, 0, 'Empty'),
(217, 21, 1, '5/13/2022', 6, 'Jose', 'Avila', '3169', '1466830', '800-LF687', 'T-800', 46480, 911, 'Alamo E', 710.58, 213.17, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '102.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 63.77, 0, 'EMPTY'),
(218, 21, 2, '5/16/2022', 6, 'Jose', 'Avila', '2379', 'K7-21360745', '800-LF687', 'T-800', 48200, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(219, 21, 3, '5/15/2022', 6, 'Jose', 'Avila', '2380', 'K5-21352224', '800-LF687', 'T-800', 47580, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(220, 21, 4, '5/17/2022', 6, 'Jose', 'Avila', '2381', '1469071', '800-LF687', 'T-800', 49140, 605, 'Weaver 1', 471.9, 141.57, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '35.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 42.35, 0, 'EMPTY'),
(221, 21, 5, '5/16/2022', 6, 'Jose', 'Avila', '2382', 'K3-21370025', '800-LF687', 'T-800', 48480, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(222, 21, 6, '5/17/2022', 6, 'Jose', 'Avila', '3166', '1469651', '800-LF687', 'T-800', 47960, 605, 'Weaver 1', 471.9, 141.57, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '35.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 42.35, 0, 'EMPTY'),
(223, 21, 7, '5/18/2022', 6, 'Jose', 'Avila', '2383', 'K3-21380902', '800-LF687', 'T-800', 48100, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(224, 21, 8, '5/18/2022', 6, 'Jose', 'Avila', '2385', 'K5-21382206', '800-LF687', 'T-800', 48260, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(225, 21, 9, '5/19/2022', 6, 'Jose', 'Avila', '2386', 'K7-2139-1411', '800-LF687', 'T-800', 48040, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(226, 21, 10, '5/19/2022', 6, 'Jose', 'Avila', '3173', 'K7-2140-0238', '800-LF687', 'T-800', 48380, 885, 'Weaver 1', 690.3, 207.09, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 61.95, 0, 'EMPTY'),
(227, 21, 11, '5/20/2022', 6, 'Jose', 'Avila', '2388', '1471240', '800-LF687', 'T-800', 48240, 605, 'Weaver 1', 471.9, 141.57, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '35.0', 'Santa Julia Freight Services LLC', 0, 'EMPTY', '15.0', 7, 42.35, 0, 'EMPTY'),
(228, 22, 1, '5/21/2022', 6, 'Jose', 'Avila', '3105', 'K7-21410150', '800-LF687', 'T-801', 48040, 895, 'Weaver 1', 698.1, 209.43, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(229, 22, 2, '5/21/2022', 6, 'Jose', 'Avila', '3178', 'K5-21411836', '800-LF687', 'T-801', 47980, 950, 'Weaver 1', 741, 222.3, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(230, 22, 3, '5/22/2022', 6, 'Jose', 'Avila', '3186', 'K7-21421454', '800-LF687', 'T-801', 48580, 950, 'Weaver 1', 741, 222.3, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(231, 22, 4, '5/23/2022', 1, 'Roman', 'Martinez', '2171', 'K6-21430659', '800-LF687', 'T-801', 47740, 895, 'Weaver 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(232, 22, 5, '5/23/2022', 1, 'Roman', 'Martinez', '2401', 'K6-21431724', '800-LF687', 'T-801', 48000, 895, 'Weaver 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(233, 22, 6, '5/23/2022', 1, 'Roman', 'Martinez', '2402', 'K4-21440309', '800-LF687', 'T-801', 48480, 895, 'Weaver 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(234, 22, 7, '5/24/2022', 1, 'Roman', 'Martinez', '2403', 'K7-21442132', '800-LF687', 'T-801', 48040, 895, 'Weaver 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(235, 22, 8, '5/26/2022', 1, 'Roman', 'Martinez', '2404', 'K2-21460558', '800-LF687', 'T-801', 48300, 895, 'Rincon 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(236, 22, 9, '5/26/2022', 1, 'Roman', 'Martinez', '2405', 'K2-214+61700', '800-LF687', 'T-801', 48440, 895, 'Rincon 1', 698.1, 223.39, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(237, 22, 1, '5/21/2022', 2, 'Guadalupe', 'Quinones Pando', '2084', '1471865', '801-T2000', 'T-801', 49240, 605, 'Weaver 1', 471.9, 127.41, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 42.35, 0, 'empty'),
(238, 22, 2, '5/21/2022', 2, 'Guadalupe', 'Quinones Pando', '2085', 'K7-21412007', '801-T2000', 'T-801', 45200, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(239, 22, 3, '5/22/2022', 2, 'Guadalupe', 'Quinones Pando', '2086', 'K7-21421543', '801-T2000', 'T-801', 45640, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(240, 22, 4, '5/22/2022', 2, 'Guadalupe', 'Quinones Pando', '2087', 'K3-21422235', '801-T2000', 'T-801', 45860, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(241, 22, 5, '5/23/2022', 2, 'Guadalupe', 'Quinones Pando', '2088', 'K5-21431255', '801-T2000', 'T-801', 44700, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(242, 22, 6, '5/23/2022', 2, 'Guadalupe', 'Quinones Pando', '2089', 'K2-21432044', '801-T2000', 'T-801', 45180, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(243, 22, 7, '5/24/2022', 2, 'Guadalupe', 'Quinones Pando', '2090', 'K4-21441144', '801-T2000', 'T-801', 45540, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(244, 22, 8, '5/26/2022', 2, 'Guadalupe', 'Quinones Pando', '2091', 'K5-21460657', '801-T2000', 'T-801', 45040, 895, 'Rincon 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(245, 22, 9, '5/26/2022', 2, 'Guadalupe', 'Quinones Pando', '2092', 'K4-21461426', '801-T2000', 'T-801', 45260, 895, 'Rincon 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'Santa Julia Freight Services LLC', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(246, 22, 1, '5/21/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3193', 'K3-21411228', '804-FREIGHTLINER', 'T-804', 47880, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(247, 22, 2, '5/21/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3187', 'K6-21411949', '804-FREIGHTLINER', 'T-804', 48380, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(248, 22, 3, '5/22/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '3183', 'K7-21421727', '804-FREIGHTLINER', 'T-804', 47700, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(249, 22, 4, '5/22/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2451', 'K7-21430131', '804-FREIGHTLINER', 'T-804', 47980, 950, 'Weaver 1', 741, 200.07, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 66.5, 0, 'empty'),
(250, 22, 5, '5/23/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2452', 'K6-21432158', '804-FREIGHTLINER', 'T-804', 47760, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(251, 22, 6, '5/24/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2453', 'K4-21441510', '804-FREIGHTLINER', 'T-804', 47360, 895, 'Weaver 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(252, 22, 7, '5/26/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2454', 'K6-21460546', '804-FREIGHTLINER', 'T-804', 47680, 895, 'Rincon 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty'),
(253, 22, 8, '5/27/2022', 3, ' LUIS ALBERTO', 'QUINONES VILLANUEVA', '2455', 'K7-21461539', '804-FREIGHTLINER', 'T-804', 47960, 895, 'Rincon 1', 698.1, 188.49, 2022, 'Pound', 'Jesus Alejandro Saenz Saldivar', '108', 'MIGUEL A. ARROYO / BRYAN CABALLERO   ', 0, 'Empty', '15.0', 7, 62.65, 0, 'empty');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
