/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.5.62 : Database - xscj
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xscj` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `xscj`;

/*Table structure for table `xsb` */

DROP TABLE IF EXISTS `xsb`;

CREATE TABLE `xsb` (
  `xh` char(6) NOT NULL,
  `xm` varchar(20) NOT NULL,
  `xb` char(1) NOT NULL,
  `cssj` varchar(20) DEFAULT NULL,
  `zy_id` int(11) NOT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`xh`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `xsb` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
