CREATE DATABASE MUSICA20;

USE MUSICA20;


CREATE TABLE IF NOT EXISTS `artista` (
  `dni` varchar(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `artista` (`dni`, `nombre`) VALUES
('1111111111', 'Adrian Lee'),
('1111111112', 'Adam Clayton'),
('1111111113', 'Bono'),
('1111111114', 'C. Burchill'),
('1111114444', 'Carlos Torero'),
('2345678444', 'Edge'),
('3232456547', 'Phil Collins'),
('3333567898', 'Santiago Auserón'),
('3454677777', 'Jim Kerr'),
('4444444444', 'Larry Jr.Mullen'),
('4454321111', 'Luis Auserón'),
('5454532222', 'Paul Young'),
('5555678976', 'Enrique Sierra'),
('5556787777', 'J.L. Giménez'),
('5656378999', 'Soledad Giménez'),
('6666667885', 'Nacho Maño'),
('7654323234', 'P. van Hooke'),
('7876543428', 'Tony Banks'),
('8884566666', 'M. Rutherford');

CREATE TABLE IF NOT EXISTS `cancion` (
  `cod` int(11) NOT NULL,
  `titulo` varchar(30) NOT NULL,
  `duracion` double DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `cancion` (`cod`, `titulo`, `duracion`) VALUES
(1, '20th Century Promise', 4),
(2, '37 grados', 4),
(3, '4th of July', 3),
(4, '7 Deadly Sins', 6),
(5, 'A cara o cruz', 5),
(6, 'A sort of homecoming', 3),
(7, 'Afterglow', 4),
(8, 'Al atardecer', 4),
(9, 'Al sur', 3),
(10, 'Alive And Kicking', 4),
(11, 'All The things She..', 4),
(12, 'Alma de blues', 4),
(13, 'And The Band ...', 4),
(14, 'Andas junto a mí', 3),
(15, 'Annabel Lee', 3),
(16, 'Anything she does', 3),
(17, 'Artitoestoy', 4),
(18, 'Asoma el llanto', 3),
(19, 'Babyface', 4),
(20, 'Bad', 2),
(21, 'Barbara del campo', 4),
(22, 'Beautiful day', 5),
(23, 'Before', 4),
(24, 'Black and blue', 3),
(25, 'Blame', 4),
(26, 'Book of Brilliant...', 5),
(27, 'Brazilian', 4),
(28, 'Cada historia', 3),
(29, 'Can''t dance', 4),
(30, 'Careful In Career', 4),
(31, 'Carpet crawlers', 4),
(32, 'Cinema show', 5),
(33, 'Come A Long Way', 2),
(34, 'Cómo hemos cambiado', 3),
(35, 'Criminal World', 5),
(36, 'Cuando quiero sol', 5),
(37, 'Daddys Goma pay for', 5),
(38, 'Dance on a volcano', 4),
(39, 'De puntillas', 3),
(40, 'De sol a sol', 4),
(41, 'Dirty day', 5),
(42, 'Domino', 5),
(43, 'Don''t', 4),
(44, 'Dreaming while ...', 4),
(45, 'Driving the last...', 4),
(46, 'E.de C. instrumental', 3),
(47, 'East At Easter', 4),
(48, 'El canto del gallo', 5),
(49, 'El hombre de papel', 2),
(50, 'El nadador', 3),
(51, 'Elvis Presley & USA', 3);

CREATE TABLE IF NOT EXISTS `club` (
  `cod` varchar(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `sede` varchar(30) DEFAULT NULL,
  `num` smallint(6) DEFAULT NULL,
  `cod_gru` varchar(3) NOT NULL,
  PRIMARY KEY (`cod`),
  KEY `Reference2` (`cod_gru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `club` (`cod`, `nombre`, `sede`, `num`, `cod_gru`) VALUES
('1', 'Zoomanía', '33, Abbey Road', 2508, '1'),
('10', 'Machines', 'Calle 3, Lab 3', 7789, '3'),
('11', 'Jardín Botánico', '203,Valencia 46004', 357, '6'),
('12', 'Bonoculture', '12, East Av.', 129, '1'),
('13', 'Waterfront', 'C/Martín Blas 22', 234, '2'),
('14', 'FanMike', 'Beverly Hills 90210', 11, '3'),
('15', 'Presuntos', 'C/Albacete 12, bajo', 237, '5'),
('16', 'Implicado', 'Torrejón de Ardoz 12', 25, '5'),
('17', 'Los Culpables', 'C/Maria Cristina 67', 355, '5'),
('2', 'u2foryou', '23, 11th Street', 1700, '1'),
('3', 'Ché U2', 'C/Almussafes 59', 239, '1'),
('4', 'Troglominds', 'C/Lepe 22', 999, '2'),
('5', 'Mentes Fuertes', 'Ramón y Cajal 14', 1984, '2'),
('6', 'The best mind', '24, Homeround', 1413, '2'),
('7', 'Genefans', 'C/Visitación 34', 23412, '4'),
('8', 'Fanaticgens', 'Av. H. Dominicos 155', 12002, '4'),
('9', 'Futuristas', 'C/Alboraya 10', 9850, '6');

CREATE TABLE IF NOT EXISTS `companyia` (
  `cod` varchar(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `dir` varchar(30) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `tfno` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `companyia` (`cod`, `nombre`, `dir`, `fax`, `tfno`) VALUES
('1', 'Island', '67, JB St.', '     78782222', '     72724444'),
('2', 'ARIOLA', 'Aragón 204', '    913667889', '    913667890'),
('3', 'WEA', 'L Hoyos 42', '    932401212', '    932401213'),
('4', 'Virgin', '2,23th St.', '     20812445', '     20812446'),
('5', 'ATLANTIC', '12, E St.', '      5481223', '      5482312'),
('6', 'PoliDiscos', 'Camí de Vera', '      3870001', '      3870000'),
('7', 'PoliDiscos', 'Polynesia St.', '    942380540', '    942380522');

CREATE TABLE IF NOT EXISTS `disco` (
  `cod` varchar(3) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `cod_comp` varchar(3) NOT NULL,
  `cod_gru` varchar(3) NOT NULL,
  PRIMARY KEY (`cod`),
  KEY `Reference5` (`cod_comp`),
  KEY `Reference6` (`cod_gru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `disco` (`cod`, `nombre`, `fecha`, `cod_comp`, `cod_gru`) VALUES
('1', 'October', '1981-10-12 00:00:00', '1', '1'),
('10', 'Word of mouth', '1991-05-07 00:00:00', '5', '3'),
('11', 'We can''t dance', '1991-02-02 00:00:00', '5', '4'),
('12', 'Invisible touch', '1986-03-03 00:00:00', '5', '4'),
('13', 'Seconds out', '1986-08-08 00:00:00', '5', '4'),
('14', 'De sol a sol', '1987-01-08 00:00:00', '3', '5'),
('15', 'Ser de agua', '1991-02-05 00:00:00', '3', '5'),
('16', 'Alma de blues', '1989-02-03 00:00:00', '3', '5'),
('17', 'La ley del desierto', '1984-03-02 00:00:00', '2', '6'),
('18', 'La canción de JPerro', '1987-04-03 00:00:00', '2', '6'),
('2', 'Zooropa', '1994-08-10 00:00:00', '1', '1'),
('3', 'The unforgettable fi', '1983-03-07 00:00:00', '1', '1'),
('4', 'Achtung baby', '1991-12-09 00:00:00', '1', '1'),
('5', 'Once upon a time', '1985-10-10 00:00:00', '4', '2'),
('6', 'Good news F.N. world', '1995-11-12 00:00:00', '4', '2'),
('7', 'Sparkle in the rain', '1984-03-03 00:00:00', '4', '2'),
('8', 'Sister feelings call', '1981-03-04 00:00:00', '4', '2'),
('9', 'Living years', '1988-04-02 00:00:00', '5', '3');

CREATE TABLE IF NOT EXISTS `esta` (
  `can` int(11) NOT NULL,
  `cod` varchar(3) NOT NULL,
  PRIMARY KEY (`can`,`cod`),
  KEY `Reference1` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `esta` (`can`, `cod`) VALUES
(23, '10'),
(29, '11'),
(44, '11'),
(45, '11'),
(16, '12'),
(27, '12'),
(42, '12'),
(7, '13'),
(31, '13'),
(32, '13'),
(38, '13'),
(9, '14'),
(40, '14'),
(8, '15'),
(14, '15'),
(21, '15'),
(34, '15'),
(36, '15'),
(39, '15'),
(12, '16'),
(18, '16'),
(28, '16'),
(46, '17'),
(50, '17'),
(2, '18'),
(5, '18'),
(15, '18'),
(48, '18'),
(49, '18'),
(19, '2'),
(37, '2'),
(41, '2'),
(3, '3'),
(6, '3'),
(20, '3'),
(51, '3'),
(17, '4'),
(10, '5'),
(11, '5'),
(33, '5'),
(4, '6'),
(13, '6'),
(35, '6'),
(26, '7'),
(47, '7'),
(1, '8'),
(30, '8'),
(22, '9'),
(24, '9'),
(25, '9'),
(43, '9');

CREATE TABLE IF NOT EXISTS `grupo` (
  `cod` varchar(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `pais` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `grupo` (`cod`, `nombre`, `fecha`, `pais`) VALUES
('1', 'U2', '1977-01-01 00:00:00', 'Inglaterra'),
('2', 'Simple Minds', '1979-02-09 00:00:00', 'Inglaterra'),
('3', 'Mike + The Mechanics', '1988-04-06 00:00:00', 'Inglaterra'),
('4', 'Genesis', '1975-10-10 00:00:00', 'Inglaterra'),
('5', 'Presuntos Implicados', '1985-11-01 00:00:00', 'España'),
('6', 'Radio Futura', '1980-01-07 00:00:00', 'España');

CREATE TABLE IF NOT EXISTS `pertenece` (
  `dni` varchar(10) NOT NULL,
  `cod` varchar(3) NOT NULL,
  `funcion` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`dni`,`cod`),
  KEY `Reference3` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `pertenece` (`dni`, `cod`, `funcion`) VALUES
('1111111111', '3', 'teclado'),
('1111111112', '1', 'bajo'),
('1111111113', '1', 'voz'),
('1111111114', '2', 'guitarra'),
('1111114444', '6', 'batería'),
('2345678444', '1', 'guitarra'),
('3232456547', '4', 'voz'),
('3333567898', '6', 'voz'),
('3454677777', '2', 'voz'),
('4444444444', '1', 'batería'),
('4454321111', '6', 'bajo'),
('5454532222', '3', 'voz'),
('5555678976', '6', 'guitarra'),
('5556787777', '5', 'guitarra'),
('5656378999', '5', 'voz'),
('6666667885', '5', 'bajo'),
('7654323234', '3', 'batería'),
('7876543428', '4', 'teclado'),
('8884566666', '3', 'bajo'),
('8884566666', '4', 'bajo');

ALTER TABLE `club`
  ADD CONSTRAINT `Reference2` FOREIGN KEY (`cod_gru`) REFERENCES `grupo` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE `disco`
  ADD CONSTRAINT `Reference5` FOREIGN KEY (`cod_comp`) REFERENCES `companyia` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Reference6` FOREIGN KEY (`cod_gru`) REFERENCES `grupo` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE `esta`
  ADD CONSTRAINT `Reference` FOREIGN KEY (`can`) REFERENCES `cancion` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Reference1` FOREIGN KEY (`cod`) REFERENCES `disco` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION;


ALTER TABLE `pertenece`
  ADD CONSTRAINT `Reference3` FOREIGN KEY (`cod`) REFERENCES `grupo` (`cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Reference4` FOREIGN KEY (`dni`) REFERENCES `artista` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;