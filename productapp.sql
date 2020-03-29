-- step1: create a mysqlconnection using the following info

-- Host:127.0.0.1
-- port:3306
-- Connection Method: Standard(TCP/IP)
-- Username: root
-- Password: root


-- step2:after opening the connection, run the following sql scripts in mysql 

-- 1. 
CREATE DATABASE `localdbase`

-- 2.
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
)

-- 3.
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`product_id`)
)

-- 4.
DML Statements
INSERT INTO `localdbase`.`user` (`user_id`, `user_name`, `password`, `role`) VALUES ('1', 'ram', 'password', 'ROLE_ADMIN,ROLE_USER');
INSERT INTO `localdbase`.`user` (`user_id`, `user_name`, `password`, `role`) VALUES ('2', 'sam', '12345', 'ROLE_USER');

INSERT INTO `localdbase`.`product` (`product_id`, `proiduct_name`, `quantity`, `price`) VALUES ('1', 'Television', '100', '20000');
INSERT INTO `localdbase`.`product` (`product_id`, `proiduct_name`, `quantity`, `price`) VALUES ('2', 'Mobile', '700', '10000');