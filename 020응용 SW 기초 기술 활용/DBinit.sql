--C:\>SQLPLUS / AS SYSDBA

ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
ALTER PROFILE DEFAULT LIMIT PASSWORD_LIFE_TIME UNLIMITED;
ALTER USER SYSTEM IDENTIFIED BY "123456";
ALTER USER SYSTEM ACCOUNT UNLOCK;
EXIT;

--C:\>SQLPLUS SYSTEM/123456
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

DROP USER HR CASCADE;
CREATE USER HR IDENTIFIED BY HR
DEFAULT TABLESPACE USERS  QUOTA UNLIMITED ON USERS
TEMPORARY TABLESPACE TEMP;
ALTER USER HR ACCOUNT UNLOCK;
GRANT CREATE VIEW, CONNECT, RESOURCE TO HR;

DROP USER STUDY CASCADE;
CREATE USER STUDY IDENTIFIED BY 123456
DEFAULT TABLESPACE USERS  QUOTA UNLIMITED ON USERS
TEMPORARY TABLESPACE TEMP;
ALTER USER STUDY ACCOUNT UNLOCK;
GRANT CREATE VIEW, CONNECT, RESOURCE TO STUDY;

					DROP USER DEV CASCADE;
					CREATE USER DEV IDENTIFIED BY 123456
					DEFAULT TABLESPACE USERS  QUOTA UNLIMITED ON USERS
					TEMPORARY TABLESPACE TEMP;
					ALTER USER DEV ACCOUNT UNLOCK;
					GRANT CREATE VIEW, CONNECT, RESOURCE TO DEV;

SELECT USERNAME FROM ALL_USERS;
EXIT;					

--C:\>imp userid=system/123456 FROMUSER=HR TOUSER=HR file=EXP20240813HrStudyDev18c.DMP
--C:\>imp userid=system/123456 FROMUSER=STUDY TOUSER=STUDY file=EXP20240813HrStudyDev18c.DMP
					--C:\>imp userid=system/123456 FROMUSER=DEV TOUSER=DEV file=EXP20240813HrStudyDev18c.DMP



					index 재생성 쿼리 일괄생성

					SELECT
						'ALTER INDEX ' || OWNER || '.' || INDEX_NAME || ' REBUILD;' AS STMT
					FROM ALL_INDEXES
					WHERE 1 = 1
					AND OWNER = 'STUDY'
					AND STATUS = 'UNUSABLE'
					;
