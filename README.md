# SqlGui
use Test as database

Login Table in MySQL

CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(45) DEFAULT NULL,
  `pwd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

Employee Table in MySQL

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sal` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;
