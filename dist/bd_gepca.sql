# Host: localhost  (Version: 5.7.10-log)
# Date: 2016-12-12 20:15:50
# Generator: MySQL-Front 5.3  (Build 4.271)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "cargo"
#

DROP TABLE IF EXISTS `cargo`;
CREATE TABLE `cargo` (
  `cod_cargo` int(11) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `grado` int(11) NOT NULL,
  `sector` varchar(5) NOT NULL,
  PRIMARY KEY (`cod_cargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "cargo"
#

INSERT INTO `cargo` VALUES (1001,'Planificador de Area',22,'NEP'),(1002,'Planificador de Area',22,'SEP'),(1003,'Planificador de Area',22,'NWP'),(1004,'Planificador de Area',22,'SWP'),(1101,'Radarista de Area',25,'NER'),(1102,'Radarista de Area',25,'SER'),(1103,'Radarista de Area',25,'NWR'),(1104,'Radarista de Area',25,'SWR'),(2001,'Planificador Terminales',22,'SNP'),(2002,'Planificador Terminales',22,'SSP'),(2003,'Planificador Terminales',22,'SZP'),(2004,'Planificador Central',25,'SCP'),(2101,'Radarista de Terminales',25,'SNR'),(2102,'Radarista de Terminales',25,'SSR'),(2103,'Radarista de Terminales',25,'SZR'),(2104,'Radarista de Aproximacion',25,'SCR'),(3101,'Supervisor Radar',28,'SUP');

#
# Structure for table "curso"
#

DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `id_curso` int(11) NOT NULL,
  `nombreCurso` varchar(45) NOT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "curso"
#

INSERT INTO `curso` VALUES (1001,'BASICO AERODROMO','CONTROLADOR DE AERODROMO'),(1101,'RECURRENTE AERODROMO 01','AERODROMO ACTUALIZADO'),(2001,'NO RADAR','CONTROLADOR POR PROCEDIMIENTOS'),(2101,'RECURRENTE NO RADAR','CONTROLADOR POR PROCEDIMIENTOS ACTUALIZADO'),(3001,'RADAR','CONTROLADOR AEREO RADAR'),(3101,'RECURRENTE RADAR','CONTROLADOR AEREO RADAR ACTUALIZADO'),(4001,'SUPERVISOR RADAR','SUPERVISOR SALA RADAR'),(4101,'RECURRENTE SUPERVISOR RADAR','SUPERVISOR SALA RADAR ACTUALIZADO'),(5101,'INSTRUCTOR ATS/OJT','INSTRUCTOR ATS/OJT'),(5201,'PROCEDIMIENTOS','EXPERTO EN CONSTRUCCIÃ“N DE PROCEDIMIENTOS'),(6001,'SEMINARIO SMS PARA ATS','ANALISTA DE SMS PARA ATS'),(7001,'B','BB');

#
# Structure for table "personal"
#

DROP TABLE IF EXISTS `personal`;
CREATE TABLE `personal` (
  `num_cedula` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `num_telefono` double DEFAULT NULL,
  `correo` varchar(45) NOT NULL,
  `fec_ingreso` date DEFAULT NULL,
  `perfil` varchar(13) NOT NULL DEFAULT '',
  `usuario` varchar(4) NOT NULL,
  `clave` varchar(255) DEFAULT NULL,
  `estado` varchar(17) NOT NULL DEFAULT '',
  PRIMARY KEY (`num_cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "personal"
#

INSERT INTO `personal` VALUES (0,'ADMINISTRADOR','GEPCA',5555555,'gepca@aerocivil.gov.co','2016-10-01','ADMINISTRADOR','ADM','1234','Activo'),(12345,'PRUEBA','PRUEBA',55555,'j@gmail.com','2016-12-01','ADMINISTRADOR','PRUE','1234','Activo'),(4252097,'GILBERTO','RONDON ',33333333,'gilberto.rondon@aerocivil.gov.co','2016-10-02','PERSONAL','GR','1234','Vacaciones'),(11111111,'COORDINADOR','ACC BOG',111111111,'coordinador@aerocivil.gov.co','2016-10-03','COORDINADOR','CO','1234','Vacaciones'),(22222222,'ACADEMICO','CEA',22222222,'academico@aerocivil.gov.co','2016-10-04','ACADEMICO','AC','1234','Vacaciones'),(32861984,'IRINA','LARA',33333333,'irina.lara@aerocivil.gov.co','2016-10-05','PERSONAL','IL','1234','Activo'),(33333333,'PEPOTI','PEREZ',33333333,'pepi@aerocivil.gov.co','2016-10-06','PERSONAL','PP','1234','Activo'),(51689897,'YURI','CORREDOR',33333333,'yuri.corredor@aerocivil.gov.co','2016-10-07','PERSONAL','YC','1234','Activo'),(51951751,'LUZ ADRIANA','RUBIO SINISTERRA',3116307277,'luz.rubio@aerocivil.gov.co','2016-10-08','INSTRUCTOR','LA','1234','Vacaciones'),(52029080,'SANDRA LILIANA ','ZORRILLA SOLER',33333333,'sandra.zorrilla@aerocivil.gov.co','2016-10-09','PERSONAL','SZ','1234','Incapacitado'),(55555555,'DAMASO','PENUELA',33333333,'damaso.penuela@aerocivil.gov.co','2016-10-10','PERSONAL','PE','1234','Capacitación'),(79318319,'JOSE','CARDONA',33333333,'jose.cardona@aerocivil.gov.co','2016-10-11','PERSONAL','OC','1234','Capacitación'),(79391003,'JUAN','RAMIREZ',33333333,'juan.ramirez@aerocivil.gov.co','2016-10-12','PERSONAL','RJ','1234','Activo'),(79683315,'FREDY','CELIS ',33333333,'freddy.celis@aerocivil.gov.co','2016-10-13','PERSONAL','HC','1234','Comision'),(79719373,'GUSTAVO','TORRES',33333333,'gustavo.torres@aerocivil.gov.co','2016-10-14','PERSONAL','GA','1234','Vacaciones'),(79940526,'CESAR','LOPEZ',33333333,'cesar.lopez@aerocivil.gov.co','2016-10-15','PERSONAL','CL','1234','Activo'),(1022333159,'JORGE ANDRES','HOLGUIN',3015839988,'jholguinmed@gmail.com','2016-12-06','ADMINISTRADOR','JAHM','12345','Vacaciones');

#
# Structure for table "cargo_his"
#

DROP TABLE IF EXISTS `cargo_his`;
CREATE TABLE `cargo_his` (
  `sec_cargo` int(11) NOT NULL AUTO_INCREMENT,
  `cargo_cod_cargo` int(11) NOT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  `fec_cargo` date NOT NULL,
  PRIMARY KEY (`sec_cargo`),
  KEY `fk_cargo_has_personal_personal1_idx` (`personal_num_cedula`),
  KEY `fk_cargo_has_personal_cargo1_idx` (`cargo_cod_cargo`),
  CONSTRAINT `fk_cargo_has_personal_cargo1` FOREIGN KEY (`cargo_cod_cargo`) REFERENCES `cargo` (`cod_cargo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cargo_has_personal_personal1` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;

#
# Data for table "cargo_his"
#

INSERT INTO `cargo_his` VALUES (1,1001,4252097,'2000-10-01'),(2,1002,4252097,'2000-10-01'),(3,1003,4252097,'2000-10-01'),(4,1004,4252097,'2000-10-01'),(5,1101,4252097,'2005-10-01'),(6,1102,4252097,'2005-10-01'),(7,1103,4252097,'2005-10-01'),(8,1104,4252097,'2005-10-01'),(9,2001,11111111,'2000-10-01'),(10,2001,11111111,'2000-10-01'),(11,2002,11111111,'2000-10-01'),(12,2101,22222222,'2012-01-01'),(13,2004,11111111,'2000-10-01'),(14,2101,11111111,'2005-10-01'),(15,2102,11111111,'2005-10-01'),(16,2103,11111111,'2005-10-01'),(17,2104,11111111,'2005-10-01'),(18,3101,11111111,'2012-01-01'),(19,2001,22222222,'2005-01-01'),(20,2002,22222222,'2005-01-01'),(21,2003,22222222,'2005-01-01'),(22,2004,22222222,'2005-01-01'),(23,2102,22222222,'2012-01-01'),(24,2103,22222222,'2012-01-01'),(25,2104,22222222,'2016-01-01'),(26,1001,32861984,'2007-01-01'),(27,1002,32861984,'2007-01-01'),(28,1003,32861984,'2007-01-01'),(29,1004,32861984,'2007-01-01'),(30,1101,33333333,'2013-01-01'),(31,2001,51689897,'2003-01-01'),(32,2002,51689897,'2003-01-01'),(33,2003,51689897,'2003-01-01'),(34,1001,51951751,'1996-06-01'),(35,1002,51951751,'1996-06-01'),(36,1003,51951751,'1996-06-01'),(37,1004,51951751,'1996-06-01'),(38,1101,51951751,'1998-06-01'),(39,1102,51951751,'1998-06-01'),(40,1103,51951751,'1998-06-01'),(41,1104,51951751,'1998-06-01'),(42,3101,51951751,'2008-06-01'),(43,1001,52029080,'2000-06-01'),(44,1002,52029080,'2000-06-01'),(45,1003,52029080,'2000-06-01'),(46,1004,52029080,'2000-06-01'),(47,1101,52029080,'2005-06-01'),(48,1102,52029080,'2005-06-01'),(49,1103,52029080,'2005-06-01'),(50,1104,52029080,'2005-06-01'),(51,1003,55555555,'2005-06-01'),(52,1004,55555555,'2005-06-01'),(53,2001,79318319,'2005-06-01'),(54,2002,79318319,'2005-06-01'),(55,2003,79318319,'2005-06-01'),(56,2101,79318319,'2005-06-01'),(57,2102,79318319,'2005-06-01'),(58,2103,79318319,'2005-06-01'),(59,2001,79391003,'2000-06-01'),(60,2002,79391003,'2000-06-01'),(61,2003,79391003,'2000-06-01'),(62,2004,79391003,'2004-06-01'),(63,2101,79391003,'2004-06-01'),(64,2102,79391003,'2004-06-01'),(65,2103,79391003,'2004-06-01'),(66,2104,79391003,'2005-06-01'),(67,3101,79391003,'2008-06-01'),(68,1001,79683315,'2005-06-01'),(69,1002,79683315,'2005-06-01'),(70,1101,79683315,'2009-06-01'),(71,1102,79683315,'2009-06-01'),(72,1003,79719373,'2005-06-01'),(73,1004,79719373,'2005-06-01'),(74,1103,79719373,'2009-06-01'),(75,1104,79719373,'2009-06-01'),(76,1101,79940526,'2003-06-01'),(77,1102,79940526,'2003-06-01'),(78,1103,79940526,'2003-06-01'),(79,1104,79940526,'2003-06-01'),(80,1001,1022333159,'2016-12-15'),(81,3101,1022333159,'2016-12-09'),(82,2102,1022333159,'2016-12-15');

#
# Structure for table "capacitacion"
#

DROP TABLE IF EXISTS `capacitacion`;
CREATE TABLE `capacitacion` (
  `id_matricula` int(11) NOT NULL AUTO_INCREMENT,
  `curso_id_curso` int(11) NOT NULL,
  `puntaje` int(11) DEFAULT NULL,
  `personal_num_cedula1` int(11) NOT NULL,
  PRIMARY KEY (`id_matricula`),
  KEY `fk_personal_has_curso_curso1_idx` (`curso_id_curso`),
  KEY `fk_capacitacion_personal1_idx` (`personal_num_cedula1`),
  CONSTRAINT `fk_capacitacion_personal1` FOREIGN KEY (`personal_num_cedula1`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_personal_has_curso_curso1` FOREIGN KEY (`curso_id_curso`) REFERENCES `curso` (`id_curso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1010 DEFAULT CHARSET=utf8;

#
# Data for table "capacitacion"
#

INSERT INTO `capacitacion` VALUES (1,1001,92,51951751),(2,1001,92,4252097),(3,1001,92,11111111),(4,1001,92,22222222),(5,2001,75,33333333),(6,1001,92,33333333),(7,2001,85,51689897),(8,1001,92,52029080),(9,1001,92,79318319),(10,1001,92,79391003),(11,1001,92,79683315),(12,1001,92,79719373),(13,1001,92,79940526),(14,1001,92,32861984),(15,1001,92,51689897),(16,1001,92,55555555),(17,2001,85,51951751),(18,2001,85,52029080),(19,2001,95,4252097),(20,2001,95,11111111),(21,2001,95,22222222),(22,2001,95,32861984),(23,2001,85,55555555),(24,2001,85,79318319),(25,2001,85,79391003),(26,2001,85,79683315),(27,2001,85,79719373),(28,2001,85,79940526),(29,3001,85,4252097),(30,3001,85,11111111),(31,3001,85,22222222),(32,3001,85,51951751),(33,3001,85,52029080),(34,3001,85,79318319),(35,3001,85,79391003),(36,3001,85,79683315),(37,3001,85,79719373),(38,3001,85,79940526),(39,4001,85,11111111),(40,4001,85,51951751),(41,4001,85,79391003),(42,5101,85,11111111),(43,5101,85,51951751),(44,5101,85,79719373),(45,5201,85,79683315),(46,6001,85,79318319),(1001,1001,92,51951751),(1004,1001,90,1022333159),(1005,7001,90,1022333159),(1007,3101,95,1022333159),(1008,7001,97,1022333159),(1009,7001,99,1022333159);

#
# Structure for table "programa"
#

DROP TABLE IF EXISTS `programa`;
CREATE TABLE `programa` (
  `cod_programa` int(11) NOT NULL,
  `programa` varchar(45) NOT NULL,
  `duracion` int(11) NOT NULL,
  PRIMARY KEY (`cod_programa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "programa"
#

INSERT INTO `programa` VALUES (1,'Planificador area eco',30),(2,'Planificador area eco 40',12),(3,'Planificador area eco 20',6),(4,'Planificador area wiskey 40',12),(5,'Planificador area alfa',15),(6,'Planificador area wiskey',30),(7,'Planificador terminal sur',30),(8,'Planificador terminal norte 40',12),(9,'Titular radar area ECO',30),(10,'Titular radar area ECO 40',12),(11,'Titular radar area wiskey',30),(12,'Titular radar area alfa',12),(13,'Titular radar area wiskwy 40',12),(14,'Titular radar area sur',30),(15,'Titular radar area sur 20',6),(16,'Titular radar area nortre',30),(17,'Titular radar area nortre 40',12),(18,'Planificador de aproximacion',20),(19,'Titular aproximador radar 40',12),(20,'Supervisor',8);

#
# Structure for table "instructor"
#

DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor` (
  `cod_instructor` int(11) NOT NULL,
  `desc_instructor` varchar(45) NOT NULL,
  `programa_cod_programa` int(11) NOT NULL,
  PRIMARY KEY (`cod_instructor`),
  KEY `fk_instructor_programa1_idx` (`programa_cod_programa`),
  CONSTRAINT `fk_instructor_programa1` FOREIGN KEY (`programa_cod_programa`) REFERENCES `programa` (`cod_programa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "instructor"
#

INSERT INTO `instructor` VALUES (1,'instructor1',1),(2,'instructor2',2),(3,'instructor3',3),(4,'instructor4',4),(5,'instructor5',5),(6,'instructor6',6),(7,'instructor7',7),(8,'instructor8',8),(9,'instructor9',9),(10,'instructor10',10),(11,'instructor11',11),(12,'instructor12',12),(13,'instructor13',13),(14,'instructor14',14),(15,'instructor15',15),(16,'instructor16',16),(17,'instructor17',17),(18,'instructor18',18),(19,'instructor19',19);

#
# Structure for table "programa_ento"
#

DROP TABLE IF EXISTS `programa_ento`;
CREATE TABLE `programa_ento` (
  `id_programa` int(11) NOT NULL AUTO_INCREMENT,
  `fechaInicio` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  `capacitacion_id_matricula` int(11) NOT NULL,
  `programa_cod_programa` int(11) NOT NULL,
  `programa_entocol` varchar(45) NOT NULL,
  PRIMARY KEY (`id_programa`),
  KEY `fk_programaEnto_personal1_idx` (`personal_num_cedula`),
  KEY `fk_programaEnto_capacitacion1_idx` (`capacitacion_id_matricula`),
  KEY `fk_programaEnto_programa1_idx` (`programa_cod_programa`),
  CONSTRAINT `fk_programaEnto_capacitacion1` FOREIGN KEY (`capacitacion_id_matricula`) REFERENCES `capacitacion` (`id_matricula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_programaEnto_personal1` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_programaEnto_programa1` FOREIGN KEY (`programa_cod_programa`) REFERENCES `programa` (`cod_programa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "programa_ento"
#

INSERT INTO `programa_ento` VALUES (1,'2017-01-15','2017-02-05',79318319,1,18,'Exitoso'),(2,'2017-01-15','2017-02-15',55555555,1,1,'Exitoso'),(3,'2017-02-15','2017-02-27',55555555,1,2,'En proceso'),(4,'2016-12-13','2016-12-30',1022333159,1001,14,'En proceso');

#
# Structure for table "vacaciones"
#

DROP TABLE IF EXISTS `vacaciones`;
CREATE TABLE `vacaciones` (
  `idVacaciones` int(11) NOT NULL AUTO_INCREMENT,
  `fec_inicio` date DEFAULT NULL,
  `duracion` int(11) DEFAULT NULL,
  `fec_fin` date DEFAULT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  PRIMARY KEY (`idVacaciones`),
  KEY `fk_Vacaciones_personal_idx` (`personal_num_cedula`),
  CONSTRAINT `fk_Vacaciones_personal` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

#
# Data for table "vacaciones"
#

INSERT INTO `vacaciones` VALUES (1,'2016-12-15',15,'2017-01-05',4252097),(2,'2016-12-15',15,'2017-01-05',11111111),(3,'2016-12-15',30,'2017-01-15',22222222),(4,'2016-12-25',30,'2017-01-25',55555555),(5,'2016-12-15',30,'2017-01-05',79318319),(6,'2016-12-01',14,'2016-12-15',1022333159),(7,'2016-12-16',14,'2016-12-30',79719373),(8,'2016-12-23',7,'2016-12-30',51951751);
