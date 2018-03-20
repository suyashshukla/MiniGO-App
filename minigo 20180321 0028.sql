-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.33-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema minigo
--

CREATE DATABASE IF NOT EXISTS minigo;
USE minigo;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(10) unsigned NOT NULL auto_increment,
  `adminname` varchar(45) NOT NULL,
  `picture` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`adminname`,`picture`,`password`) VALUES 
 (1,'Amit','qwerty','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `agency`
--

DROP TABLE IF EXISTS `agency`;
CREATE TABLE `agency` (
  `agencyid` int(10) unsigned NOT NULL auto_increment,
  `agencyname` varchar(45) NOT NULL,
  `ownername` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `contactperson` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `registrationid` varchar(45) NOT NULL,
  `identity` varchar(45) NOT NULL,
  `identity_proof` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY  (`agencyid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agency`
--

/*!40000 ALTER TABLE `agency` DISABLE KEYS */;
INSERT INTO `agency` (`agencyid`,`agencyname`,`ownername`,`address`,`contactperson`,`mobileno`,`emailid`,`registrationid`,`identity`,`identity_proof`,`password`,`status`) VALUES 
 (1,'Hans Travel','Raj Kumar Sharma','10','Bablu','8989551235','qw@qw','100','100','e cell 1.jpg','1','Not Verify'),
 (2,'Nikhil Pathak Bus ','Nic','jawahar colony','Umashankar','800080008','nic@gmai.com','2','2','e cell 1.jpg','2','Verified'),
 (3,'aa','aa','aa','aa','8989556633','aa@yahoo.com','1001','Aadhar','C:UsershpDesktopimages.jpg','12345','Not Verify'),
 (4,'aa','b','skdfnl','ddf','98654231','dd@gmai.co.in','1230','Addar','C:UsershpDesktopimages.jpg','12345','Not Verify');
/*!40000 ALTER TABLE `agency` ENABLE KEYS */;


--
-- Definition of table `agencyvehicals`
--

DROP TABLE IF EXISTS `agencyvehicals`;
CREATE TABLE `agencyvehicals` (
  `vrn` varchar(45) NOT NULL,
  `dname` varchar(45) NOT NULL,
  `dmobileno` varchar(45) NOT NULL,
  `identity` varchar(45) NOT NULL,
  PRIMARY KEY  (`vrn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agencyvehicals`
--

/*!40000 ALTER TABLE `agencyvehicals` DISABLE KEYS */;
INSERT INTO `agencyvehicals` (`vrn`,`dname`,`dmobileno`,`identity`) VALUES 
 ('null','null','null','null');
/*!40000 ALTER TABLE `agencyvehicals` ENABLE KEYS */;


--
-- Definition of table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `bookingid` int(10) unsigned NOT NULL auto_increment,
  `clientemail` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `currentdate` varchar(45) NOT NULL,
  `bookingtime` varchar(45) NOT NULL,
  `source` varchar(45) NOT NULL,
  `destination` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY  (`bookingid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` (`bookingid`,`clientemail`,`mobileno`,`currentdate`,`bookingtime`,`source`,`destination`,`status`) VALUES 
 (1,'niv@gmail.com','9928283230','02/24/2018','10:06:03','Gwalior','Tekanpur','');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;


--
-- Definition of table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `emailid` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `birthdate` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='InnoDB free: 8192 kB';

--
-- Dumping data for table `client`
--

/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` (`emailid`,`mobile`,`name`,`birthdate`,`gender`,`address`,`password`) VALUES 
 ('niv@gmail.com','1008','Ram singh Chauhan','1969/07/09','Male','10,Sema dawar','123'),
 ('null','null','null','null','null','null','null');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
