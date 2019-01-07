/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MariaDB
 Source Server Version : 100310
 Source Host           : localhost:3306
 Source Schema         : clouddb01

 Target Server Type    : MariaDB
 Target Server Version : 100310
 File Encoding         : 65001

 Date: 08/01/2019 01:16:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `db_source` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'clouddb01');
INSERT INTO `dept` VALUES (2, '人事部', 'clouddb01');
INSERT INTO `dept` VALUES (3, '财务部', 'clouddb01');
INSERT INTO `dept` VALUES (4, '市场部', 'clouddb01');
INSERT INTO `dept` VALUES (5, '运维部', 'clouddb01');

SET FOREIGN_KEY_CHECKS = 1;
