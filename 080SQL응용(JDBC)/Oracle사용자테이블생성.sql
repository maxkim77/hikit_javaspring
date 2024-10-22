사용자 생성
    command 창에서 
	sqlplus system/123456
	ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
	DROP USER DEV CASCADE;
	CREATE USER DEV IDENTIFIED BY 123456
	DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS
	TEMPORARY TABLESPACE TEMP;
	ALTER USER DEV ACCOUNT UNLOCK;
	GRANT CONNECT, RESOURCE TO DEV;
	exit;
---------------------------------------------------------
테이블 생성
    command 창에서 
	sqlplus dev/123456

CREATE TABLE CUSTOMER(
    CODE   NUMBER(3)     PRIMARY KEY
  , NAME   VARCHAR2(30)  NOT NULL
  , EMAIL  VARCHAR2(30)	 NOT NULL
  , TEL    VARCHAR2(35)	 NOT NULL
  , WEIGHT NUMBER(4,1)	 NOT NULL
);
-----------------------------------------------------------
INSERT INTO CUSTOMER VALUES (
     1, '강지아', 'JEEA@SHOP.COM', '02-137-1484', 51.2);
INSERT INTO CUSTOMER VALUES (
     2, '이장미', 'ROSE@SHOP.COM', '02-523-8715', 52.2);
INSERT INTO CUSTOMER VALUES (
     3, '김백합', 'LILY@SHOP.COM', '02-789-2359', 53.2);
INSERT INTO CUSTOMER VALUES (
     4, '홍길순', 'IMLEE@GMAIL.COM', '02-523-1234', 54.2);
INSERT INTO CUSTOMER VALUES (
     5, '홍길동', 'imhong@GMAIL.COM', '02-555-1234', 65.1);
INSERT INTO CUSTOMER VALUES (
     6, '가길동', 'imhong@GMAIL.COM', '02-555-1234', 66.1);
INSERT INTO CUSTOMER VALUES (
    16, '나길동', 'imhong@GMAIL.COM', '02-555-1234', 67.1);
INSERT INTO CUSTOMER VALUES (
    26, '다길동', 'imhong@GMAIL.COM', '02-555-1234', 68.1);
INSERT INTO CUSTOMER VALUES (
    36, '라길동', 'imhong@GMAIL.COM', '02-555-1234', 69.1);
INSERT INTO CUSTOMER VALUES (
    46, '마길동', 'imhong@GMAIL.COM', '02-555-1234', 70.1);
INSERT INTO CUSTOMER VALUES (
    56, '바길동', 'imhong@GMAIL.COM', '02-555-1234', 71.1);
INSERT INTO CUSTOMER VALUES (
    66, '사길동', 'imhong@GMAIL.COM', '02-555-1234', 72.1);
INSERT INTO CUSTOMER VALUES (
    76, '아길동', 'imhong@GMAIL.COM', '02-555-1234', 73.1);
COMMIT;

 