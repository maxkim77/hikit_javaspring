CREATE TABLE EMPLOYEES2
    AS
        SELECT *
          FROM EMPLOYEES;

CREATE TABLE EMPLOYEES3
    AS
        SELECT DEPARTMENT_ID
             , FIRST_NAME
          FROM EMPLOYEES;

DESCRIBE EMPLOYEES3;

SELECT COUNT(*)
  FROM EMPLOYEES3;

CREATE TABLE EMPLOYEES4
    AS
        SELECT *
          FROM EMPLOYEES
         WHERE 1 = 2;

DESCRIBE EMPLOYEES4;

SELECT COUNT(*)
  FROM EMPLOYEES4;

/*직원ID 부서 ID EMPLOYESS TABLE 에서 170이상 180이하*/

DESCRIBE EMPLOYEES;

SELECT EMPLOYEE_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID >= 170 AND EMPLOYEE_ID <= 180;

CREATE TABLE EMPLOYEES5
    AS
        SELECT DEPARTMENT_ID
             , FIRST_NAME
          FROM EMPLOYEES
         WHERE DEPARTMENT_ID > 100;

ALTER TABLE EMPLOYEES5 ADD (
    LOC VARCHAR2(10)
);

ALTER TABLE EMPLOYEES5 ADD (
    LOC2 VARCHAR2(10) DEFAULT '서울'
);

SELECT *
  FROM EMPLOYEES5;

ALTER TABLE EMPLOYEES5 RENAME COLUMN LOC2 TO AREA;

RENAME EMPLOYEES5 TO EMPLOYEES6;

DESC EMPLOYEES6;

SELECT *
  FROM EMPLOYEES6;

ALTER TABLE EMPLOYEES6 MODIFY
    AREA VARCHAR2(20);

DESC EMPLOYEES6;

ALTER TABLE EMPLOYEES6 DROP COLUMN LOC;

TRUNCATE TABLE EMPLOYEES6;

SELECT *
  FROM EMPLOYEES6;

DROP TABLE EMPLOYEES6;

DESC EMPLOYEES;

/*직원테이블에서 모든 칼럼 행 데이터를 조회*/

SELECT *
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , 'VERY GOOD~'
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID  AS EMPNO
     , FIRST_NAME   AS ENAME
  FROM EMPLOYEES;

SELECT FIRST_NAME || ' ' || LAST_NAME
  FROM EMPLOYEES;

SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES;

SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 10;

/*직원테이블에서 연봉이 15000원초과인 FIRST_NAME, SALARY 칼럼 로우를 출력해라*/

SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY > 15000;

SELECT FIRST_NAME
     , SALARY
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE FIRST_NAME = 'Lex';

-- SELECT 3*2/2 FROM DUAL;

SELECT EMPLOYEE_ID  AS 사번
     , FIRST_NAME   AS 이름
  FROM EMPLOYEES;

SELECT FIRST_NAME
     , SALARY
     , HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE = '01/01/13';

SELECT FIRST_NAME
     , SALARY
     , SALARY - 100
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 10;

SELECT FIRST_NAME
     , SALARY
     , SALARY / 12
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 10;

SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
--WHERE SALARY BETWEEN 14000 AND 17000;
 WHERE SALARY >= 14000 AND SALARY <= 17000;

SELECT FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
-- WHERE  FIRST_NAME IN ('NEENA','LEX','JOHN');
 WHERE FIRST_NAME = 'NEENA' OR FIRST_NAME  = 'LEX' OR FIRST_NAME  = 'JOHN';

SELECT FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE 'L_x';
-- 온라인에서는 와일드카드가 첫글자가되서는 안된다.
-- FULL SCAN으로 때리기 때문에
-- DB성능저하

SELECT FIRST_NAME
     , SALARY
     , COMMISSION_PCT
  FROM EMPLOYEES
--WHERE SALARY BETWEEN 13000 AND 15000;
 WHERE COMMISSION_PCT IS NOT NULL;

SELECT FIRST_NAME
     , SALARY
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE SALARY > 13000 OR DEPARTMENT_ID = 80;

SELECT FIRST_NAME
     , SALARY
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 90
 ORDER BY FIRST_NAME;

SELECT FIRST_NAME
     , SALARY
     , DEPARTMENT_ID
     , HIRE_DATE
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 90
 ORDER BY SALARY DESC
        , HIRE_DATE ASC;

-- 중복된 로우를 제거한 합집합 출력

SELECT DEPARTMENT_ID
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 90
UNION
SELECT DEPARTMENT_ID
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 80;

-- UNION ALL이 답이 더 빨리나옴

SELECT DEPARTMENT_ID
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 90
UNION ALL
SELECT DEPARTMENT_ID
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY > 10000 AND DEPARTMENT_ID = 80;

SELECT SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID >= 70
INTERSECT
SELECT SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID < 70;

SELECT SALARY
  FROM EMPLOYEES
MINUS
SELECT SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;


-- 사용자함수를 만들면 DB가 무거워짐, 다른 RDBMS로 바꿨을때 못씀

SELECT LENGTH('이태수')
     , LENGTHB('이태수')
  FROM DUAL;

SELECT SUBSTR('웰컴투오라클', 4, 3)
     , SUBSTRB('웰컴투오라클', 4, 3)
  FROM DUAL;

SELECT SUBSTR('20240820', 5, 4)
  FROM DUAL;

SELECT SUBSTR('20240820', - 4)
  FROM DUAL;

SELECT SUBSTR('20240820', - 4, 4)
  FROM DUAL;

SELECT LENGTH('홍1길2동')
     , LENGTHB('홍1길2동')
  FROM DUAL;

SELECT SUBSTR('홍1길2동', 1, 3)
     , SUBSTRB('홍1길2동', 1, 3)
  FROM DUAL;

SELECT LPAD(FIRST_NAME, 10, '*')
     , RPAD(FIRST_NAME, 10, '*')
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;

SELECT RPAD(SUBSTR('1234567890123', 1, 7), 13, '*')
  FROM DUAL;

SELECT FIRST_NAME
     , LTRIM(FIRST_NAME, 'J')
     , RTRIM(FIRST_NAME, 'l')
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;

SELECT ' 이태수  '
  FROM DUAL;

SELECT RTRIM(LTRIM(' 이태수  ', ' '), '  ')
  FROM DUAL;

SELECT FIRST_NAME
     , REPLACE(FIRST_NAME, SUBSTR(FIRST_NAME, 2, 3), '***')
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;

SELECT SYSDATE
  FROM DUAL;

SELECT SYSDATE
     , MONTHS_BETWEEN(SYSDATE, HIRE_DATE)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 110;

SELECT HIRE_DATE
     , ADD_MONTHS(HIRE_DATE, 7)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 110;

SELECT SYSDATE
     , LAST_DAY(SYSDATE)
  FROM DUAL;

SELECT FIRST_NAME
     , TO_CHAR(SALARY * 12, '$999,999.99')              "SAL"
     , TO_CHAR(HIRE_DATE, 'YYYY.MM.DD HH24:MI:SS')      "HIREDATE"
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 110;

SELECT ENAME
     , HIREDATE
  FROM EMP
 WHERE HIREDATE = TO_DATE('19811203', 'YYYYMMDDHH24MISS');

SELECT ENAME
     , HIREDATE
  FROM EMP
 WHERE TO_CHAR(HIREDATE, 'YYYYMMDDHH24MISS') LIKE '19811203%';

SELECT ENAME
     , HIREDATE
  FROM EMP
 WHERE TO_CHAR(HIREDATE, 'YYYYMMDDHH24MISS') >= '19811203000000' AND TO_CHAR(HIREDATE, 'YYYYMMDDHH24MISS') < '19811204000000';

SELECT ENAME
     , TO_CHAR(HIREDATE, 'YYMMDD') AS HIREDATE
  FROM EMP
 WHERE HIREDATE = '19811203';

SELECT *
  FROM EMPLOYEES;

SELECT ENAME
     , TO_CHAR(HIREDATE, 'YYYYMMDD') "HIREDATE"
  FROM EMP
 WHERE HIREDATE = '19811203';

DESC EMP;
-- 시분초가 안들어가잇다. 시분처가 들어가잇는 경우는 쿼리가 안나옴

INSERT INTO EMP VALUES (
    7300
  , 'MAY'
  , 'SALESMAN'
  , 7900
  , TO_DATE('19811203101010', 'YYYYMMDDHH24MISS')
  , 800.00
  , 30.00
  , 30
);

SELECT ENAME
     , HIREDATE
  FROM EMP
 WHERE HIREDATE >= TO_DATE('19811203', 'YYYYMMDDHH24MISS') AND HIREDATE < TO_DATE('19811204', 'YYYYMMDDHH24MISS');

SELECT ENAME
     , HIREDATE
  FROM EMP
 WHERE EXTRACT(YEAR FROM HIREDATE) = 1981 AND EXTRACT(MONTH FROM HIREDATE)     = 12 AND EXTRACT(DAY FROM HIREDATE)       = 03;

DESC EMPLOYEES;

SELECT SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID >= 70
INTERSECT
SELECT SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID < 70;

-- 날짜중에서는 시분초가 필요하면 date를 쓰는게 정확하지만
-- varchar2를 쓰면 간단한 쿼리로 해당 날짜를 조회할수 있다.

SELECT EMPLOYEE_ID
     , NVL(DEPARTMENT_ID, 99) AS "부서ID"
  FROM EMPLOYEES;

-- nvl 쓰지말고 부서 id 가 null 인 경우 99로 출력

SELECT EMPLOYEE_ID
     , REPLACE(DEPARTMENT_ID, '(NULL)', 99) AS "부서ID"
  FROM EMPLOYEES;

-- UNION 중복된게 확실한게 있는 경우 UNION ALL 을 씀

SELECT EMPLOYEE_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
UNION ALL
SELECT EMPLOYEE_ID
     , 99
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NULL;

SELECT FIRST_NAME
     , DEPARTMENT_ID
     , DECODE(DEPARTMENT_ID, '10', 'Team-1', '20', 'TEAM-2'
     , '30', 'TEAM-3', 'N/A') "TEAM"
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID < 50;

SELECT FIRST_NAME
     , DEPARTMENT_ID
     , CASE DEPARTMENT_ID
    WHEN 10
    THEN 'TEAM-1'
    WHEN 20
    THEN 'TEAM-2'
    WHEN 30
    THEN 'TEAM-3'
    ELSE 'N/A'
END "TEAM"
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID < 50;

SELECT FIRST_NAME
     , DEPARTMENT_ID
     , CASE
    WHEN DEPARTMENT_ID BETWEEN 10 AND 50
    THEN 'TEAM-1'
    WHEN DEPARTMENT_ID BETWEEN 60 AND 100
    THEN 'TEAM-2'
    WHEN DEPARTMENT_ID BETWEEN 110 AND 150
    THEN 'TEAM-3'
    ELSE 'N/A'
END "TEAM"
  FROM EMPLOYEES;


-- COUNT(*)의 결과는 NULL을 포함한 결과이고 
-- COUNT(COMMISION_PCT)는 NULL값을 제외한 결과

SELECT COUNT(*)
     , COUNT(COMMISSION_PCT)
  FROM EMPLOYEES;

SELECT COUNT(*)
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NULL;

SELECT COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES;

SELECT COUNT(*)
     , SUM(SALARY)
     , AVG(SALARY)
  FROM EMPLOYEES;

SELECT COUNT(*)
     , SUM(COMMISSION_PCT)
     , AVG(COMMISSION_PCT)
  FROM EMPLOYEES;

SELECT COUNT(COMMISSION_PCT)
     , SUM(COMMISSION_PCT)
     , AVG(NVL(COMMISSION_PCT, 0))
  FROM EMPLOYEES;

SELECT MAX(SALARY)
     , MIN(SALARY)
     , MAX(HIRE_DATE)
     , MIN(HIRE_DATE)
  FROM EMPLOYEES;

-- 2008-04-21 년도월일로 출력되게

SELECT MAX(SALARY)
     , MIN(SALARY)
     , TO_CHAR(MAX(HIRE_DATE), 'YYYY-MM-DD')         "MAX_DATE"
     , TO_CHAR(MIN(HIRE_DATE), 'YYYY-MM-DD')         AS "MIN_DATE"
  FROM EMPLOYEES;

-- GROUP BY
-- GROUP 마다 집계할 수 있음
-- GROUP BY 할때 ORDER BY 를 씀
-- NULL 은 999가 나오도록 / 0 을 쓴다던지

SELECT NVL(DEPARTMENT_ID, 999) "부서ID"
     , COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES
 GROUP BY NVL(DEPARTMENT_ID, 999)
 ORDER BY NVL(DEPARTMENT_ID, 999);

SELECT DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
        , JOB_ID
 ORDER BY 1
        , 2;


-- 부서별 합계추가

SELECT DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
        , JOB_ID
UNION ALL
SELECT DEPARTMENT_ID || '번 집계'
     , ''
     , COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

SELECT TO_CHAR(DEPARTMENT_ID)     AS "부서ID"
     , JOB_ID                     AS "직업ID"
     , COUNT(*)                   AS "직원수"
     , SUM(SALARY)                AS "총급여"
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
 ORDER BY 1
        , 2;

SELECT DEPARTMENT_ID || '번 집계'   AS DEPARTMENT_ID
     , ''                        AS "직업ID"
     , COUNT(*)                  AS "직원수"
     , SUM(SALARY)               AS "총급여"
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

SELECT TO_CHAR(DEPARTMENT_ID)     AS DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)                   AS 직원수
     , SUM(SALARY)                AS 총급여
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
        , JOB_ID
UNION ALL
SELECT DEPARTMENT_ID || '번 집계'   AS DEPARTMENT_ID
     , ''
     , COUNT(*)                  AS 직원수
     , SUM(SALARY)               AS 총급여
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
 ORDER BY DEPARTMENT_ID
        , CASE
              WHEN JOB_ID = ''
              THEN 1
              ELSE 0
          END
        , -- JOB_ID가 빈 문자열인 행을 정렬에서 뒤로 이동
         JOB_ID;

SELECT NVL(DEPARTMENT_ID, 999)      AS "부서ID"
     , JOB_ID                       AS "직무ID"
     , COUNT(*)                     AS "직원수"
     , SUM(SALARY)                  AS "총급여"
  FROM EMPLOYEES
 GROUP BY NVL(DEPARTMENT_ID, 999)
        , JOB_ID
UNION ALL
SELECT NVL(DEPARTMENT_ID, 999)      AS "부서ID"
     , '부서합계'                       AS "직무ID"
     , COUNT(*)                     AS "직원수"
     , SUM(SALARY)                  AS "총급여"
  FROM EMPLOYEES
 GROUP BY NVL(DEPARTMENT_ID, 999)
        , '부서합계'
 ORDER BY 1
        , 2;

-- 1000 전체합계 추가

SELECT NVL(DEPARTMENT_ID, 999)      AS "부서ID"
     , JOB_ID                       AS "직무ID"
     , COUNT(*)                     AS "직원수"
     , SUM(SALARY)                  AS "총급여"
  FROM EMPLOYEES
 GROUP BY NVL(DEPARTMENT_ID, 999)
        , JOB_ID
UNION ALL
SELECT NVL(DEPARTMENT_ID, 999)      AS "부서ID"
     , '부서합계'                       AS "직무ID"
     , COUNT(*)                     AS "직원수"
     , SUM(SALARY)                  AS "총급여"
  FROM EMPLOYEES
 GROUP BY NVL(DEPARTMENT_ID, 999)
        , '부서합계'
UNION ALL
SELECT 1000            AS "부서ID"
     , '전체합계'          AS "직무ID"
     , COUNT(*)        AS "직무ID"
     , SUM(SALARY)     AS "총급여"
  FROM EMPLOYEES
 GROUP BY 1000
        , '전체합계'
 ORDER BY 1
        , 2;


-- ROLLUP

SELECT NVL(DEPARTMENT_ID, 999)      AS "부서ID"
     , JOB_ID                       AS "직무ID"
     , COUNT(*)                     AS "직원수"
     , SUM(SALARY)                  AS "총급여"
  FROM EMPLOYEES
 GROUP BY ROLLUP(NVL(DEPARTMENT_ID, 999)
        , JOB_ID);

-- GROUP BY  HAVING

SELECT DEPARTMENT_ID
     , COUNT(*)
     , SUM(SALARY)
  FROM EMPLOYEES
HAVING SUM(SALARY) > 20000
GROUP BY DEPARTMENT_ID;

DESC EMPLOYEES6;
SELECT * FROM EMPLOYEES6;

CREATE TABLE EMPLOYEES6 
AS SELECT * FROM EMPLOYEES
WHERE 1=2;


DESC EMPLOYEES;

DROP TABLE EMPLOYEES6;

CREATE TABLE EMPLOYEES6(DEPARTMENT_ID NUMBER(4)
                       ,FIRST_NAME    VARCHAR2(30)
                       ,AREA          VARCHAR2(30));
                       
DESC EMPLOYEES6;

INSERT INTO EMPLOYEES6 VALUES(9000,'JAMES','SEOUL');
INSERT INTO EMPLOYEES6 VALUES(9001,'JOHN','BUSAN');

COMMIT;

SELECT * FROM EMPLOYEES6;

INSERT INTO EMPLOYEES6(DEPARTMENT_ID, FIRST_NAME)
VALUES (9002,'SUSAN');
COMMIT;

CREATE TABLE EMPLOYEES7
AS 
SELECT DEPARTMENT_ID, FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE 1=2;

INSERT INTO EMPLOYEES7(DEPARTMENT_ID, FIRST_NAME, HIRE_DATE)
VALUES(5001,'박동주',TO_DATE('2011-11-14','YYYY-MM-DD'));
COMMIT;

-- 온라인에서는 insert select 중첩문 쓰면 안됨
-- 배치 프로그램에서는 가능
INSERT INTO EMPLOYEES7
SELECT DEPARTMENT_ID, FIRST_NAME,HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID>=100;
COMMIT;
--SYSDATE
UPDATE EMPLOYEES7
SET HIRE_DATE=SYSDATE
WHERE DEPARTMENT_ID=110;
COMMIT;


SELECT    DEPARTMENT_ID "ID"
        , FIRST_NAME "NAME"
        , TO_CHAR(HIRE_DATE,'YYYY.MM.DD HH24:MI:SS') "DATE" 
FROM EMPLOYEES7;

-- 00시00분00초로 바꾸는 쿼리문
UPDATE EMPLOYEES7
SET HIRE_DATE = TO_DATE(000000,'HH24MISS')
WHERE DEPARTMENT_ID=110;

UPDATE EMPLOYEES7
SET HIRE_DATE = TO_DATE(TO_CHAR(HIRE_DATE, 'YYYYMMDD'), 'YYYYMMDD')
WHERE DEPARTMENT_ID = 110;

SELECT * FROM EMPLOYEES7;

DESC EMPLOYEES7;

UPDATE EMPLOYEES7
SET    HIRE_DATE = TO_DATE(000000,'HH24MISS')
WHERE  DEPARTMENT_ID = 110;
-- DATE 타입을 넣을때 포맷을 안 넣는다.
UPDATE EMPLOYEES7
SET HIRE_DATE = TO_DATE(TO_CHAR(HIRE_DATE, 'YYYYMMDD'), 'YYYYMMDD')
WHERE DEPARTMENT_ID = 110;

COMMIT;

SELECT * FROM EMPLOYEES7;

--key 부분은 update 하는 것이 아니라 drop 시키고 새로운 table 을 만든다

-- 온라인에서는 프라이머리키 조건을 넣어야한다.
-- 외래키 조건은 배치 에서 할 수 있다.

DELETE FROM EMPLOYEES7
WHERE DEPARTMENT_ID = 110;

COMMIT;

-- 삭제 처리하지 않고 칼럼 하나 더추가해서 상태로 관리한다.

CREATE TABLE EMPLOYEES9
( NO NUMBER(4)
     CONSTRAINT EMP9_NO_PK PRIMARY KEY,
  NAME VARCHAR2(10)
     CONSTRAINT EMP9_NAME_NN NOT NULL,
  JUMIN VARCHAR2(13)
     CONSTRAINT EMP9_JUMIN_NN NOT NULL
     CONSTRAINT EMP9_JUMIN_UK UNIQUE,
  AREA NUMBER(1)
     CONSTRAINT EMP9_AREA_CK CHECK(AREA<5),
  DEPTNO NUMBER(4)
    CONSTRAINT EMP_DEPTNO_FK REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

DESC DEPARTMENTS;

ALTER TABLE DEPARTMENTS
ADD CONSTRAINT DEPT_DEPT_ID_PK PRIMARY KEY(DEPARTMENT_ID);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, STATUS
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMPLOYEES9';

CREATE TABLE EMPLOYEES10
( NO NUMBER(4) PRIMARY KEY, NAME VARCHAR2(10) NOT NULL
, JUMIN   VARCHAR2(13) NOT NULL UNIQUE
    , AREA    NUMBER(1) CHECK ( AREA < 5 )
    , DEPTNO  NUMBER(4)
        REFERENCES DEPARTMENTS ( DEPARTMENT_ID )
);
INSERT INTO EMPLOYEES10 VALUES (
    123
  , 'HONG'
  , NULL
  , 6
  , 999
);

INSERT INTO EMPLOYEES10 VALUES (
    123
  , 'HONG'
  , '333'
  , 6
  , 999
);

INSERT INTO EMPLOYEES10 VALUES (
    123
  , 'HONG'
  , '333'
  , 3
  , 999
);
 
 /* subquery
 nested query
  상수가 아닌 값들을 조건을 걸때
  예로들어서 칼럼안에 상수가 아닌 값으로 조건을 걸때
  해당 값이 계속 변할 수 있기때문에
 */

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY = (
    SELECT SALARY
      FROM EMPLOYEES
     WHERE FIRST_NAME = 'Donald'
);

SELECT *
  FROM EMPLOYEES
 WHERE FIRST_NAME = 'Donald';
-- pk로 조건을 잡지않아서, 데이터가 중복 된게 나올 수 있기때문

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY < (
    SELECT MIN(SALARY)
      FROM EMPLOYEES
     WHERE FIRST_NAME = 'Alexander'
);
         
         
-- 단건조회서브쿼리 : 조회의 결과가 한건 다중조회
-- ex) pk로 걸었을때
-- 데이터가 없거나 잇거나 한건
-- 다건조회서브쿼리 : 여러건 조회


SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY = (
    SELECT SALARY
      FROM EMPLOYEES
     WHERE FIRST_NAME = 'Donald'
) AND FIRST_NAME != 'Donald';

/* SubQuery 
employees 테이블에서 donald 사원과 입사일이 동일하거나 늦게 입사한 사원들의
값을 출력하기
*/   
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , HIRE_DATE
FROM   EMPLOYEES
WHERE  HIRE_DATE >= 
     (SELECT HIRE_DATE
      FROM   EMPLOYEES
      WHERE  FIRST_NAME = 'Donald'
);
DESC EMPLOYEES;
SELECT * FROM EMPLOYEES WHERE FIRST_NAME LIKE '%Alexander';

/* 서브 쿼리 리모델링
 hiredate 리모델링*/
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , HIRE_DATE
FROM   EMPLOYEES
WHERE  HIRE_DATE >= 
     (SELECT TO_DATE(TO_CHAR(MIN(HIRE_DATE), 'YYYYMMDD'), 'YYYYMMDD')
      FROM   EMPLOYEES
      WHERE  FIRST_NAME = 'Donald')
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , HIRE_DATE
FROM   EMPLOYEES
WHERE  HIRE_DATE >= 
     (SELECT TO_DATE(TO_CHAR(MIN(HIRE_DATE), 'YYYYMMDD'), 'YYYYMMDD')
      FROM   EMPLOYEES
      WHERE  FIRST_NAME = 'Donald')
;
-- 이 회사가 1990 1월 1일 문을 염
-- 전산시스템 2000년도에 구축
-- 직원이 그전에 이미 있는 사람
-- 직원 테이블 이 있는데 입사일자가 없다.
-- hire_date null일 수 잇다.
-- donald가 널일 수 잇다.
-- 1990년 1월 1일로, 널이면
-- 여기 쿼리 기반으로

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , NVL(HIRE_DATE,TO_DATE(19900101,'YYYYMMDD'))
FROM   EMPLOYEES
WHERE  HIRE_DATE >= 
     (SELECT TO_DATE(TO_CHAR(MIN(HIRE_DATE), 'YYYYMMDD'), 'YYYYMMDD')
      FROM   EMPLOYEES
      WHERE  FIRST_NAME = 'Donald')
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , NVL(HIRE_DATE, TO_DATE(19900101, 'YYYYMMDD'))
  FROM EMPLOYEES
 WHERE HIRE_DATE >= (
    SELECT TO_DATE(TO_CHAR(MIN(NVL(HIRE_DATE, TO_DATE('19900101', 'YYYYMMDD'))), 'YYYYMMDD'), 'YYYYMMDD')
      FROM EMPLOYEES
     WHERE FIRST_NAME = 'Donald'
);
SELECT EMPLOYEE_ID,
       FIRST_NAME,
       SALARY,
       HIRE_DATE
  FROM EMPLOYEES
 WHERE NVL(HIRE_DATE, TO_DATE('19900101', 'YYYYMMDD')) >= (
    SELECT TO_DATE(
               TO_CHAR(
                   MIN(
                       NVL(HIRE_DATE, TO_DATE('19900101', 'YYYYMMDD'))
                   ), 
                   'YYYYMMDD'
               ), 
               'YYYYMMDD'
           )
      FROM EMPLOYEES
     WHERE FIRST_NAME = 'Donald'
);

-- 평균구할때 NVL 0써서 처리하기

SELECT FIRST_NAME, SALARY
FROM   EMPLOYEES
WHERE  SALARY > (SELECT AVG(NVL(SALARY,0))
                FROM EMPLOYEES
                WHERE DEPARTMENT_ID = 100);
                
                SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY> ALL (SELECT SALARY
                  FROM EMPLOYEES
                  WHERE DEPARTMENT_ID = 110);

SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY> ALL (SELECT SALARY
                   FROM EMPLOYEES
                   WHERE DEPARTMENT_ID = 110);
                   
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY < ANY (SELECT SALARY
                   FROM EMPLOYEES
                   WHERE DEPARTMENT_ID = 110);               

SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY   >   (SELECT MAX(SALARY)
                   FROM EMPLOYEES
                   WHERE DEPARTMENT_ID = 110)
                   ;
                   
                   
SELECT * FROM DEPT
WHERE EXISTS (SELECT *
              FROM EMP
            WHERE DEPTNO=10);
            
            
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
FROM   EMPLOYEES
WHERE  (DEPARTMENT_ID,SALARY) IN (SELECT DEPARTMENT_ID,
                                  MAX(SALARY)
                                  FROM EMPLOYEES
                                  GROUP BY DEPARTMENT_ID)
ORDER BY 1;

SELECT * FROM DEPARTMENTS;

SELECT FIRST_NAME "사원이름", (SELECT DEPARTMENT_NAME
                              FROM  DEPARTMENTS D
                              WHERE E.DEPARTMENT_ID=D.DEPARTMENT_ID) "부서이름"
FROM EMPLOYEES E;

-- DEPARTMENTS 조회
-- 1800번 지역ID의  
-- 근무하는 직원명단 FIRST NAME LASTNAME

SELECT FIRST_NAME
     , LAST_NAME
FROM   EMPLOYEES
WHERE DEPARTMENT_ID
IN

( SELECT DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE LOCATION_ID = 1800
);


-- 이메일아이디 인덱스로 uniuqe로 줄수잇다.

-- desc를 걸어서 인덱싱하면 더 빠른 경우가 잇다.

-- 인덱스하면서 값이 바뀌면 오히려 시간이 더 걸릴수잇다.

SELECT TABLE_NAME
     , INDEX_NAME
  FROM USER_INDEXES
 WHERE TABLE_NAME = 'DEPARTMENTS';

--  PK는 저절로 인덱스가 만들어짐
-- LOCATION IX가 인덱스

CREATE INDEX IDX_DEPARTMENTS_DNAME 
ON    DEPARTMENTS (
        DEPARTMENT_NAME
    );
    
DROP INDEX IDX_DEPARTMENTS_DNAME;




-- null 이발생하는 곳에 표시한다. 오라클 전통 기법
SELECT *
  FROM SUBJECT  B
  LEFT OUTER JOIN STUDENT  S ON B.SUBJECT_ID = S.SUBJECT_ID;

SELECT *
  FROM SUBJECT  B
     , STUDENT  S
 WHERE B.SUBJECT_ID = S.SUBJECT_ID (+);








