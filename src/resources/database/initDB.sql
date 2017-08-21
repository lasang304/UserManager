CREATE TABLE usermanager.users (
  ID INT NOT NULL AUTO_INCREMENT,
  USER_FULL_NAME VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID));
CREATE TABLE usermanager.equipment (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(255) NOT NULL,
  S_N VARCHAR(255) NOT NULL ,
  SPECIFICATIONS VARCHAR(255) NOT NULL ,
  TYPE VARCHAR(255) NOT NULL ,
  OWNER_ID INT NOT NULL ,
  PRIMARY KEY (ID));