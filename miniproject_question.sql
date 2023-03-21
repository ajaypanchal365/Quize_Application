-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: miniproject
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `Sr_no` int NOT NULL AUTO_INCREMENT,
  `question` varchar(100) DEFAULT NULL,
  `Option_1` varchar(100) DEFAULT NULL,
  `Option_2` varchar(100) DEFAULT NULL,
  `Option_3` varchar(100) DEFAULT NULL,
  `Option_4` varchar(100) DEFAULT NULL,
  `correct_answer` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Sr_no`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'What is full form of JDK?','Java Devlopment Kit','Java virtual Machine','Java Runtime Enviornment','Not from above','Java Devlopment Kit'),(2,'What is the extension of java code files?','.js','.txt','.class','.java','.java'),(3,'Which environment variable is used to set the java path?','MAVEN_Path','JavaPATH','JAVA','JAVA_HOME','JAVA_HOME'),(4,'Which of these are selection statements in Java?','break','continue','for()','if()','if()'),(5,'Which of these keywords is used to define interfaces in Java?','intf','Intf','interface','Interface','interface'),(6,'Which of the following is a superclass of every class in Java?','ArrayList','Abstract class','Object class','String','Object class'),(7,'Which of these packages contains the exception Stack Overflow in Java?','java.io','java.system','java.lang','java.util','java.lang'),(8,'Which of these keywords are used for the block to be examined for exceptions?','check','throw','catch','try','try'),(9,'Which one of the following is not an access modifier?','Protected','Void','Public','Private','Void'),(10,'Which of the following is not an OOPS concept in Java?','Polymorphism','Inheritance','Compilation','Encapsulation','Compilation');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-22  1:07:01
