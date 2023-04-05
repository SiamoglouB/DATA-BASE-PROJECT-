USE `evaluation`;

--
-- Dumping data for table `user`
--
LOCK TABLES `user` WRITE;
ALTER TABLE `user` DISABLE KEYS;
INSERT INTO `user` VALUES ('aa','aa','aa','aa','2021-01-04 18:25:02','aa@aa.com');
INSERT INTO `user` VALUES ('bb','bb','bb','bb','2021-01-04 18:25:02','bb@bb.com');
INSERT INTO `user` VALUES ('cc','cc','cc','cc','2021-01-04 18:25:02','cc@cc.com');
INSERT INTO `user` VALUES ('dd','dd','dd','dd','2021-01-04 18:25:02','dd@dd.com');
INSERT INTO `user` VALUES ('ee','ee','ee','ee','2021-01-04 18:25:02','ee@ee.com');
INSERT INTO `user` VALUES ('ff','ff','ff','ff','2021-01-04 18:25:02','ff@ff.com');
INSERT INTO `user` VALUES ('gg','gg','gg','gg','2021-01-04 18:25:02','gg@gg.com');
INSERT INTO `user` VALUES ('hh','hh','hh','hh','2021-01-04 18:25:02','hh@hh.com');
INSERT INTO `user` VALUES ('ii','ii','ii','ii','2021-01-04 18:25:02','ii@ii.com');
INSERT INTO `user` VALUES ('jj','jj','jj','jj','2021-02-13 16:25:39','jj@jj.com');
INSERT INTO `user` VALUES ('kk','kk','kk','kk','2021-02-13 16:51:57','kk@kk.com');
INSERT INTO `user` VALUES ('ll','ll','ll','ll','2021-02-13 16:54:11','ll@ll.com');
INSERT INTO `user` VALUES ('zz','zz','zz','zz','2021-01-07 08:02:09','zz@zz.com');
ALTER TABLE `user` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `company`
--
LOCK TABLES `company` WRITE;
ALTER TABLE `company` DISABLE KEYS;
INSERT INTO `company` VALUES ('123456789','A Patrwn','Company_1 A.E.',6986969696,'Aithera',15,'Patra','GR');
INSERT INTO `company` VALUES ('987654321','B Patrwn','Company_2 A.E.',6988888888,'Aithera',16,'Patra','GR');
ALTER TABLE `company` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `degree`
--
LOCK TABLES `degree` WRITE;
ALTER TABLE `degree` DISABLE KEYS;
ALTER TABLE `degree` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `admin`
--
LOCK TABLES `admin` WRITE;
ALTER TABLE `admin` DISABLE KEYS;
INSERT INTO `admin` VALUES ('zz');
ALTER TABLE `admin` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `manager`
--
LOCK TABLES `manager` WRITE;
ALTER TABLE `manager` DISABLE KEYS;
INSERT INTO `manager` VALUES ('hh',10,'123456789');
INSERT INTO `manager` VALUES ('ii',10,'987654321');
ALTER TABLE `manager` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `evaluator`
--
LOCK TABLES `evaluator` WRITE;
ALTER TABLE `evaluator` DISABLE KEYS;
INSERT INTO `evaluator` VALUES ('ff',5,'123456789');
INSERT INTO `evaluator` VALUES ('gg',9,'987654321');
ALTER TABLE `evaluator` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `employee`
--
LOCK TABLES `employee` WRITE;
ALTER TABLE `employee` DISABLE KEYS;
INSERT INTO `employee` VALUES ('aa','Biography_aa','123456789','References_aa','Certificates_aa','Awards_aa');
INSERT INTO `employee` VALUES ('bb','Biography_bb','123456789','References_bb','Certificates_bb','Awards_bb');
INSERT INTO `employee` VALUES ('cc','Biography_cc','123456789','References_cc','Certificates_cc','Awards_cc');
INSERT INTO `employee` VALUES ('dd','Biography_dd','123456789','References_dd','Certificates_dd','Awards_dd');
INSERT INTO `employee` VALUES ('ee','Biography_ee','987654321','References_ee','Certificates_ee','Awards_ee');
INSERT INTO `employee` VALUES ('jj','Biography_jj','987654321','References_jj','Certificates_jj','Awards_jj');
ALTER TABLE `employee` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `job`
--
LOCK TABLES `job` WRITE;
ALTER TABLE `job` DISABLE KEYS;
INSERT INTO `job` VALUES (1,'2020-12-15',2000.0,'Position_1','Location_1','ff','2020-12-01 00:00:00','2020-12-02','open');
INSERT INTO `job` VALUES (2,'2020-12-16',1900.0,'Position_2','Location_2','ff','2020-12-01 00:00:00','2020-12-02','open');
INSERT INTO `job` VALUES (3,'2020-12-16',1900.0,'Position_3','Location_3','gg','2020-12-01 00:00:00','2020-12-02','open');
ALTER TABLE `job` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `evaluationprocess`
--
LOCK TABLES `evaluationprocess` WRITE;
ALTER TABLE `evaluationprocess` DISABLE KEYS;
INSERT INTO `evaluationprocess` VALUES ('aa',1,3,'test',3,'test','hh',1);
INSERT INTO `evaluationprocess` VALUES ('aa',2,3,'test',3,'test','hh',2);
INSERT INTO `evaluationprocess` VALUES ('bb',1,3,'test',2,'test2','hh',0);
INSERT INTO `evaluationprocess` VALUES ('bb',2,4,'test',NULL,NULL,NULL,NULL);
ALTER TABLE `evaluationprocess` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `evaluationresult`
--
LOCK TABLES `evaluationresult` WRITE;
ALTER TABLE `evaluationresult` DISABLE KEYS;
INSERT INTO `evaluationresult` VALUES (1,'aa',1,7,'test');
INSERT INTO `evaluationresult` VALUES (2,'aa',2,8,'test');
INSERT INTO `evaluationresult` VALUES (3,'bb',1,5,'test');
ALTER TABLE `evaluationresult` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `has_degree`
--
LOCK TABLES `has_degree` WRITE;
ALTER TABLE `has_degree` DISABLE KEYS;
ALTER TABLE `has_degree` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `languages`
--
LOCK TABLES `languages` WRITE;
ALTER TABLE `languages` DISABLE KEYS;
ALTER TABLE `languages` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `log`
--
LOCK TABLES `log` WRITE;
ALTER TABLE `log` DISABLE KEYS;
INSERT INTO `log` VALUES (1,'zz','insert','employee','success','2021-02-13 16:29:54');
ALTER TABLE `log` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `subject`
--
LOCK TABLES `subject` WRITE;
ALTER TABLE `subject` DISABLE KEYS;
ALTER TABLE `subject` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `needs`
--
LOCK TABLES `needs` WRITE;
ALTER TABLE `needs` DISABLE KEYS;
ALTER TABLE `needs` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `requestsevaluation`
--
LOCK TABLES `requestsevaluation` WRITE;
ALTER TABLE `requestsevaluation` DISABLE KEYS;
INSERT INTO `requestsevaluation` VALUES ('aa',1);
INSERT INTO `requestsevaluation` VALUES ('aa',2);
INSERT INTO `requestsevaluation` VALUES ('bb',1);
INSERT INTO `requestsevaluation` VALUES ('bb',2);
INSERT INTO `requestsevaluation` VALUES ('cc',1);
INSERT INTO `requestsevaluation` VALUES ('dd',1);
INSERT INTO `requestsevaluation` VALUES ('ee',3);
ALTER TABLE `requestsevaluation` ENABLE KEYS;
UNLOCK TABLES;

--
-- Dumping data for table `project`
--
LOCK TABLES `project` WRITE;
ALTER TABLE `project` DISABLE KEYS;
ALTER TABLE `project` ENABLE KEYS;
UNLOCK TABLES;
