-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bdportfolioghi
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `educacion`
--

DROP TABLE IF EXISTS `educacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `educacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `domicilio` varchar(255) DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `image_institucion` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `persona_id` int NOT NULL,
  `reminder` int NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `ultima_actualizacion` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `educacion`
--

LOCK TABLES `educacion` WRITE;
/*!40000 ALTER TABLE `educacion` DISABLE KEYS */;
INSERT INTO `educacion` VALUES (1,'San Salvador de Jujuy, jujuy, Argentina','1998-10-21','1992-02-19','assets/LOGO_EETN1.png','ESCUELA DE EDUCACIÓN TÉCNICA Nº 1 “ESCOLÁSTICO ZEGADA',1,0,'Maestro Mayor de Obra','2022-10-23'),(2,'San Salvador de Jujuy, jujuy, Argentina','0002-11-25','1999-02-24','assets/logo_UnJu_1.jpg','UNJu',1,1,'Ingeniería Informática','2022-10-29'),(3,'San Salvador de Jujuy, jujuy, Argentina','2018-11-28','2018-02-26','assets/logo111MIL.png','inet-Ministerio de Producción-Presidencia de la Nación',1,0,'ANALISTA DEL CONOCIMIENTO - TRAYECTO PROGRAMADOR, Lenguaje de Programación Java','2022-10-31'),(4,'San Salvador de Jujuy, jujuy, Argentina','2019-12-08','2004-02-28','assets/logoies4-500x500.png','INSTITUTO DE EDUCACIÓN SUPERIOR N° 4 - RAÚL S. ORTIZ - JUJUY',1,1,'PROFESOR DE EDUCACION SECUNDARIA DE LA MODALIDAD TECNICO PROFESIONAL con concurrencia con título de base MAESTRO MAYOR DE OBRA','2022-11-01'),(5,'San Salvador de Jujuy, jujuy, Argentina','2022-03-31','2021-12-31','assets/argprog_logo[1-Etapa].png','Ministerio de Desarrollo Productivo Argentina - Inti - cessi Argentina',1,1,'Primera etapa del Plan Argentina Programa #SéProgramar','2022-11-02'),(6,'San Salvador de Jujuy, jujuy, Argentina','2023-01-15','2022-04-29','assets/APLogo-20-20[2-Etapa].png','Ministerio de Desarrollo Productivo Argentina - Inti - cessi Argentina',1,1,'Segunda etapa del Plan Argentina Programa #SéProgramar','2023-01-15'),(8,'San Salvador de Jujuy, jujuy, Argentina','2023-01-14','2022-04-28','assets/APLogo-20-20[2-Etapa].png','222Ministerio de Desarrollo Productivo Argentina - Inti - cessi Argentina',1,0,'Segunda etapa del Plan Argentina Programa #SéProgramar','2023-01-14');
/*!40000 ALTER TABLE `educacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experiencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_empresa` varchar(45) DEFAULT NULL,
  `es_trabajo_actual` tinyint DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `lugar` varchar(100) DEFAULT NULL,
  `fecha_ultima_actualizacion` date DEFAULT NULL,
  `image_logo` varchar(100) DEFAULT NULL,
  `reminder` tinyint DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_experiencia_persona_idx` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia`
--

LOCK TABLES `experiencia` WRITE;
/*!40000 ALTER TABLE `experiencia` DISABLE KEYS */;
INSERT INTO `experiencia` VALUES (1,'Independiente',1,'Oficial Armador de Estructuras de Hormigon Armado','Independiente- Jornada Parcial','2000-01-01','2022-11-04','San Salvador de Jujuy, jujuy, Argentina','2022-11-04','assets/icons8-construction-100.png',0,1),(2,'Independiente',1,'Director Tecnico de Obras','Independiente- Jornada Parcial','2000-01-01','2022-11-04','San Salvador de Jujuy, jujuy, Argentina','2022-11-04','assets/icons8-courier-64.png',0,1),(3,'Independiente',1,'Proyectista de Planos Tecnicos de viviendas','Independiente- Jornada Parcial','2000-01-01','2022-11-01','San Salvador de Jujuy, jujuy, Argentina','2022-11-04','assets/icons8-floor-plan-64.png',0,1),(4,'Independiente',1,'Reparacion y Mantenimiento de PC','Independiente- Jornada Parcial','2007-01-01','2022-11-04','San Salvador de Jujuy, jujuy, Argentina','2022-11-04','assets/icons8-keyboard-and-mouse-64.png',0,1),(5,'Independiente Noe',1,'Oficial Armador de Estructuras de Hormigon Armado','Independiente- Jornada Parcial','1999-12-31','2022-11-03','San Salvador de Jujuy, jujuy, Argentina','2022-11-03','assets/icons8-construction-100.png',0,1),(6,'Independiente Noe Sol',1,'Oficial Armador de Estructuras de Hormigon Armado','Independiente- Jornada Parcial','1999-12-31','2022-11-03','San Salvador de Jujuy, jujuy, Argentina','2022-11-03','assets/icons8-construction-100.png',0,1),(7,'Independiente Sole',1,'Oficial Armador de Estructuras de Hormigon Armado','Independiente- Jornada Parcial','1999-12-31','2022-11-03','San Salvador de Jujuy, jujuy, Argentina','2022-11-03','assets/icons8-construction-100.png',0,1);
/*!40000 ALTER TABLE `experiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hardskills`
--

DROP TABLE IF EXISTS `hardskills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hardskills` (
  `id` int NOT NULL AUTO_INCREMENT,
  `habilidadh` varchar(45) DEFAULT NULL,
  `nivelh` int DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hard-Skills_persona1_idx` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hardskills`
--

LOCK TABLES `hardskills` WRITE;
/*!40000 ALTER TABLE `hardskills` DISABLE KEYS */;
INSERT INTO `hardskills` VALUES (1,'S.O. Windows 11',40,1),(2,'S.O. Linux',15,1),(3,'Turbo Pascal',50,1),(4,'Lenguaje C',50,1),(5,'Lenguaje C++',50,1),(6,'Lenguaje Java',50,1),(7,'Lenguaje JavaScript',40,1),(8,'Lenguaje Ruby',40,1),(9,'Visual Studio Code',30,1),(10,'AutoCad',60,1),(11,'SketchUp',50,1),(12,'Lenguaje FoxPro',40,1),(13,'Lenguaje Cobol',40,1),(14,'Lenguaje LISP',30,1),(15,'Concurrent Pascal',40,1),(16,'MS. Word',40,1),(17,'Excel',40,1),(18,'Ms. Power Point',30,1),(19,'Camtasia 2020',30,1),(20,'HTML5',50,1),(21,'CSS',40,1),(22,'Bootstrap v5.0',40,1),(23,'TypeScript',40,1),(24,'Photoshopt',15,1);
/*!40000 ALTER TABLE `hardskills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma`
--

DROP TABLE IF EXISTS `idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idioma` (
  `id` int NOT NULL AUTO_INCREMENT,
  `habilidadi` varchar(45) DEFAULT NULL,
  `niveli` int DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_idioma_persona1_idx` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma`
--

LOCK TABLES `idioma` WRITE;
/*!40000 ALTER TABLE `idioma` DISABLE KEYS */;
INSERT INTO `idioma` VALUES (1,'Español',90,1),(2,'Ingles Tecnico',30,1),(3,'Quechua',30,1);
/*!40000 ALTER TABLE `idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `domicilio` varchar(255) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ocupacion` varchar(255) DEFAULT NULL,
  `sobre_mi` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `url_foto` varchar(255) DEFAULT NULL,
  `url_foto_fondo` varchar(255) DEFAULT NULL,
  `direccion_fondo` varchar(255) DEFAULT NULL,
  `nombre_fondo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Huanaco Impa','gabrielhuanaco@gmail.com','San salvador de Jujuy, Jujuy, Argentina','1979-03-17','Boliviano','Gabriel','Programador Full Stack  Developer Jr.','MAESTRO MAYOR DE OBRA, PROFESOR DE EDUCACION SECUNDARIA DE LA MODALIDAD TECNICO PROFESIONAL con concurrencia con título de base e informático','3885765589','assets/foto_Perfil.jpg','assets/Esquina_Totoral_3.jpg','Argentina Jujuy Cochinoca','Finca Esquina Totoral');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_proyecto` varchar(100) DEFAULT NULL,
  `fecha_inicioP` date DEFAULT NULL,
  `fecha_finP` date DEFAULT NULL,
  `descripcionP` varchar(600) DEFAULT NULL,
  `link` varchar(100) DEFAULT NULL,
  `url_imagenes` varchar(100) DEFAULT NULL,
  `domicilio` varchar(100) DEFAULT NULL,
  `tipo_ocupacion` varchar(100) DEFAULT NULL,
  `ultima_actualizacion` date DEFAULT NULL,
  `url_image_logo` varchar(100) DEFAULT NULL,
  `reminder` tinyint DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_proyecto_persona1_idx` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES (1,'Construccion de Estructura de Hormigon Armado de viviendas','1990-01-01','2021-01-01','Construccion bases, vigas de fundacion, columnas, vigas y losas. Trabajos de albañileria.','','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/P-Armador.jpg',1,1),(2,'Dirección Tecnica de Obras','2000-01-01','2022-01-01','Dirigir y controlar la ejecucion de la mano deobra de elementos estructurales segun los planos y calculos de estructuras debidamente aprobadas.','','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/icons8-courier-64.png',1,1),(3,'Proyectos de Planos Tecnicos de viviendas unifamiliares','2000-01-01','2022-01-01','Confección de carpeta tecnica: planos Municipales, Plano de Obra, Instalación Electrica, Instalación Sanitaria, Instalación de Gas y Detalles Constructivos. El Plano Municipal, junto con otros requisitos fue presentado a Obras particulares para su posterior aprobacion y autorizacion para ser ejecutada con posterioridad.','','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/icons8-floor-plan-64.png',1,1),(4,'Reparacion y Mantenimiento de PC','2005-01-01','2022-01-01','Instalacion y mantenimiento de Software (Sistemas Operativos, Herramientas Office, editor de video, Antivirus, Diseño asistido por computador) y Hardware (computadora de escritorios, Notebook, Netbook).','','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/icons8-keyboard-and-mouse-64.png',1,1),(5,'ANALISTA DEL CONOCIMIENTO - TRAYECTO PROGRAMADOR.','2018-03-01','2018-04-01','Este curso abalado por Inet-Ministerio de Producción-Presidencia de la Nación, dictado en escuela Tecnica Nº2, de manera presencial. Se vio una introduccion a la informática y se realizaron varios proyectos con Lenguaje de Programación Java','http://www.inet.edu.ar/index.php/tag/111-mil-programadores/','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/logo111MIL.png',1,1),(6,'Primera etapa del Plan Argentina Programa #SéProgramar.','2022-01-01','2022-04-01','Este curso abalado por Ministerio de Desarrollo Productivo Argentina - Inti - cessi Argentina, dictado en forma online, Se vio los siguientes capitulos: Capítulo 1 Fundamentos [Gobstones](Cantidad de ejercicios 104 - Dedicación estimada 20 horas). Capítulo 2 Programación Imperativa [JavaScript](Cantidad de ejercicios 90 - Dedicación estimada 20 horas),<br> Capítulo 3 Programación con Objetos [Ruby](Cantidad de ejercicios 96 - Dedicación estimada 20 horas)','https://seprogramar.inti.gob.ar/','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/argprog_logo[1-Etapa].png',1,1),(7,'Segunda etapa del Plan Argentina Programa #YoProgramo 3ra edición.','2022-06-01','2023-01-01','Este curso abalado por Ministerio de Desarrollo Productivo Argentina - Inti, dictado en forma online. Se vio los siguientes Modulos : Módulo 1 - Introducción a Desarrollo Web y Aplicaciones. Módulo 2 - Desarrollo Front End estático<br>','https://argentinaprograma.inti.gob.ar/','','San salvador de Jujuy, Jujuy, Argentina','Independiente- Jornada Parcial','2022-10-01','assets/APLogo-20-20[2-Etapa].png',1,1);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `softskills`
--

DROP TABLE IF EXISTS `softskills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `softskills` (
  `id` int NOT NULL AUTO_INCREMENT,
  `habilidad` varchar(45) DEFAULT NULL,
  `nivel` int DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_soft-Skills_persona1_idx` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `softskills`
--

LOCK TABLES `softskills` WRITE;
/*!40000 ALTER TABLE `softskills` DISABLE KEYS */;
INSERT INTO `softskills` VALUES (1,'Comunicación',70,1),(2,'Multitarea',30,1),(3,'Habilidades organizativas',50,1),(4,'Iniciativa',80,1),(5,'Resiliencia',50,1),(6,'Responsabilidad',90,1),(7,'Asumir riesgos',60,1),(8,'Creatividad',60,1),(9,'Autorregulación',70,1),(10,'Adaptabilidad',70,1),(11,'Gestión del tiempo',80,1),(12,'Autodesarrollo',70,1),(13,'Trabajo en equipo',80,1),(14,'Trabajo en red',70,1),(15,'Empatía',40,1),(16,'Compasión',70,1),(17,'Sensibilidad cultural',70,1),(18,'Habilidades de comunicación',70,1),(19,'Liderazgo',90,1),(20,'Organización',70,1),(21,'Resolución de problemas',70,1),(22,'Pensamiento crítico',70,1),(23,'Proactivo',70,1),(24,'Buenos modales',90,1),(25,'Sentido del humor',70,1);
/*!40000 ALTER TABLE `softskills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_aut`
--

DROP TABLE IF EXISTS `user_aut`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_aut` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_aut`
--

LOCK TABLES `user_aut` WRITE;
/*!40000 ALTER TABLE `user_aut` DISABLE KEYS */;
INSERT INTO `user_aut` VALUES (1,'gabrielhuanaco@gmail.com','impa3155','Administrador');
/*!40000 ALTER TABLE `user_aut` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-15 20:16:03
