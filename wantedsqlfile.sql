-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: hotelProject
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AllottedRoom`
--

DROP TABLE IF EXISTS `AllottedRoom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AllottedRoom` (
  `customerid` varchar(36) NOT NULL,
  `roomnumber` int(3) NOT NULL,
  KEY `customerid` (`customerid`),
  CONSTRAINT `AllottedRoom_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `CUSTOMERLOGIN` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AllottedRoom`
--

LOCK TABLES `AllottedRoom` WRITE;
/*!40000 ALTER TABLE `AllottedRoom` DISABLE KEYS */;
INSERT INTO `AllottedRoom` VALUES ('C001',101),('C002',202),('C003',303),('C004',104),('C005',205);
/*!40000 ALTER TABLE `AllottedRoom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUSTOMERADDRESSPROOF`
--

DROP TABLE IF EXISTS `CUSTOMERADDRESSPROOF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUSTOMERADDRESSPROOF` (
  `customerid` varchar(36) NOT NULL,
  `idtype` varchar(255) NOT NULL,
  `idnumber` int(20) NOT NULL,
  KEY `customerid` (`customerid`),
  CONSTRAINT `CUSTOMERADDRESSPROOF_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `CUSTOMERLOGIN` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUSTOMERADDRESSPROOF`
--

LOCK TABLES `CUSTOMERADDRESSPROOF` WRITE;
/*!40000 ALTER TABLE `CUSTOMERADDRESSPROOF` DISABLE KEYS */;
INSERT INTO `CUSTOMERADDRESSPROOF` VALUES ('C002','Pan Card',1111222233),('C005','Pan Card',1111222244);
/*!40000 ALTER TABLE `CUSTOMERADDRESSPROOF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUSTOMERDETAILS`
--

DROP TABLE IF EXISTS `CUSTOMERDETAILS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUSTOMERDETAILS` (
  `customerid` varchar(36) NOT NULL,
  `housenumber` int(5) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postalcode` int(10) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `dob` date NOT NULL,
  `sex` varchar(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mob` int(10) NOT NULL,
  KEY `customerid` (`customerid`),
  CONSTRAINT `CUSTOMERDETAILS_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `CUSTOMERLOGIN` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUSTOMERDETAILS`
--

LOCK TABLES `CUSTOMERDETAILS` WRITE;
/*!40000 ALTER TABLE `CUSTOMERDETAILS` DISABLE KEYS */;
INSERT INTO `CUSTOMERDETAILS` VALUES ('C001',45,'abc','mumbai',251001,'india','2017-07-14','male','abc@gmail.com',98988),('C002',46,'bcd','delhi',251002,'india','2017-07-14','male','abc@gmail.com',98988),('C003',47,'cde','ghaziabad',251003,'india','2017-07-14','male','abc@gmail.com',98988),('C004',48,'def','meerut',251004,'india','2017-07-14','male','abc@gmail.com',98988),('C005',49,'efg','gurgaon',251005,'india','2017-07-14','male','abc@gmail.com',98988);
/*!40000 ALTER TABLE `CUSTOMERDETAILS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUSTOMERLOGIN`
--

DROP TABLE IF EXISTS `CUSTOMERLOGIN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUSTOMERLOGIN` (
  `customerid` varchar(36) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUSTOMERLOGIN`
--

LOCK TABLES `CUSTOMERLOGIN` WRITE;
/*!40000 ALTER TABLE `CUSTOMERLOGIN` DISABLE KEYS */;
INSERT INTO `CUSTOMERLOGIN` VALUES ('C001','man'),('C002','jat'),('C003','pri'),('C004','him'),('C005','har');
/*!40000 ALTER TABLE `CUSTOMERLOGIN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUSTOMERSTAYINFORMATION`
--

DROP TABLE IF EXISTS `CUSTOMERSTAYINFORMATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUSTOMERSTAYINFORMATION` (
  `customerid` varchar(36) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `noguest` int(2) NOT NULL,
  `roomtype` varchar(50) NOT NULL,
  KEY `roomtype` (`roomtype`),
  KEY `customerid` (`customerid`),
  CONSTRAINT `CUSTOMERSTAYINFORMATION_ibfk_1` FOREIGN KEY (`roomtype`) REFERENCES `ROOMDETAILS` (`roomtype`),
  CONSTRAINT `CUSTOMERSTAYINFORMATION_ibfk_2` FOREIGN KEY (`customerid`) REFERENCES `CUSTOMERLOGIN` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUSTOMERSTAYINFORMATION`
--

LOCK TABLES `CUSTOMERSTAYINFORMATION` WRITE;
/*!40000 ALTER TABLE `CUSTOMERSTAYINFORMATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `CUSTOMERSTAYINFORMATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EMPLOYEEDETAIL`
--

DROP TABLE IF EXISTS `EMPLOYEEDETAIL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EMPLOYEEDETAIL` (
  `empid` varchar(36) NOT NULL,
  `name` varchar(255) NOT NULL,
  `housenumber` int(5) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postalcode` int(10) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `salary` int(8) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `mob` int(10) NOT NULL,
  KEY `empid` (`empid`),
  CONSTRAINT `EMPLOYEEDETAIL_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `EMPLOYEELOGIN` (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EMPLOYEEDETAIL`
--

LOCK TABLES `EMPLOYEEDETAIL` WRITE;
/*!40000 ALTER TABLE `EMPLOYEEDETAIL` DISABLE KEYS */;
INSERT INTO `EMPLOYEEDETAIL` VALUES ('E001','Priyanshu',244,'civil lines','moz',251001,'India',25000,'2017-07-14','gup@gmail.com',9760),('E002','Mandeep',245,'xyz','meerut',251002,'India',26000,'2017-07-14','man@gmail.com',9765),('E003','Jatin',246,'abc','delhi',251003,'India',27000,'2017-07-14','gup@gmail.com',9760),('E004','Nirmit',247,'asd','ghaziabad',251004,'India',28000,'2017-07-14','gup@gmail.com',9760),('E005','Himanshu',248,'ert','gurgaon',251005,'India',29000,'2017-07-14','gup@gmail.com',9760);
/*!40000 ALTER TABLE `EMPLOYEEDETAIL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EMPLOYEELEVEL`
--

DROP TABLE IF EXISTS `EMPLOYEELEVEL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EMPLOYEELEVEL` (
  `empid` varchar(36) NOT NULL,
  `level` varchar(36) NOT NULL,
  KEY `level` (`level`),
  KEY `empid` (`empid`),
  CONSTRAINT `EMPLOYEELEVEL_ibfk_1` FOREIGN KEY (`level`) REFERENCES `EMPLOYEELEVELTASK` (`level`),
  CONSTRAINT `EMPLOYEELEVEL_ibfk_2` FOREIGN KEY (`empid`) REFERENCES `EMPLOYEELOGIN` (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EMPLOYEELEVEL`
--

LOCK TABLES `EMPLOYEELEVEL` WRITE;
/*!40000 ALTER TABLE `EMPLOYEELEVEL` DISABLE KEYS */;
INSERT INTO `EMPLOYEELEVEL` VALUES ('E001','Receptionist'),('E002','Receptionist'),('E003','Manager'),('E004','Manager'),('E005','Admin');
/*!40000 ALTER TABLE `EMPLOYEELEVEL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EMPLOYEELEVELTASK`
--

DROP TABLE IF EXISTS `EMPLOYEELEVELTASK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EMPLOYEELEVELTASK` (
  `level` varchar(36) NOT NULL,
  `task` varchar(255) NOT NULL,
  PRIMARY KEY (`level`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EMPLOYEELEVELTASK`
--

LOCK TABLES `EMPLOYEELEVELTASK` WRITE;
/*!40000 ALTER TABLE `EMPLOYEELEVELTASK` DISABLE KEYS */;
INSERT INTO `EMPLOYEELEVELTASK` VALUES ('Admin','vadu'),('Manager','au'),('Receptionist','cicoubibvr');
/*!40000 ALTER TABLE `EMPLOYEELEVELTASK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EMPLOYEELOGIN`
--

DROP TABLE IF EXISTS `EMPLOYEELOGIN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EMPLOYEELOGIN` (
  `empid` varchar(36) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EMPLOYEELOGIN`
--

LOCK TABLES `EMPLOYEELOGIN` WRITE;
/*!40000 ALTER TABLE `EMPLOYEELOGIN` DISABLE KEYS */;
INSERT INTO `EMPLOYEELOGIN` VALUES ('E001','123'),('E002','123'),('E003','123'),('E004','123'),('E005','123');
/*!40000 ALTER TABLE `EMPLOYEELOGIN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ROOMDETAILS`
--

DROP TABLE IF EXISTS `ROOMDETAILS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ROOMDETAILS` (
  `roomtype` varchar(50) NOT NULL,
  `room_number_start` int(3) NOT NULL,
  `room_number_end` int(3) NOT NULL,
  `baseprice` int(6) NOT NULL,
  `taxpercent` int(2) NOT NULL,
  PRIMARY KEY (`roomtype`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ROOMDETAILS`
--

LOCK TABLES `ROOMDETAILS` WRITE;
/*!40000 ALTER TABLE `ROOMDETAILS` DISABLE KEYS */;
INSERT INTO `ROOMDETAILS` VALUES ('Luxury',101,199,7000,28),('Normal',301,399,3000,12),('Semi-Luxury',201,299,5000,18);
/*!40000 ALTER TABLE `ROOMDETAILS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-14 10:00:41
