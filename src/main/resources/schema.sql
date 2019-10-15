-- -- CREATE DATABASE  IF NOT EXISTS `spring_demo`;
-- --
-- -- USE `spring_demo`;
-- --
-- DROP TABLE IF EXISTS `test_table`;
--
-- CREATE TABLE `test_table` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `static_content` varchar(45) NOT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

drop table if exists test_table;
create table test_table
(
   id int not null,
   static_text varchar(255) not null,
   primary key(id)
);