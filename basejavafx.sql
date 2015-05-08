/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : localhost
 Source Database       : basejavafx

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : utf-8

 Date: 05/08/2015 21:36:23 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `foo`
-- ----------------------------
DROP TABLE IF EXISTS `foo`;
CREATE TABLE `foo` (
  `id` int(11) NOT NULL,
  `text` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `foo`
-- ----------------------------
BEGIN;
INSERT INTO `foo` VALUES ('1', 'asdasasd');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
