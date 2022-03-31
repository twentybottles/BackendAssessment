DROP DATABASE IF EXISTS car_shair;
CREATE DATABASE car_shair;
USE car_shair;

DROP TABLE IF EXISTS car_detail;

CREATE TABLE `car_detail` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vin` char(17) NOT NULL,
  `car_value` int(7) NOT NULL,
  `current_mileage` int(6) NOT NULL,
  `vehicle_description` text,
  `vehicle_color` varchar(10) NOT NULL,
  `delete_flg` tinyint(1) DEFAULT '0',
  `updated_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`vin`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS vin_specification;

CREATE TABLE `vin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `message` varchar(64) NOT NULL,
  `status` varchar(5) NOT NULL,
  `report_id` varchar(10) NOT NULL,
  `report_vin` varchar(17) NOT NULL,
  `report_report` varchar(20) NOT NULL,
  `year` char(4) NOT NULL,
  `make` varchar(20) NOT NULL,
  `model` char(2) NOT NULL,
  `made_in` varchar(20) NOT NULL,
  `trim_level` varchar(10) NOT NULL,
  `engine` varchar(20) NOT NULL,
  `style` varchar(20) NOT NULL,
  `steering_type` varchar(10) NOT NULL,
  `anti_brake_system` varchar(20) NOT NULL,
  `tank_size` varchar(20) NOT NULL,
  `overall_height` varchar(20),
  `overall_length` varchar(20) NOT NULL,
  `overall_width` varchar(20) NOT NULL,
  `standard_seating` varchar(4) NOT NULL,
  `optional_seating` varchar(4) NOT NULL,
  `highway_mileage` varchar(20) NOT NULL,
  `city_mileage` varchar(20) NOT NULL,
  `license_plate` varchar(20) NOT NULL,
  `registration` varchar(20) NOT NULL,
  `registration_state` varchar(5) NOT NULL,
  `registration_expiration` varchar(8) NOT NULL,
  `name_on_registration` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`report_vin`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;