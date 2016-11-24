-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-11-2016 a las 03:59:14
-- Versión del servidor: 5.7.10-log
-- Versión de PHP: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bds_gepca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capacitacion`
--

CREATE TABLE `capacitacion` (
  `id_matricula` int(11) NOT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  `curso_id_curso` int(11) NOT NULL,
  `puntaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `cod_cargo` int(11) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `salario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo_his`
--

CREATE TABLE `cargo_his` (
  `sec_cargo` int(11) NOT NULL,
  `cargo_cod_cargo` int(11) NOT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  `fec_cargo` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_curso` int(11) NOT NULL,
  `nombreCurso` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE `instructor` (
  `cod_instructor` int(11) NOT NULL,
  `desc_instructor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `num_cedula` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `num_telefono` int(10) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `fecha_ingreso` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`num_cedula`, `nombre`, `apellido`, `num_telefono`, `correo`, `fecha_ingreso`) VALUES
(7165830, 'JOY CARMEL', 'CABALLERO BERNAL', 5555555, 'prueba@prueba.com', '2016-11-01'),
(7224639, 'JUAN CARLOS', 'ARAQUE MARINO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(9133868, 'JAIME ALFONSO', 'CURE PÉREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(11346233, 'NELSON EDUARDO', 'RUSSI GONZÁLEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(13461142, 'JORGE MANUEL', 'JORDÁN SUÁREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(13478916, 'JOSE LUIS', 'LOBO YANEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(13499912, 'VIRGILIO MARTÃÍNEZ', 'COTE', 5555555, 'prueba@prueba.com', '2016-11-01'),
(15244695, 'JAVIER ARTURO', 'RAVÉ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(15434892, 'JORGE HERNANDO', 'ATEHORTUA ARANGO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(16699367, 'HARLEM MEJIA', 'OLIVEROS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(18008536, 'LUIS ENRIQUE', 'MENDOZA BARBOSA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(19347661, 'JULIÁN ZULUAGA', 'CARDENAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(19347937, 'VÍCTOR HUGO', 'ROA CORTES', 5555555, 'prueba@prueba.com', '2016-11-01'),
(19446257, 'GUSTAVO SUESCÚN', 'MARTÍNEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(19466607, 'MIGUEL ÁNGEL', 'LASPRILLA ZAPATA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(19497672, 'ALFREDO SANTIAGO', 'IGUARAN IGUARAN', 5555555, 'prueba@prueba.com', '2016-11-01'),
(23555410, 'MARIA HAIDET', 'CUEVAS AVELLANEDA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(30396525, 'ADRIANA MARCELA', 'MUÑOZ MARQUEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(32731834, 'DIANA LUZ', 'CASTILLO SUÁREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(32861984, 'IRINA TERESA', 'LARA TEJEDA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(35410183, 'SANDRA PATRICIA', 'GAITAN BECERRA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(35531431, 'ADRIANA LIZETH', 'MEJIA VILLANUEVA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(39751802, 'NANCY ESPERANZA', 'ZAMBRANO ROJAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(39754090, 'SANDRA PATRICIA', 'ARÉVALO BONILLA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(39755615, 'MARIA INES', 'MARTÍNEZ JURADO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(39757048, 'RUTH EDITH', 'SARMIENTO HERNÁNDEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51689897, 'YURY YADIRA', 'CORREDOR RODRIGUEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51719447, 'ADRIANA VIATELA', 'LOZANO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51856597, 'CLAUDIA NELLY', 'GUTIÉRREZ MARULANDA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51889836, 'ELSA ISABEL', 'ARGAEZ LEÓN', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51951751, 'LUZ ADRIANA', 'RUBIO SINISTERRA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(51968800, 'MARTHA CRISTINA', 'LOZANO GONZALEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52029080, 'SANDRA LILIANA', 'ZORRILLA SOLER', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52034698, 'BÁRBARA PATRICIA', 'GERALDI MANTILLA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52085578, 'ALEXANDRA PATRICIA', 'ANGEL GRANADOS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52112810, 'MARITZA RUIZ', 'ROJAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52169869, 'CLAUDIA PATRICIA', 'MUNAR PANQUEVA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52268589, 'GLORIA MARÍA', 'NEMOCÓN RAMÍREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52342843, 'ANGELA MARÍA', 'MARTÍN HUERTAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52437121, 'NANCY ALIETH', 'MORALES COLMENARES', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52551281, 'DIANA PULIDO', 'BOHÓRQUEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52552382, 'NANCY CASTILLO', 'RAMIREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(52831919, 'CLAUDIA VIVIANA', 'OROZCO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(72192218, 'CARLOS ARTURO', 'TORRES GUTIÉRREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79043649, 'CARLOS ALBERTO', 'CARDONA ABADIA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79051943, 'FERNANDO MORENO', 'PENAGOS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79116184, 'GERMAN LÓPEZ', 'GIRALDO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79131905, 'HAROL CARDENAS', 'ROJAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79135643, 'EDGAR MAURICIO', 'ALZATE DEL', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79135968, 'JHON JAIRO', 'HINESTROZA VALENZUELA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79139454, 'MIGUEL ÁNGEL', 'PEREA RODRIGUEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79274107, 'SANTIAGO CAMACHO', 'MÉNDEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79300735, 'MYYEY WILSON', 'CRUZ VELANDIA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79310798, 'BERNARDO ORTIZ', 'GARCÍA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79318319, 'JOSE OMAR', 'CARDONA VILLARRAGA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79326534, 'CARLOS ARTURO', 'BERMÚDEZ NIÑO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79327270, 'JUAN ALBERTO', 'ANDRADE PÁEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79328054, 'MARIO ARNULFO', 'MERCHÁN VELA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79335364, 'MEDARDO ARSECIO', 'FIGUEROA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79361275, 'NELSON H.', 'LANCHEROS AVELLANEDA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79362358, 'JAIME CALDERÓN', 'NEISA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79388054, 'CARLOS ANDRES', 'F. GONZÁLEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79390312, 'SERGIO CASTILLO', 'RINCÓN', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79391003, 'JUAN CARLOS', 'RAMIREZ GONZALEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79412670, 'GUILLERMO BARRERA', 'CASAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79421703, 'MAURICIO FERRER', 'MEJIA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79424139, 'HARVEY BERNAL', 'MORENO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79426933, 'WILLIAM ERNESTO', 'ROJAS ACERO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79434227, 'SERGIO LUIS', 'ACOSTA ABRIL', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79436985, 'EDGAR ALBERTO', 'SÁNCHEZ REYES', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79447514, 'GONZALO TALERO', 'VILLALBA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79467558, 'JHON EDGAR', 'PRIETO NAVAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79489271, 'RENE OSWALDO', 'PÉREZ MORENO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79498165, 'CARLOS URIEL', 'CASTAÑO MANCERA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79512876, 'GIOVANNY ENRIQUE', 'BRAVO ROBAYO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79514243, 'FREDDY GERMAN', 'SABOGAL CUBILLOS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79535752, 'OSCAR HERNÁN', 'ANGARITA QUIROGA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79535847, 'JUAN ALEXANDER', 'BAHOS RUIZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79543336, 'MAURICIO BECERRA', 'PÉREZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79561197, 'RAFAEL ANTONIO', 'ROCHA ROCHA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79595106, 'ALFREDO TRIANA', 'LEÓN', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79598384, 'ROBINSON ROJAS', 'FORERO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79617376, 'MARTIN CAMILO', 'CORDOBA SÁNCHEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79623495, 'JOHN OSWALDO', 'RIVERA GÓMEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79642879, 'JOSE ALEXANDER', 'ÁLVAREZ ESTAILES', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79642957, 'CARLOS ALBERTO', 'BELTRÁN ESCOBAR', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79671686, 'JIMMY PEREZ', 'BAEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79683315, 'FREDDY HERNÃN', 'CELIS ARDILA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79716693, 'CARLOS IVÁN', 'HENAO HERNÁNDEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79718094, 'EDWIN HOLMAN', 'SIERRA CORTES', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79719373, 'GUSTAVO ADOLFO', 'TORRES PENAGOS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79735236, 'MIGUEL ANGEL', 'OROZCO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79777686, 'CARLOS FERNANDO', 'TOVAR ARDILA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79780248, 'MAURICIO JOSE', 'CORREDOR MONROY', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79810361, 'EDGAR HERNANDO', 'ARCHILA MEJIA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79831114, 'JORGE HAROLD', 'GÓMEZ ACOSTA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79852218, 'JESÚS ANÍBAL', 'CARDENAS MACIAS', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79875717, 'HENRY ANDRÉS', 'RODRÍGUEZ LARA', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79878264, 'CARLOS ANDRES', 'GARCIA MUÑOZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79904601, 'CAMILO ANDRÉS', 'MARTÍN GONZÁLEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79940526, 'CESAR AUGUSTO', 'LÓPEZ DÍAZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79963028, 'JHON JAIVER', 'SABOGAL', 5555555, 'prueba@prueba.com', '2016-11-01'),
(79969059, 'JIMMY ARMANDO', 'UNIGARRO MILLAN', 5555555, 'prueba@prueba.com', '2016-11-01'),
(80234603, 'RODNEY ANDRES', 'POLO GARAVITO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(80352470, 'RICARDO BARÓN', 'HURTADO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(80424090, 'FRANKLIN ALBERTO', 'URBINA MORENO', 5555555, 'prueba@prueba.com', '2016-11-01'),
(80426290, 'ALEXANDER PARADA', 'DUQUE', 5555555, 'prueba@prueba.com', '2016-11-01'),
(83086524, 'LUIS ALBERTO', 'SANTANA SÁNCHEZ', 5555555, 'prueba@prueba.com', '2016-11-01'),
(91268360, 'JAVIER GÓMEZ', 'SALAZAR', 5555555, 'prueba@prueba.com', '2016-11-01'),
(91424982, 'JAIME AUGUSTO', 'DÍAZ TORRES', 5555555, 'prueba@prueba.com', '2016-11-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programa`
--

CREATE TABLE `programa` (
  `id_programa` int(11) NOT NULL,
  `programa` varchar(45) NOT NULL,
  `duracion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programaento`
--

CREATE TABLE `programaento` (
  `id_programa` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `cod_instructor` int(11) NOT NULL,
  `personal_num_cedula` int(11) NOT NULL,
  `capacitacion_id_matricula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL,
  `perfil` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `clave` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `perfil`, `nombre`, `usuario`, `clave`, `estado`) VALUES
(7, 'Academico', 'Academico', 'academico', 'admin123', 'Activo'),
(12, 'Coordinador', 'Coordinador', 'admin', 'admin123', 'Activo'),
(13, 'Instructor', 'Instructor', 'instructor', 'admin123', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `capacitacion`
--
ALTER TABLE `capacitacion`
  ADD PRIMARY KEY (`id_matricula`),
  ADD UNIQUE KEY `personal_num_cedula_UNIQUE` (`personal_num_cedula`),
  ADD UNIQUE KEY `curso_id_curso_UNIQUE` (`curso_id_curso`),
  ADD KEY `fk_personal_has_curso_curso1_idx` (`curso_id_curso`),
  ADD KEY `fk_personal_has_curso_personal1_idx` (`personal_num_cedula`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`cod_cargo`);

--
-- Indices de la tabla `cargo_his`
--
ALTER TABLE `cargo_his`
  ADD PRIMARY KEY (`sec_cargo`),
  ADD UNIQUE KEY `personal_num_cedula_UNIQUE` (`personal_num_cedula`),
  ADD UNIQUE KEY `cargo_cod_cargo_UNIQUE` (`cargo_cod_cargo`),
  ADD KEY `fk_cargo_his_cargo1_idx` (`cargo_cod_cargo`),
  ADD KEY `fk_cargo_his_personal1_idx` (`personal_num_cedula`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`cod_instructor`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`num_cedula`);

--
-- Indices de la tabla `programa`
--
ALTER TABLE `programa`
  ADD PRIMARY KEY (`id_programa`),
  ADD KEY `fk_programa_ProgramaEnto_idx` (`id_programa`);

--
-- Indices de la tabla `programaento`
--
ALTER TABLE `programaento`
  ADD PRIMARY KEY (`id_programa`),
  ADD UNIQUE KEY `personal_num_cedula_UNIQUE` (`personal_num_cedula`),
  ADD UNIQUE KEY `personal_has_curso_personal_num_cedula_UNIQUE` (`capacitacion_id_matricula`),
  ADD UNIQUE KEY `cod_instructor_UNIQUE` (`cod_instructor`),
  ADD KEY `fk_ProgramaEnto_personal1_idx` (`personal_num_cedula`),
  ADD KEY `fk_ProgramaEnto_personal_has_curso1_idx` (`capacitacion_id_matricula`),
  ADD KEY `fk_ProgramaEnto_instructor1_idx` (`cod_instructor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cargo_his`
--
ALTER TABLE `cargo_his`
  MODIFY `sec_cargo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `capacitacion`
--
ALTER TABLE `capacitacion`
  ADD CONSTRAINT `fk_personal_has_curso_curso1` FOREIGN KEY (`curso_id_curso`) REFERENCES `curso` (`id_curso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_personal_has_curso_personal1` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `cargo_his`
--
ALTER TABLE `cargo_his`
  ADD CONSTRAINT `fk_cargo_his_cargo1` FOREIGN KEY (`cargo_cod_cargo`) REFERENCES `cargo` (`cod_cargo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_cargo_his_personal1` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `programa`
--
ALTER TABLE `programa`
  ADD CONSTRAINT `fk_programa_ProgramaEnto` FOREIGN KEY (`id_programa`) REFERENCES `programaento` (`id_programa`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `programaento`
--
ALTER TABLE `programaento`
  ADD CONSTRAINT `fk_ProgramaEnto_instructor1` FOREIGN KEY (`cod_instructor`) REFERENCES `instructor` (`cod_instructor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ProgramaEnto_personal1` FOREIGN KEY (`personal_num_cedula`) REFERENCES `personal` (`num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ProgramaEnto_personal_has_curso1` FOREIGN KEY (`capacitacion_id_matricula`) REFERENCES `capacitacion` (`personal_num_cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
