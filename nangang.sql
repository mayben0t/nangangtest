/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : nangang

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-28 21:47:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `opcontent`
-- ----------------------------
DROP TABLE IF EXISTS `opcontent`;
CREATE TABLE `opcontent` (
  `glId` int(11) DEFAULT NULL,
  `guanId` varchar(5) NOT NULL,
  `tieCi` int(11) DEFAULT NULL,
  `arriveTime` datetime NOT NULL,
  `tlId` int(11) NOT NULL,
  `arriveHeight` decimal(6,2) NOT NULL,
  `leaveHeight` decimal(6,2) NOT NULL,
  `preliu` decimal(6,4) NOT NULL,
  `afterliu` decimal(6,4) NOT NULL,
  `isHit` tinyint(4) NOT NULL,
  `preTem` int(11) NOT NULL,
  `afterTem` int(11) NOT NULL,
  `modifier` varchar(11) NOT NULL,
  `date` date DEFAULT NULL,
  `banCi` varchar(5) DEFAULT NULL,
  `banBie` varchar(5) DEFAULT NULL,
  `zhanBie` varchar(11) DEFAULT NULL,
  `tieBaoBaoId` varchar(5) DEFAULT NULL,
  `baoAge` int(11) DEFAULT NULL,
  `luId` varchar(5) DEFAULT NULL,
  `gangZhong` varchar(5) DEFAULT NULL,
  `tieShuiQuXiang` varchar(11) DEFAULT NULL,
  `tieBaoLeaveTime` date DEFAULT NULL,
  `KRStartTime` date DEFAULT NULL,
  `KROverTime` date DEFAULT NULL,
  `GoalLiu` int(11) DEFAULT NULL,
  `LiuDown` int(11) DEFAULT NULL,
  `preBaBegin` date DEFAULT NULL,
  `preBaOver` date DEFAULT NULL,
  `afterBaBegin` date DEFAULT NULL,
  `afterBaOver` date DEFAULT NULL,
  `danCon` int(11) DEFAULT NULL,
  `tuoCycle` int(11) DEFAULT NULL,
  PRIMARY KEY (`tlId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opcontent
-- ----------------------------
INSERT INTO `opcontent` VALUES (null, 'Y29', null, '2018-04-02 07:11:23', '118040001', '99.59', '0.00', '0.0270', '0.0000', '1', '0', '0', 'OJ系统维护员', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `opcontent` VALUES (null, 'Y25', null, '2018-04-02 08:10:14', '118040002', '99.44', '0.00', '0.0110', '0.0000', '1', '1393', '0', 'OJ系统维护员', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `opcontent` VALUES (null, 'Y52', null, '2018-04-02 08:58:05', '118040003', '96.87', '0.00', '0.0120', '0.0000', '1', '1343', '0', 'OJ系统维护员', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `opcontent` VALUES (null, 'Y27', null, '2018-04-02 09:47:27', '118040004', '97.39', '0.00', '0.0070', '0.0000', '1', '1387', '0', 'OJ系统维护员', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
